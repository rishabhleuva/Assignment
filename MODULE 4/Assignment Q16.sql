DECLARE
  total_employees NUMBER;
BEGIN
  SELECT COUNT(*) INTO total_employees FROM employees;
  DBMS_OUTPUT.PUT_LINE('Total Employees: ' || total_employees);
END;

DECLARE
  total_employees NUMBER;
BEGIN
  SELECT COUNT(*) INTO total_employees FROM employees;
  DBMS_OUTPUT.PUT_LINE('Total Employees: ' || total_employees);
END;


