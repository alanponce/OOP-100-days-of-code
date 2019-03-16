create database Ticket_System;

use  Ticket_System;

create table Department(
DepartmentID tinyint not null,
Name varchar(25),
constraint Pk_DepartmentID primary key (DepartmentID)
);

create table Employee(
EmployeeID int not null,
First_Name varchar(15),
Last_Name varchar(15),
email varchar(30),
password varchar(30),
DepartmentID tinyint,
constraint Pk_EmployeeID primary key (EmployeeID),
constraint U_email unique (email),
constraint Fk_DepartmentID foreign key (DepartmentID) references Department(DepartmentID)
);

create table Bus(
Number_Plate varchar(7),
Driver varchar(25),
Model varchar(25),
constraint Pk_Number_Plate primary key (Number_Plate)
);

create table Trip(
TripID int,
BusNumber_Plate varchar(7),
TicketQTY tinyint,
Departure_Day date,
Time_Departure time,
Destiny varchar(45),
constraint Pk_TripID primary key (TripID),
constraint Fk_BusNumber_Plate foreign key (BusNumber_Plate) references Bus (Number_Plate)
);


