DECLARE
  CURSOR emp_cursor IS SELECT emp_id, emp_name, salary FROM employees;
  v_id employees.emp_id%TYPE;
  v_name employees.emp_name%TYPE;
  v_salary employees.salary%TYPE;
BEGIN
  OPEN emp_cursor;
  LOOP
    FETCH emp_cursor INTO v_id, v_name, v_salary;
    EXIT WHEN emp_cursor%NOTFOUND;
    DBMS_OUTPUT.PUT_LINE('ID: ' || v_id || ', Name: ' || v_name || ', Salary: ' || v_salary);
  END LOOP;
  CLOSE emp_cursor;
END;


DECLARE
  CURSOR course_cursor IS SELECT course_id, course_name, course_duration FROM courses;
  v_id courses.course_id%TYPE;
  v_name courses.course_name%TYPE;
  v_duration courses.course_duration%TYPE;
BEGIN
  OPEN course_cursor;
  LOOP
    FETCH course_cursor INTO v_id, v_name, v_duration;
    EXIT WHEN course_cursor%NOTFOUND;
    DBMS_OUTPUT.PUT_LINE('Course ID: ' || v_id || ', Name: ' || v_name || ', Duration: ' || v_duration);
  END LOOP;
  CLOSE course_cursor;
END;
