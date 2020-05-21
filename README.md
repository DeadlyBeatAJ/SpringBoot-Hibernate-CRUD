# SpringBoot-Hibernate-CRUD
SpringBoot-Hibernate-CRUD with entity manager 

----------------DB Scripts----------------

CREATE DATABASE BootHibernateCrudApi;

use BootHibernateCrudApi;

CREATE TABLE tbl_employee(
 id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
 name varchar(255),
 gender varchar(255),
 department varchar(255),
 dob date
);

SELECT * FROM boothibernatecrudapi.tbl_employee;
