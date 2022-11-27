create database studentresultsystem;

use studentresultsystem;

CREATE TABLE `adminlogin` (
  `username` varchar(50) PRIMARY KEY,
  `password` varchar(50) DEFAULT NULL
) ;

insert into adminlogin values("admin", "password");


CREATE TABLE `result` (
  `rollno` int PRIMARY KEY,
  `physics` int DEFAULT NULL,
  `maths` int DEFAULT NULL,
  `chemistry` int DEFAULT NULL,
  `eletrical` int DEFAULT NULL,
  `biology` int DEFAULT NULL,
  `total` int DEFAULT NULL
);

CREATE TABLE `student` (
  `name` varchar(40) DEFAULT NULL,
  `rollno` int PRIMARY KEY ,
  `gender` varchar(6) DEFAULT NULL,
  `fatherName` varchar(40) DEFAULT NULL,
  `courseName` varchar(20) DEFAULT NULL,
  `branchName` varchar(20) DEFAULT NULL
);

