# Descripcion
El proyecto sera realizado en base al documento SRS con las especificaciones que el asistente contable otorgo. 

    Create - Crear o añadir nuevos clientes, productos o facturas a la base de datos

    Read - Buscar informacion sobre clientes, productos o facturas

    Update - Actualizar la informacion

    Delete - Eliminar cualquier campo de las tablas



Se utilizara Java Application Netbeans 8.0.2 y Derby Database como database local, la database contendra tres tablas que son las siguientes:
1.  Customers
    * Id_Customer
    * Name
    * RFC
    * Contact_phone
2.  Products
    * Id_Product
    * Name
    * Price per piece
    * Price per kilo
3.  Order
    * Id_Order (autogenerada)
    * Id_Customer (Forean key)
    * Id_Product (Forean key)
    * Quantity
    * Total
