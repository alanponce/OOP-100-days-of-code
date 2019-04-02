# 1.	Introducción
Este documento contiene los requerimientos de software del proyecto de Proyecto Mapa (IndioLocation).

# 1.1	Propósito
Este documento tiene como propósito dar a conocer el funcionamiento general del proyecto IndioLocation que esta dirigido al equipo desarrollador y al usuario final.

# 1.2	Ámbito del Proyecto
•	Nombre del proyecto: IndioLocation
•	El proyecto le permitirá al usuario saber como llegar a los indiobuses, Saber dónde están localizados y el recorrido que estos toman para llegar a su destino.

# 1.3	Definiciones, Acrónimos y Abreviaturas
•	Indiobus: Es el transporte oficial de la UACJ
•	UACJ: Universidad Autónoma de Ciudad Juárez

# 1.4	Referencias
JavaFX 8
https://docs.oracle.com/javase/8/javafx/api/overview-summary.html
Java Api
https://docs.oracle.com/javase/7/docs/api/
Visualización de páginas web en java
http://panamahitek.com/visualizacion-de-paginas-web-en-java/
Como abrir sitios web en java
https://www.youtube.com/watch?v=oNTjr917cMw
Horarios del indiobus
http://www.uacj.mx/comunicacion/Documents/puros%20mapas.pdf

# 2.	Descripción General

# 2.1	Perspectiva del producto
Este producto te va a permitir saber la localización, Como llegar a la ubicación y el trayecto de los indiobuses.
# 2.2	Funciones del producto
•	Preguntar la localización del usuario.
•	Ver el recorrido de los indiobuses.
•	Tener una vista en primera persona del lugar donde está ubicado el indiobus.

# 2.3	Características de los usuarios
•	El usuario debe saber su dirección de domicilio (en caso de querer saber cómo llegar al indiobus).

# 2.4	Suposiciones y dependencias
Se debe tener una conexión a internet para poder utilizar los mapas de Google.# 

# 2.5	Requerimientos Futuros
Es necesario expandir el programa para que también nos pueda mostrar el orden en que se estacionan los indiobuses en la UACJ, porque a veces la gente toma los indiobuses de forma equivocada.

# 3.	Requerimientos Específicos

# 3.1 Interfaz
La interfaz grafica tiene que ser intuitiva para los usuarios, va a estar inspirada en la credencial que se utiliza para poder abordar los indiobuses para que los usuarios sepan que están utilizando una aplicación de la universidad.

•	Menú de inicio
o	La ventana tendrá un tamaño de 600 x 800 pixeles.
o	Tendrá en la parte inferior un label que te diga en que pestaña esta.
o	De fondo tendrá un prototipo del diseño de la credencial del indiobus.
o	Un botón que nos muestre los horarios.
	En un futuro podría tener más opciones.

•	Ventana de horarios
o	Tendrá el mismo fondo que el menú de inicio.
o	Tendrá una serie de botones que nos redireccionará a la demás ventana.
o	También tendrá un label de estatus en la parte inferior izquierda.

	

•	Ventana de Ubicación
o	Contendrá algunos labels que ayuden al usuario a guiarse por los botones.
o	Habrá 6 botones con diferentes funcionalidades.
	Localizar: Nos brindara el trayecto del hogar del usuario a el indiobus, y mostrara el mapa en la parte derecha de la ventana.
	Ubicación: Abrirá el navegador y nos mostrará en primera persona el lugar exacto donde se estaciona el indiobus.
	Recorrido: Nos mostrara el trayecto la parada del indiobus a la universidad en la parte derecha de la venta.
	Atrás: Nos envía directo a la ventana de horarios.
	Minimizar: No minimizara el mapa que nos muestra el trayecto del domicilio del usuario al indiobus y del indiobus a la UACJ respectivamente.
	Maximizar: No maximizara el mapa que nos muestra el trayecto del domicilio del usuario al indiobus y del indiobus a la UACJ respectivamente.
o	Tendrá una tabla que nos mostrara los horarios que tiene ese recorrido.
o	Tendrá un panel que nos mostrará algunos mapas.
o	Un label que nos muestre que ventana estamos viendo.

