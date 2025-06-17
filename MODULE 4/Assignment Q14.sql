CREATE VIEW employee_department_view AS SELECT e.emp_id,e.emp_name,e.salary,d.dept_name FROM employees e JOIN departments d ON e.dept_id = d.dept_id;

CREATE VIEW employee_department_view AS SELECT e.emp_id,e.emp_name,e.salary,d.dept_name FROM employees e JOIN departments d ON e.dept_id = d.dept_id WHERE e.salary >= 50000;

SELECT * FROM employee_department_view;
