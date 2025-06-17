create schema school_db;
create table students
(
	student_id INT NOT NULL UNIQUE,
    student_name VARCHAR(50) NOT NULL,
    Age INT NOT NULL,
    CLASS VARCHAR(5) NOT NULL,
    ADDRESS VARCHAR(100) NOT NULL
);

INSERT INTO students (student_id, student_name, Age, CLASS, ADDRESS) VALUES
(1, 'Ravi Kumar', 16, '10A', '123 MG Road, Delhi'),
(2, 'Sneha Mehta', 15, '9B', '45 Park Street, Mumbai'),
(3, 'Amit Shah', 17, '11C', '78 Green Avenue, Ahmedabad'),
(4, 'Priya Verma', 14, '8A', '67 Residency Road, Jaipur'),
(5, 'Karan Singh', 16, '10B', '12 Civil Lines, Lucknow');
	
SELECT * from students;

SELECT student_name, age FROM students;
SELECT * FROM students WHERE age > 10;
