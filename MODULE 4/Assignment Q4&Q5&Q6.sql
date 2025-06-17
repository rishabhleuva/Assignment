CREATE TABLE courses (
    course_id INT PRIMARY KEY,
    course_name VARCHAR(100),
    course_credits INT
);
CREATE schema university_db;

ALTER TABLE courses ADD course_duration VARCHAR(50);
ALTER TABLE courses DROP COLUMN course_credits;
DROP TABLE teachers;
DROP TABLE students;
SHOW TABLES;