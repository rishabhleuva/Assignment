
INSERT INTO courses (course_id, course_name, course_duration) 
VALUES (201, 'Cloud Computing', '3 Months');

SAVEPOINT sp_before_extra;

INSERT INTO courses (course_id, course_name, course_duration) 
VALUES (202, 'Ethical Hacking', '2 Months');

ROLLBACK TO sp_before_extra;

COMMIT;


INSERT INTO courses (course_id, course_name, course_duration) 
VALUES (203, 'DevOps', '3 Months');

INSERT INTO courses (course_id, course_name, course_duration) 
VALUES (204, 'Blockchain Basics', '2 Months');

SAVEPOINT sp_devops_done;

INSERT INTO courses (course_id, course_name, course_duration) 
VALUES (205, 'Quantum Computing', '4 Months');

ROLLBACK;

SELECT * FROM courses WHERE course_id IN (203, 204, 205);
