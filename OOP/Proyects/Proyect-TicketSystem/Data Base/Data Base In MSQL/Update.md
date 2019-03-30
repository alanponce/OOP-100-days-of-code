# Updates

* 16/marzo/2019 10:02 am.
  * Este Script es para crear la base de datos del sistema de tickets, junto con las tablas y las relaciones entre ellas, por lo pronto no le vamos a insertar los datos a las tablas hasta que no esten refinados todos los detalles de las tablas de la base de datos como restricciones check o default.

* 17/marzo/2019 6:40 pm.
  * Se le agrego una restricción al campo "Client_Phone" de la tabla "Sales" de tipo check para asegurarnos de que los telefonos ingresados en este campo tengan el formato [0-9][0-9][0-9]-[0-9][0-9][0-9][0-9][0-9][0-9][0-9] por ejemplo: 123-4567890

* 29/marzo/2019 
  * Se cambio el tipo de dato de 'date' a 'varchar' del campo "Departure_Day" de la tabla Trip.
  * Se cambio el tipo de dato de 'time' a 'varchar' del campo "Time_Departure" de la tabla Trip.
  * Se agregaron restricciones de tipo check para los campos "Departure_Day y Time_Departure" de la tabla Trip.
  * Se cambio el tipo de dato de 'date' a 'varchar' del campo "Date" de la tabla Sales.>
  * Se agrego una restricción de tipo check para el campo "Date" de la tabla sales.
