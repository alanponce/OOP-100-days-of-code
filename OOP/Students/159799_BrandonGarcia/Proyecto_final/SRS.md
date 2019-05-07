## 1. Introduction ##
 
### 1.1 Purpose 
  
The purpose of this project is to design a system and give the user an order regarding the information stored in their gym, you can access it, modify it and update it, all this because they do not have a software with these capabilities, until now they are saving their information in handwritten notes or notes on the computer.
  
### 1.2 Scope
  
The software will have the capacity to store information given by the user thanks to an interface connected to a local database, this will allow you to:
  
 + Save information from clients who come to the gym.
 + It will have the ability to show when one of these customers has a debt.
 
 Also with regard to the gym equipment:
 
 + Have a record of the machines used.
 + Have a record of the weights and other equipment.
 
 All this in order to have a better control of the gym information.
  
### 1.3 Definictions, acronyms, and abbreviations
  
Gym: A gym is a place that allows sports or exercise in an enclosed area with several machines and sporting goods available to those who visit.

Machines: Devices used to perform various exercises, normally located in gyms.

Dumbbells and / or weights: A dumbbell is a piece of equipment used in weight training, it is a type of free weight. They can be used individually or in pairs (one in each hand).

  
### 1.4 Reference
  
 SPORTS, April 7, 2019 of gymventures https://www.gymventures.com/
  
### 1.5 Overview
  
The next sections of the document will contain information about the system, divided in two sections, section 2 will give a overall description, containing the functions, constrains and the people involved. Section 3 will give all the specific requirements that the system should deliver.
  
## 2. Overall Description ##
  
### 2.1 Product perspective
  
  The system consist in a software for the user, capable of save information into a data base working localy, with the options of create, modify or delete the information, all of these whit the interface that will be conected to the data base.
  
### 2.2 Product functions
  
  These are the functions that the system should do:
  
* Receptionist
   * Add a new customer to the systme.
   * Once the customer is on the system, the user can see his information and modify it and also see if he has a debt.
   * Delete a customer.
   * Add new machines to the system.
   * Delete machines of the system.
   * Add new equipment to the system.
   * Delete equipment of the system.
   
* Administrator
   * Manage the receptionist information.
   * All the functions of the Receptionist.
  
### 2.3 User characteristics
  
  In this system there are two kind of users, the administrator and the receptionist.
  The receptionist will be in the reception of the gym attending all of the costumers, capturing the costumer information, whit the capacity of modefy the information, also this user will keep an inventory of the machines and equipment of the gym.
  
  The administrator will have the same capabilities as the receptionist but this user can also modify the receptionist information. 
  
### 2.4 Constraint
  
  Whithout any at the moment.
  
### 2.5 Assumptions and dependencies
  
  The gym will provide the information about the o going costumer and equipment.
  
### 2.6 Apportioning of requirements
  
  The possibility of doing check out and check in of the costumers.
  
## 3. Specific requirements ##
  
### 3.1 External Interfaces
  
  Here will be described how the system shold look for the users.
  
 + Login Menu
  
  Once the software is initiated the login menu shold pop out, that will determinate the options that will show on the interface, one for the receptionist or other for the administrator.
  
 + Main menu
  
  The receptionist will have a menu whit two tabs, one for the administration of the clients and the other for the inventory of the equipment, the client administration tab will have two buttons one to add a new costumer, that will send the user to another menu (explained later), the other button is for see the already registred clients (explained later). The inventory tab will have also two buttons one for add a new equipment, and the other to see the list of the equipment(explained later). 
  
 The administrator whil have an extra tab, the receptionist tab, that will allow to the asministrator to se the history of changes on the data base, and another button to see the information of the receptionist.
 
 + Client menu
 
 This menu as explained early will have two buttons, the add button whill pop out a menu whit text boxes that will ask for the information of the costumer such as the name, number, addres, and optonial type of blood, bellow that whill have a button to save the information in the data base.
 
 The button for the already custumers in the system will pop out a list of the customers whit two options modify and delete, the modify button will show text boxes that will ask for the information to change, then a save button to save the changes. To use the delete button the user will have selected the client that is going to be deleted, asking for confirmation.
 
 + Inventary menu
 
 This menu will have two buttons, the add button will pop out a menu asking for the information of the new equipment, like the brand, type of equipment and weight, bellow that will be a button to save the information in the data base.
 
 The button for the inventory will show a list of the equipment with it information, with the two options of making changes or delete, the changes will pop out the text boxes to make the changes and a save button, while the delete button the user will have selected the client that is going to be deleted, asking for confirmation.
 
 + Employee menu
 
 This tab is exlusive for the administrator, with two buttons one to see the history of changes that will show a list of the changes and date, the other button will show a list of the employees and their information, this will allow to the administrator to make changes if he hires a new employee or he fires another, with the list of the employees will have two buttons one to delete and another to modify, the modify one will ask the information to modify and the delete one will ask for a confirmation. 
  
### 3.2 Functional requirements
  
* The user will have to login to use the system.
  
 Functional requirements by user:
 
* Receptionist 
   * This user can add new customers.
   * Modify and delete the information of existing customer.
   * Add new equipment.
   * Modify and delete information of equipment.
   
* Administrator
   * This user can make all of the functions of the receptionist.
   * Also can modify the information of the receptionist.
   * See a history of changes made by the receptionist.
  
  ### 3.3 Non-functional requirements

  * The interface made in Java will be conected to a data base made on Mysql.
  * The system will be local.
  
  ### Class Diagram
  
![alt text](https://github.com/RequirementEngineering/ch-re-al159799/blob/master/Diagram%20Class.png)
