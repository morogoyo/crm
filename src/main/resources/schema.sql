
CREATE TABLE customers(
  id int NOT NULL AUTO_INCREMENT ,
  f_name varchar(50),
  l_name varchar(50),
  gender varchar(50),
  address varchar(50),
  email varchar(50),
  profession varchar(50),
  mobile_number int(8),
  birthday date,
  PRIMARY KEY(id)
);
