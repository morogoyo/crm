CREATE TABLE customers(
  id integer NOT NULL AUTO_INCREMENT ,
  f_name varchar(255),
  l_name varchar(255),
  gender varchar(255),
  address varchar(255),
  email varchar(255),
  profession varchar(255),
  mobile_number integer(8),
  birthday date,
  PRIMARY KEY(id)
);


INSERT INTO customers(ID,F_NAME,L_NAME,GENDER,ADDRESS,EMAIL,PROFESSION,MOBILE_NUMBER,BIRTHDAY)VALUES(1,'Rene','Torres','Male','Sterling Spring Rd. Orlando Fl','torres.rene@outlook.com','Dev',1234567,now());					
INSERT INTO customers(ID,F_NAME,L_NAME,GENDER,ADDRESS,EMAIL,PROFESSION,MOBILE_NUMBER,BIRTHDAY)VALUES(2,'user1','Torres','Male','Sterling Spring Rd. Orlando Fl','user1@outlook.com','Dev',1234567,now());					