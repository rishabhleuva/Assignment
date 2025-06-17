CREATE USER 'user1'@'localhost' IDENTIFIED BY 'password1';
CREATE USER 'user2'@'localhost' IDENTIFIED BY 'password2';
GRANT SELECT ON school_db.courses TO 'user1'@'localhost';


REVOKE INSERT ON school_db.courses FROM 'user1'@'localhost';

GRANT INSERT ON school_db.courses TO 'user2'@'localhost';
