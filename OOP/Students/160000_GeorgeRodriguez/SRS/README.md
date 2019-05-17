<p align="center">
Universidad Autonoma de Ciudad Juarez</br>
División Multidisciplinaria de Ciudad Universitaria</br>
Departamento de Ingeniería Electricidad y Computación</br>
</p>
<br>
<p align="center">
<img width="270" height="270" 
  src="http://www.uacj.mx/comunicacion/PublishingImages/Escudo%20UACJ%202015/Escudo%20uacj%202015-color-sin%20fondo.png">
</p>
<br>
<p align="right">
Development of software requirements</br>
</br>
</br>
Accounting documents administration</br>
</br>
</br>
George Iván Rodríguez Gómez 160000</br>
</br>
</br>
Bachelor's in Software Engineer
</br>
</br>
April 2019
</p>

# Table of contents
1. [Introduction](#Introduction)
    - [Purpose](#Purpose)
    - [Business Managment Process](#Business-Managment-Process)
    - [Use case](#Use-case)
    - [Scope](#Scope)
    - [Business Managment Process](#Business-Managment-Process)
    - [Definitions acronyms and abbreviations](#definitions-acronyms-and-abbreviations)
    
2. [Overrall description](#Overrall-description)
    - [Product perspective](#Product-perspective)
    - [Specific requirements](#Specific-requirements)
        - [Functional requirements](#Functional-requirements)
            - [User interfaces](#User-interfaces)
        - [Non functional requirements](#Non-functional-requirements)
            - [Educational level, experience y technical expertise](#Educational-level-experience-y-technical-expertise)
            - [Constrains](#Constrains)
        - [Security](#Security)
        - [System requirements](#System-requirements)
        - [Hardware interfaces](#Hardware-interfaces)
        - [Software interfaces](#Software-interfaces)
        - [Communications interfaces](#Communications-interfaces)
        - [Memory](#Memory)
        - [Class diagram](#Class-diagram)

3. Appendices
    - [Elicitation process](#Elicitation-process)
    - [References](#References)


# Introduction
## Purpose

The document objective is describing a software solution to organize business accounting. This solution will give ease and ease up to organize and find a lot of quantities of information. The project will allow to reduce time search, keep accessible the administrator business information and recover data in documents for later use. Create a database for localize documents effective and available to any person in business.

The document address broadly the next topics:
It will be analyzed the requirement of business collaborators, so it will describe an action plan to construction of software. It will develop the software to reduce efforts to find documents in their offices, then it offers a solution according to available infrastructure. Finally, it will do proof and fix errors.
## Business Managment Process
 The business managment process documentation specify key points about how to work an company, so it describes the workflow in accounting business and focus in the importance of software development for improve performance. The process extend around four key steps: case documentation, information review, tax procedures, and manage documentation.

<img src="https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/ActoresDocumentacionE.png" width="900" />  
In general, a customer goes to office, and an employee interviews him. Here, a situation is determined throw of documentation, so offer to customer a right service to their  necessities. When a new customer request a service, it's necessary document its case. In each case is necessary evaluate the intalled capacity to process the request, then the manager company decide who process it. 

<img src="https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/documentation.png" width="390" />  <img src="https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/completeDocumentation.png" width="415" />  

An especific case must be evaluated for take the better option to solve, so it's necessary have all documentation about client. A review of the client's history will help to determine its situation, any other aditional information give clearness on case. However, it's essential that exist a complete mandatory information, so the business will complete satisfactory. It's essential have a computer equipment available and functional, because all tansaction are realized by internet. If there are some problems, then a technical support can help to solve the problem.

<img src="https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/history.png" width="390" /><img src="https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/fix.png" width="390" />  
An employee start the tax procedures, when all documentation is complete. That, it avoid problems with SAT, so their system review and recept the documentation.All pays derived of transaction have to do by a customer, and SAT system will reflect that pays. SAT system solve the issuace of tax receipts, and they send probatory documentation to petitioner.The new documents are record in business system, then it's generated an invoice on service realized  Finally, the customer receipt the documentation probatory transaction and cover services.

<img src="https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/procedures.png" width="370" />  <img src="https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/invoice.png" width="455" />  





## User case

The user involved all collaborators but, only internal and externals employees can access to data, the next table describe the roles of interaction actors:

<img src="https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/read.png" width="800" />  

 User  | Description
 ----- | -------------
 Name | Search customer's documentation
 Date | 20/04/2019
 Author | George Rodríguez
 Description | An internal employees need find a documentation of customer.
 Actors | Administrator
 Pre-conditions | The customer is active in database.
 Flow | The internal employee require basic information about customer
 Post-conditions | The system clean the search
<img src="https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/create.png" width="800" />  

 User  | Description
 ----- | -------------
 Name | Create a new customer
 Date | 20/04/2019
 Author | George Rodríguez
 Description | An internal employees  register a new customer.
 Actors | Administrator
 Pre-conditions | The customer isn't active in database.
 Flow | The internal employee require detailed information about customer to create this new instance.
 Post-conditions | The database is upgrate with new information. 

<img src="https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/update.png" width="800" />  

 User  | Description
 ----- | -------------
 Name | Update information about customer client or delete documents.
 Date | 20/04/2019
 Author | George Rodríguez
 Description | An internal employees  update a new document's customer.
 Actors | Administrator
 Pre-conditions | The customer is active in database.
 Flow | The internal employee require basic information about customer.
 Post-conditions | The database is upgrade with new information. 

<img src="https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/updateE.png" width="800" />  

 User  | Description
 ----- | -------------
 Name | Update information about customer's documents.
 Date | 20/04/2019
 Author | George Rodríguez
 Description | External employees  update a new document's customer.
 Actors | Administrator
 Pre-conditions | The customer is active in database.
 Flow | The external employee require basic information about customer.
 Post-conditions | The database is upgrade with new information. 

<img src="https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/readE.png" width="800" />  

 User  | Description
 ----- | -------------
 Name | Search customer's documentation
 Date | 20/04/2019
 Author | George Rodríguez
 Description | An external employees need find a documentation of customer.
 Actors | Administrator
 Pre-conditions | The customer is active in database.
 Flow | The external employee require basic information about customer.
 Post-conditions | The database is available for new operations. 
<img src="https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/databaseT.png" width="800" />  

 User  | Description
 ----- | -------------
 Name | Database administration.
 Date | 20/04/2019
 Author | George Rodríguez
 Description | An external technical employee manages the database.
 Actors | Technical employee
 Pre-conditions | The database was create.
 Flow | Once a moth verify the database state.
 Post-conditions | The database is stable. 


## Scope
The product purpose is contributed in process of information extract and use for all users. This project include all people who need information about costumers and their paperwork’s.

Other aspect to reach is a broad understanding about customer and users' necessities for increase the productivity of organization and improved the performance of collaboration among users of data customer.

The software have to run in different SO without a new recompilation previusly, so the system must run in:
- Windows 7
- Windows 8
- Windows 10
- Mac OS



## Definitions, acronyms, and abbreviations

Concept         | Definition   
--------------|-----------
**Internal Employee**      | People can access to all parts of fiscal accounting others internal business process 
**External Employee**      | Collaborator who helps with some customers and special works
**Customer**             | They are people in need of fiscal and administration accounting
**Technical support**             | People who give support to company
**Sistema de administración tributaría (SAT)**| Goverment organization manager of paperwork related to collect taxes.
**JDK**|Java development kit, is a development enviroment for building applications, applets, and components using the java programming language.
**OS**|Abbreviature  of operating system
**MB**|Abbreviature  of megabyte, 1 megabyte is equivalent to 1024 byte.
**RAM**|Abbreviature  of random access memory, it allow keep temporal information about transactions when a program is run.
**SQL**|Abbreviature  of Structured Query Language, it's allow handle all functions of a database.
**CRUD**|Abbreviature  of create, read, update and delete.

# Overrall description
## Product perspective
The business has with a system files with administrative information, this information during time in paper in folders, but this number of documents isn’t handled adequately in along time this can become a big problem. It will be hard to find a necessary hard copy of any document in different places of business infrastructure, and possibilities of losing and damage it.


# Specific requirements

## Functional requirements
The software allows read information about localization of documents in database, so it will be necesary that a user type a basic data about customer. Other function is upgrade the data stored, so it's possible add or delete information. Finally, it uses a system for add new customer to database. The next table specify some characteistics of system, a complete information you can see [Elicitation process](#Elicitation-process).

Software Engieener        | Customer   
--------------------------|-----------
Where will be computers with software?| In central office, and external employees will use in own laptops out of offices.
There is some place in where the employees save documents?|Digital documents save in central pc, in dropbox service. And the externals employees will be connected to same repository.
There is a middle place, where document save?|Dropbox
When a work wasn't finished, where is keep the documents?| On the desk in their folders.
### User interfaces
The first perspective about software is getting in an interview with the costumer, here show some characteristics of software:

Software Engineer        | Customer   
-------------------------|-----------
The system need a language additional to Spanish?|No, all users understand Spanish.
What OS have the equipment of users?|Windows in different versions and mac OS.
Do you use a tactile screen?| It isn't necessary, only one computer has a tactile screen. 

 Document Search, when a user inserts a name and last name of customer, the system looking for all data related with the people. If a document found is a digital version, then it shows a hyperlink with its reference in selected environment. In case, the software find a physical location, the answer will indicate the exact position. Finally, if the user doesn't find a available ducuments, the system indicate this situation.

<img src="https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/Consultas.png" alt="consultas" width="400" />   <img src="https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/Consultas1Resp.png" alt="consultas con una respuesta" width="400" />
<img src="https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/Consultas3Resultados.png" alt="consultas con tres resultados" width="400" /><img src="https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/ConsultasSinRespuesta.png" alt="consultas con tres resultados" width="400" />

Transactions, a customer can have several documents, so it's possible attach a undefined quantity of places in documents. Each document will dispose with a head, document format, ubication name and its reference. If some reference, it’s possible upgrade.

<img src="https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/Movimientos.png" width="400" /><img src="https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/Movimientos2Resultados.png" width="400" />
<img src="https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/Movimientos2ResultadosSinEleccion.png" width="400" /><img src="https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/Movimientos3Resultados.png" width="400" />
<img src="https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/Movimientos4Borrar.png" width="400" /><img src="https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/Movimientos4BorrarMensaje.png" width="400" />

Add new elements, a panel with new customers allow in data of new elements in database, last customers don’t remove of database at any moment could be active.

<img src="https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/MovimientosResultadoAgregar.png" width="400" /><img src="https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/NuevosClientes.png" width="400" />
<img src="https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/NuevosClientesSuccess.png" width="400" />


## Non functional requirements
### Educational level, experience y technical expertise

According data collect, study level isn’t relevant, because the collaborators in the business have skills necessary to handle basics characteristics of OS. Technical information support is provided by external personal dedicated to give maintenance devices in business. The initial training in software operation give a representative enterprise.  
## Constrains
The system is limited to run in equipment support and had installed JDK 8.0 or later. The software is built in Java, so it's necessary all library and java core to work.
The computer through will access must be has internet connection. The software is distributed system and need an external database for work, then it's necessary connect to internet.

### Security
Some considerations of customer software, it isn't necessary authenticate in application. However, the access to database need a user and password. So, a pool data will be in a public server, then the information traffic per day is minimum. In other situation will be use a provider of service with more benefits in relations with transactions of the database.
## System requirements
### Hardware interfaces
For handle the system will be use a pointing device such as mouse or equivalent in portatil pcs, also it's necesary a keyboard for type search and update information.
### Software interfaces
The software include a connection with other software elements allows interaction with SQL databases, also it's necesary others library to implement correctly all functions od software. The class conexion have all elements to connect to database and manage the most common mistakes. Other class are organized like database, so it's possible handled in system with the same characteristics.

<img src="https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/diagramaBD.png" width="900" align="center" />

### Communications interfaces
For share information is necesary use a SQL database for save the information, so it's possible keep upgrate the information about users and customer of business.
### Memory
The operations of software use a small amount of memory, all data is send to online database, so only is necesary 500MB in RAM
### Class diagram
The software is supported on three key classes, and other derived class gives support to this classes. DocumentManager class execute al graphics elements in software and control the flow data of user interface. Tabla class does all activities related with a tables in database by example: create and update field's table. ClienteAnalisis, create all querys to database and manipulate the system (CRUD), so their principal function it's create new elements, read data, update information and delete records.

<img src="https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/DiagramaDeClase.png" width="900" />  
# Appendices

## Elicitation process

It get informaton throw a interview on 3/14/2019 by Paola Jurado, in this, Aracely P. represent a accounting company, she was exposed all software requeriments, and answered the next question about details of software:

Software Engineer        | Customer   
--------------------------|-----------
Physical enviroment| 
Where will be computers with software?| In central office, and external employees will use in own laptops out of offices.
There is a middle place, where document save?|Dropbox
There is some place in where the employees save documents?|Digital documents save in central pc, in dropbox service. And the externals employees will be connected to same repository.
When a work wasn't finished, where is keep the documents?| On the desk in their folders.
Interfaces| 
The system need a language additional to Spanish?|No, all users understand Spanish.
What OS have the equipment of users?|Windows in different versions and mac OS.
Do you use a tactile screen?| It isn't necessary, only one computer has a tactile screen. 
Do you use some aditional user interface or device?| It isn't necessary, all employees work well with standard devices. 
User and human factors| 
The employees, what level skill need for work with the system| All employees have a level necesary for operate an accounting system. 
It's necessary protect the client's information?|It's not neccesary, all information information have to available in business.
Functionality|
What is the main functionality of software?|It handle a documents and information.
Who are manage the software?| I manage the system and our support engineer.
It's necessary shortcut keys?|Yes, a software is easier when there are shorcut keys
The software need adapt to other devices|No, we work in pcs with windows or mac
The software need adapt to other systems|Maybe, it's necessary adapt to cloud computing, but this technology no yet available in the business.
Security|
Users need aditional information to access?|No, the simplicity is important

# References
Oracle, corp., web page. Consulted 5/04/2019. 
https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

Reséndiz, G. (22 de 01 de 2019). Information about business. (P. Jurado, Interviewer)