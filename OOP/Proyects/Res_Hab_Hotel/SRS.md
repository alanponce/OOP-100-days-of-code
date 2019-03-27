# Software Requirement Specification (SRS) para Systema de Reservación de Hotel CU
> 1.-Introduccion

1.1 Purpose:

Crear un sistema el cual tenga el unico proposito de reservar cuartos de hotel en Ciudad Universitaria.

Llevar el control exacto de las altas y bajas de huespedes de un hotel, para así, dar de manera eficaz el cargo a pagar por parte del cliente.

* Registrar las altas y bajas de huespedes.
* Manejar la disposicion de habitaciones.
* Calcular el monto a pagar.

1.2 Scope:

El alcance del systema va para aquellas personas los cuales quieran hacer un apartado de reservación en el hotel el cual esta ubicado en Ciudad Universitaria, a los recepcionistas que estan encargados de hacer la reservacion ya sea a traves de una entrevista por llamada de celular o telefono, o en tener la entrevista en la recepcion del hotel.

a)Los costos tendran variacion dependidendo del tipo de habitacion a reservar, metodos de pago los cuales podran ser a traves de transaccion bancarea siendo todo esto en precencial al acudir al lugar.

b)Al momento de hacer la reservacion el recepcionista en todo momento estara mostrando las cantidades y los costos al cliente para que este sepa los cargos de dinero que se le estan haciendo.

c)La autitificacion del cliente se efectual al momento posterior al pago final.

d)Los administradores del hotel tienen acceso a cada parte del front end del systema, los recepcionistas tendran accesos restringidos tales como solo dar altas del systema.

1.3 Glosary:

 Descripción de las habitaciones:
 * Individual: Ideal para quienes viajan solos. No tienes más espacio del que necesitas, y además el precio se adecúa a las necesidades de todos aquellos huéspedes que buscan tener un lugar tranquilo para descansar en sus viajes de placer o negocios.
 
* Doble de uso individual: Este tipo de habitaciones suelen ofrecerse cuando el hotel, a falta de poder ofertar una habitación con una cama pequeña, dispone al huésped una habitación diseñada para dos personas; obviamente, al ser de mayor tamaño, su precio se eleva.
 
* Habitación doble: Como su nombre lo indica, esta clase de habitaciones son para dos personas. Las camas varían, pueden ser matrimoniales o dos camas individuales independientes.
 
Con cama supletoria: Estas habitaciones son ideales para quienes viajan con algún menor de edad. Si bien existe un costo por la cama adicional, usualmente suele ser más barato que contratar una habitación triple. Dependiendo de la edad del niño se coloca la cama que mejor le acomode. Algunos hoteles incluso cuentan con cunas para bebés.
 
* Habitación triple: Simple: estas habitaciones cuentan con 3 camas, o 2 más una supletoria. Es perfecta para los viajes con tus amigos.
 
 * Junior Suites: Cuentan con habitación doble, baño y salón.
 
* Suites: Conocidas por ser las mejores y más lujosas habitaciones en cualquier hotel, cuentan con dos habitaciones dobles, 2 baños, salón y estancia. Por supuesto, su precio es el más elevado. Las suitse más completas y lujosas suelen recibir el nombre de Suite presidencial, y generalmente son reservadas para personajes distinguidos.
 
* Suite nupcial: Pensada para aquellas parejas recién casadas y que quieren disfrutar de una luna de miel con privacidad e intimidad, estas habitaciones en los lugares más exclusivos de los hoteles (generalmente acompañadas sólo por las suite presidencial). Además de una cama matrimonial amplia, generalmente cuentan con jacuzzi y una vista única.
  
1.4 Referencias:

Joaquin Chavira, Eduardo Hernandez. (2019). Reservacion Hotel CU. 27/03/20019, de GitHub Sitio web: https://github.com/alanponce/OOP-100-days-of-code/blob/master/OOP/Proyects/Res_Hab_Hotel/Presentaci%C3%B3n

1.5 Overview

El systema a desarrollar ayudara con la eficiencia y eficacia en la reservacion de cuartos en el hotel ubicado en Ciuadad Universitaria, teniendo en cuenta las altas de habitaciones, baja de habitaciones y cambios en la reservacion de estas mismas.

En este systema se tendra restricciones entre el recepcionista y el administrador.

El cliente tendra a su dispocision diferentes habitaciones en cual podra hacer registro de la que se encuentren disponibles y la que guste reservar.

>2.- Overall Description

El systema funcionara usando el CRUD (create, read, update and delete), de una base de datos apartir de un sistema usando diferentes interfaces con cada uno de estos propositos:

