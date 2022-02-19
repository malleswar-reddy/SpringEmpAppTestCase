CREATE TABLE IF NOT EXISTS Employee_data (
   id INT NOT NULL,
   last_name VARCHAR(50),
   first_name VARCHAR(20),
   salary INT,
   department VARCHAR(50)
);


INSERT INTO Employee_data VALUES ( 1 , 'Davolio','Nancy',3500,'Marketing');
INSERT INTO Employee_data VALUES ( 2 , 'Fuller','Andrew',2500,'Sales');
INSERT INTO Employee_data VALUES ( 3 , 'Leverling','Janet',2500,'Sales');
INSERT INTO Employee_data VALUES ( 4 , 'Peacock','Margaret',5500,'Marketing');
INSERT INTO Employee_data VALUES ( 5 , 'Buchanan','Steven',7500,'Admin');
INSERT INTO Employee_data VALUES ( 6 , 'Suyama','Michael',6000,'Maintenance');