INSERT INTO courses (course_id, course_name, course_duration)
VALUES 
(101, 'Database Systems', '3 Months'),
(102, 'Computer Networks', '4 Months'),
(103, 'Operating Systems', '3.5 Months');

UPDATE courses SET course_duration = '5 Months' WHERE course_id = 102;

DELETE FROM courses WHERE course_id = 103;

SELECT * FROM courses;
SELECT * FROM courses ORDER BY course_duration DESC;
SELECT * FROM courses LIMIT 2;
