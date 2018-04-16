CREATE TABLE salaries (
   salaries_no INT  PRIMARY KEY   GENERATED ALWAYS AS IDENTITY (START WITH 1,  INCREMENT BY 1)  NOT NULL  ,
   emp_no       INT    NOT NULL,
   salary      VARCHAR(50)     NOT NULL,
    from_date   DATE            NOT NULL,
    to_date     DATE  NOT NULL,
     CONSTRAINT FK_Salary1 FOREIGN KEY (emp_no)
   REFERENCES employees(emp_no) ON DELETE CASCADE
); 