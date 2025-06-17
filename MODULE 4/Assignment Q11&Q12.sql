CREATE TABLE departments (
    dept_id INT PRIMARY KEY,
    dept_name VARCHAR(50) NOT NULL
);
CREATE TABLE employees (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(50) NOT NULL,
    dept_id INT,
    FOREIGN KEY (dept_id) REFERENCES departments(dept_id)
);
INSERT INTO departments (dept_id, dept_name) VALUES
(1, 'HR'),
(2, 'Finance'),
(3, 'Engineering');

INSERT INTO employees (emp_id, emp_name, dept_id) VALUES
(101, 'Alice', 1),
(102, 'Bob', 2),
(103, 'Charlie', 3);

select * from departments;

select * from employees;

SELECT e.emp_id, e.emp_name, d.dept_name FROM employees e INNER JOIN departments d ON e.dept_id = d.dept_id;

SELECT d.dept_id, d.dept_name,e.emp_name FROM departments d LEFT JOIN employees e ON d.dept_id = e.dept_id;

ALTER TABLE employees ADD salary INT;
UPDATE employees SET salary = 45000 WHERE emp_id = 101;
UPDATE employees SET salary = 50000 WHERE emp_id = 102;
UPDATE employees SET salary = 60000 WHERE emp_id = 103;

SELECT dept_id, COUNT(*) AS employee_count FROM employees GROUP BY dept_id;
SELECT dept_id, AVG(salary) AS average_salary FROM employees GROUP BY dept_id;

