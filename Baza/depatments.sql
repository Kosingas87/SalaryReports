
CREATE TABLE departments (
    dept_no       INT  PRIMARY KEY   GENERATED ALWAYS AS IDENTITY (START WITH 1,  INCREMENT BY 1)  NOT NULL  ,
    dept_name   VARCHAR(40)     NOT NULL

);