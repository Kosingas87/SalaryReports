CREATE TABLE employees (
    emp_no      INT  PRIMARY KEY   GENERATED ALWAYS AS IDENTITY (START WITH 1,  INCREMENT BY 1)  NOT NULL     ,
    birth_date  DATE            NOT NULL,
    first_name  VARCHAR(20)     NOT NULL,
        gender      VARCHAR(1) NOT NULL CHECK (gender IN('M', 'F')),    
    hire_date   DATE            NOT NULL
   );