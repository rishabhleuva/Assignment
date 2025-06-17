CREATE TABLE teachers (
    teacher_id INT PRIMARY KEY,
    teacher_name VARCHAR(50) NOT NULL,
    subject VARCHAR(30) NOT NULL,
    email VARCHAR(100) UNIQUE
);

ALTER TABLE students ADD teacher_id INT;
ALTER TABLE students ADD CONSTRAINT fk_teacher FOREIGN KEY (teacher_id) REFERENCES teachers(teacher_id);
