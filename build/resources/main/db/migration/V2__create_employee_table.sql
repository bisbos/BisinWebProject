CREATE TABLE employee (
  empid INTEGER (10) NOT NULL,
  empname VARCHAR (255) NOT NULL,
  salary INTEGER (10),
  companyid INTEGER (10) NOT NULL,
  userid  varbinary(8196),
  PRIMARY KEY (empid),
  CONSTRAINT fk_employee FOREIGN KEY (companyid)
   REFERENCES company(id) ON DELETE CASCADE
);