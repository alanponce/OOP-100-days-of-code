# Through the interview for know the actual sales system and the use of the text analisys of visual paradigm, we recover the next information: 

## Actors 
>### Sales Employee: 
>Its the person in charge of deal with the client, will have to sell the tickets, solve customers cuestions, perform the transaccions like cancelations or payments and make the day report.
>
>### Client: 
>Its any person who enters in the local, and it is not  employde of the company. This person perform buys, questions about her travels, pays etc.
>
>### Manager: 
>Its the highest autority in the copany afther the Owner, who performs the reports about the productivity of the company, he checks the performance of the employees, resolve the major problems of the company and helps the employees if necessary
>
>### Supervisor: 
>The supervisor makes help all day in what is needed, supervises the work of the employees all day and makes reports to the manager if necessary.
>
>### Logistic Employee: 
>Check the information of the trips and the tickets for the elaboration of reports
>
>### Chauffeur: 
>Is the person in charge of wear the client to his destyni.
>
>### Finance employee: 
>Is the person in charge of consults the sales, and check thesales report of the sales employee. Also can check the information about tickets, and trips.
>
>### Data Base Administrator:
>The DBA is the person in the charge of organizate the information about the company in the data base. This is a external employee because he not work in the office.

## Use Cases
>### Finance Employee: 
>In this use case, we can watch the interaccion between the system and a Finance Employee with his respective credentials. The interaccion with the system it works from the followin way. The Finance Employye, can check and modify the sales report. Also can generate a new formal report.
>
>### Logistic Employee:
>The logistics employee controls the information regarding sales and travel in a quantitative manner to generate reports of work plans and travel routes. It interacts with the system through reports of what has already been mentioned.
>
>### Sales Emplooye:
>The sales employee is the person who interacts most with the system, since it is the one who has access to the information of the branches, the section of the seats from reservation or purchase. You can also generate a report of the sales of the day but not see it (modify it) to avoid the alteration of it.
>
>### Manager Emplooye:
>The use case manager, generates all the system that the manager will have within the system, this being the maximum authority in terms of movements and modifications in the same


## Classes
>### Employee: 
>>This is the base class of the employees in which we find information about them.
>>#### Attributes
>>##### ID: Contains the ID of the employees
>>##### salary: Contains the salary of the emplooyes
>>##### birthDate: Contains the birth date of the employees(age)
>>##### name: Contains the name of the employees
>>##### lastName: Contains the last name of the employees 
>>##### charge: Contains the charge of the employee(finance,logistic etc)
>
>### Sales:
>>In this class we will wacth the attributes of the sales, like a price, date of the sale, if the client paying the total price of a ticket, or only gave a part of the final price.
>>
>>#### Methods:
>>##### getPrice: This function returns the price of a ticket, investigating the same with the ticket id.
>>##### getTicketInfo: The function returns an object of the ticket class, to be able to access all the information contained in the respective trip.
>>##### getDay: This function recovers the day in which the purchase of the ticket was made to make use of it in the reports
>>##### buyTicket: This function is the one that makes a purchase and connects with the client class
>>
>### Ticket: 
>>In this class, we will generate the id number, only exist a 1 number for a 1 ticket,we will set the number of pasenger fo the ticket, and we add the destiny
>>#### Attributes
>>##### ticketID: this attribute contains the unique id of each ticket
>>
>### Client:
>>The client class will have the information of the client to keep the purchases of the same, name, seat number etc.
>>#### Attributes
>>##### name: Contains the name of the client
>>##### lastName: Contains the Last name of the client
>>##### age: Contains the age of the client
>>##### phone: Contains the phone of the client
>>##### cost: Contains the cost of the client
>>
>>#### Methods:
>>##### searchTrip: This method lets see the information of the trip of the ticket buyed
>>##### setTrip: This method assigns the buyed trip to the client.
>>##### setTime: This method register the date of attention of the client
