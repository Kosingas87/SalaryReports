CREATE TABLE dept_emp (
   detp_emp_no INT  PRIMARY KEY   GENERATED ALWAYS AS IDENTITY (START WITH 1,  INCREMENT BY 1)  NOT NULL  ,
   emp_no       INT    NOT NULL,
   dept_no      INT         NOT NULL,
   from_date    DATE            NOT NULL,
   to_date      DATE            NOT NULL,
     CONSTRAINT FK_DeptEmp1 FOREIGN KEY (emp_no)
   REFERENCES employees(emp_no) ON DELETE CASCADE,
CONSTRAINT FK_DeptEmp2 FOREIGN KEY (dept_no)
   REFERENCES departments (dept_no) ON DELETE CASCADE
); 