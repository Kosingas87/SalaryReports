
                     
CREATE TABLE departments (
    dept_no       INT  PRIMARY KEY   GENERATED ALWAYS AS IDENTITY (START WITH 1,  INCREMENT BY 1)  NOT NULL  ,
    dept_name   VARCHAR(40)     NOT NULL

);
CREATE TABLE employees (
    emp_no      INT  PRIMARY KEY   GENERATED ALWAYS AS IDENTITY (START WITH 1,  INCREMENT BY 1)  NOT NULL     ,
    birth_date  DATE            NOT NULL,
    first_name  VARCHAR(20)     NOT NULL,
    last_name  VARCHAR(20)     NOT NULL,
        gender      VARCHAR(1) NOT NULL CHECK (gender IN('M', 'F')),    
    hire_date   DATE            NOT NULL
   );
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
CREATE TABLE dept_manager (
   detp_manager_no INT  PRIMARY KEY   GENERATED ALWAYS AS IDENTITY (START WITH 1,  INCREMENT BY 1)  NOT NULL  ,
   emp_no       INT    NOT NULL,
   dept_no      INT         NOT NULL,
   from_date    DATE            NOT NULL,
   to_date      DATE            NOT NULL,
     CONSTRAINT FK_DeptManager1 FOREIGN KEY (emp_no)
   REFERENCES employees(emp_no) ON DELETE CASCADE,
CONSTRAINT FK_DeptManager2 FOREIGN KEY (dept_no)
   REFERENCES departments (dept_no) ON DELETE CASCADE
); 

   CREATE TABLE salaries (
   salaries_no INT  PRIMARY KEY   GENERATED ALWAYS AS IDENTITY (START WITH 1,  INCREMENT BY 1)  NOT NULL  ,
   emp_no       INT    NOT NULL,
   salary      VARCHAR(50)     NOT NULL,
    from_date   DATE            NOT NULL,
    to_date     DATE  NOT NULL,
     CONSTRAINT FK_Salary1 FOREIGN KEY (emp_no)
   REFERENCES employees(emp_no) ON DELETE CASCADE
); 
CREATE TABLE titles (
   titles_no INT  PRIMARY KEY   GENERATED ALWAYS AS IDENTITY (START WITH 1,  INCREMENT BY 1)  NOT NULL  ,
   emp_no       INT    NOT NULL,
   title       VARCHAR(50)     NOT NULL,
    from_date   DATE            NOT NULL,
    to_date     DATE,
     CONSTRAINT FK_Title1 FOREIGN KEY (emp_no)
   REFERENCES employees(emp_no) ON DELETE CASCADE
); 