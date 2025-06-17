DECLARE
  v_dept_id employees.dept_id%TYPE;
BEGIN
  SELECT dept_id INTO v_dept_id FROM employees WHERE emp_id = 101;

  IF v_dept_id = 2 THEN
    DBMS_OUTPUT.PUT_LINE('Employee belongs to Finance department.');
  END IF;
END;