Create: Creando la reservación de las habitaciones deseadas y quitar la disponibildad a esas habitaciones.

Read: Revisando si habitaciones estan desocupadas para poder ser apartadas.

Update: Poder generar cambios de la reservacion, cambios de habitacion o cambio de cantidad de reservaciones.

Delete: Dar de baja la reservacion y dar disponibilidad a las habitaciones que serian ocupadas.

Este mismo systema estara conectado a un systema de pago, el cual sera involucrado con pago de efectivo, o tarjeta de credito o debito.

2.1 Product perspective:

El proyecto funcionara en dos partes:

La primera parte funcionara con la reservacion, a traves de interfaces el proyecto tiene que visualizar la disponibilidad de las habitaciones, mostrar los tipos de habitaciones, los costos, la cantidad de personas, las fechas de entradas, fechas de salidas, restricciones de habitaciones, y la verificaciones de que los datos esten correctos.

Poder modificar la reservaciones, tal como poder modificar fechas, cantidad de habitaciones, tipos de habitaciones, forma de pago, etc.

Eliminar reservaciones, poder eliminar la reservacion ya efectuada y liberar las habitaciones apartadas.

La segunda parte es la forma de pago, ya que sea a traves de efectivo, se hacen los cargos por la reservacion y se efectua los calculos de los pagos y el cambio en el cual sea necesario de usar, a traves del sistema de transaaccion bancarea aun queda no establecida.

2.2 Product functions

La forma de efectuar el sistema es validando quien es el que usara el sistema, ya que sea un recepcionista o un administrador, este requiera entrar a traves de una pantalla de LOg In siendo validada por la base de datos y en la tablas de empleados con un usuario y una contraseña.

Una vez ya adentro del sistema, se llevara a cabo una entrevista sobre la reservacion de los cuartos del hotel siendo esta en persona o a traves de una llamada por telefono o celular, verificando y llendando todos los campos obligatorios de la interfaz de apartados es la manera en que se efectua la reservacion, despues de ese proceso se lleva a cabo la verificacion de la informacion de la habitacion o habitaciones del hotel, una vez validado esta en la base de datos y el cliente estando de acuerdo con sus especificaciones se llevara a caputarar los datos del cliente para concluir la reservacion de las habitaciones, estos datos tambien se guardaran en la base de datos pero llenando los datos en las tablas de clientes.

Al concluir la reservacion se quedan almacenados los datos de esta misma, cuando el cliente recida al hotel se llevara el metodo de pago ya se en efectivo y moverlo, o a traves de transacciones bancareas.

2.3 User Characteristics:

En esta area de trabajo se manejaran e tipos de actores que el cual son los Customers y los End Users, estos son los clientes que participarian en la entrevista para saber cuales habitaciones van a querer. Las carateristicas que ellos deben de tener son:
* Tener conocimiento de que tipo de habitaciones va a querer recervar.
* Tener un metodo de pago y la capacidad de hacerlo.
* Identificarse con su informacion real y veridica.
* Ser mayor de edad.
* Contar con la informacion anticipada de las capacidaddes del hotel.

Recepcionista:
* Tener la capacidad de entrar al systema como recipcionista con un usuario y una contraseña.
* Tener conocimiento de como llenar los campos de la interfaz de altas del systema.
* Tener la capacidad de atender amablemente al cliente.
* Ser empleado del hotel y haber sido capacitado para el puesto.

Administrador:
* Tener la capacidad de entrar al systema como admistrador con un usuario y una contraseña.
* Tener conocimiento de como llenar los campos de la interfaz de altas, bajas y cambios del systema.
* Tener la capacidad de atender amablemente al cliente.
* Tener la capacidad de poder apoyar al recepcionista con los conflictos encontrados.
* Ser empleado del hotel y haber sido capacitado para el puesto.

2.4 Constraints

* El proyecto esta restingido a que trabaja de manera distribuida pero de manera local, solo se piensa desarrollar en el area de trabajo conectado en un systema remoto, para poder efectuar la reservacion es necesario estar usando las computadoras que se tiene instalado el systema.
* No existe una manera de mostrar visualmente las habitaciones disponibles al usuario a menos que se encuentre en la entrevista precencial.
* El programa no se puede ejecutar a menos que tengas un usuario y una contraseña activo en la base de datos.
*

2.5 Assumptions and dependencies

* Que el banco ayude y proporciones los artefactos para desarrollar o implementar el sistema del metodo de pago atraves de transferencias bancareas
* 

2.6 Apportioning of requirements

Los requisitos de la forma de pago atraves de tranferencias bancareas seras desplasadas al la siguiente etapa de mejoramiento del sistema, si es que no se encuentra la forma ideal para este metodo de pago.

