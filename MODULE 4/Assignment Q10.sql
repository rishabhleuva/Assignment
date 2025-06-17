INSERT INTO courses (course_id, course_name, course_duration)
VALUES 
(104, 'Web Development', '4 Months'),
(105, 'Data Structures', '3 Months');

COMMIT;

INSERT INTO courses (course_id, course_name, course_duration)
VALUES 
(106, 'Python Programming', '2 Months'),
(107, 'AI Basics', '2.5 Months');

ROLLBACK;

SAVEPOINT before_;

UPDATE courses
SET course_duration = '6 Months'
WHERE course_id = 104;

ROLLBACK TO before_;

COMMIT;