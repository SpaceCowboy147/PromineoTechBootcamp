
DELIMITER // 

CREATE PROCEDURE namesStartingWithB()
BEGIN
SELECT first_name FROM employees
WHERE first_name LIKE 'B%';
END// 
delimiter ; 
call namesStartingWithB();

DELIMITER //
-- will grab every employees name born after May 1960
CREATE PROCEDURE Emps_bornAfterMay1960()
BEGIN
SELECT first_name, last_name, birth_date FROM employees
WHERE birth_date > '1960-05-01';
END//
DELIMITER ;
call Emps_bornAfterMay1960();

DELIMITER //
CREATE PROCEDURE hiredBetweenDates()
BEGIN
SELECT first_name, last_name, hire_date
FROM employees
WHERE hire_date BETWEEN '1990-01-01' AND '1999-12-31';
END// 
DELIMITER ;
CALL hiredBetweenDates();

DELIMITER //	
CREATE PROCEDURE salariesAbove60000()
BEGIN 
SELECT emp_no, salary FROM salaries
where salary > 60000; 
END// 
DELIMITER ;
CALL salariesAbove60000();

DELIMITER //
CREATE PROCEDURE employeetitle()
begin
SELECT e.first_name, e.last_name, t.title 
FROM employees e
INNER JOIN titles t  ON e.emp_no = t.emp_no;

SELECT * FROM employee_title;
END//
DELIMITER ;
call employeetitle();



