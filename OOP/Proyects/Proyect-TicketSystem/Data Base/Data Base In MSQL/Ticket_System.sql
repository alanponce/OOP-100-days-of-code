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
Number_Plate varchar(7) not null,
Driver varchar(25),
Model varchar(25),
constraint Pk_Number_Plate primary key (Number_Plate)
);

create table Trip(
TripID int not null,
BusNumber_Plate varchar(7),
TicketQTY tinyint,
Departure_Day date,
Time_Departure time,
Destiny varchar(45),
constraint Pk_TripID primary key (TripID),
constraint Fk_BusNumber_Plate foreign key (BusNumber_Plate) references Bus(Number_Plate)
);

create table Seat(
Number varchar(2) not null,
TripID int,
SoldState tinyint,
constraint Pk_Number primary key (Number,TripID),
constraint Fk_TripID foreign key (TripID) references Trip(TripID)
);

create table Sales(
SalesID int not null,
Client_Name varchar(20),
Client_Phone varchar(10),
Date date,
TicketsSold int,
EmployeeID int,
TripID int,
Reservation bit,
Amount_Received int,
Total_Sale int,
constraint Pk_SalesID primary key (SalesID),
constraint Fk_EmployeeID foreign key (EmployeeID) references Employee(EmployeeID),
constraint Fk_TripIDSales foreign key (TripID) references Trip(TripID)
);

Create table Ticket(
TicketID int,
SalesID int,
SeatTripID int,
Price double,
SeatNumber varchar(2),
constraint Pk_TicketIDCompuesta primary key(TicketID,SalesID,SeatTripID),
constraint Fk_SalesID foreign key(SalesID) references Sales(SalesID),
constraint Fk_SeatTripID foreign key(SeatTripID) references Seat(TripID),
constraint Fk_SeatNumber foreign key(SeatNumber) references Seat(Number)
);
