CREATE TABLE employee_log
 (log_id INT AUTO_INCREMENT PRIMARY KEY,
 emp_id INT, action VARCHAR(50), 
 log_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP);



CREATE TRIGGER log_insert 
AFTER INSERT ON employees 
FOR EACH ROW 
INSERT INTO employee_log(emp_id, action) VALUES (NEW.emp_id, 'Inserted');

CREATE TRIGGER update_timestamp 
BEFORE UPDATE ON employees 
FOR EACH ROW SET NEW.last_modified = CURRENT_TIMESTAMP;
