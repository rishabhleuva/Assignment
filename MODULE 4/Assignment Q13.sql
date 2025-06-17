DELIMITER //

CREATE PROCEDURE GetEmployeesByDepartment(IN dept INT)
BEGIN
    SELECT * FROM employees
    WHERE dept_id = dept;
END //

DELIMITER ;
CALL GetEmployeesByDepartment(2);
DELIMITER //

CREATE PROCEDURE GetCourseDetails(IN cid INT)
BEGIN
    SELECT * FROM courses
    WHERE course_id = cid;
END //

DELIMITER ;
CALL GetCourseDetails(101);
