# Pokemon ABC
#### Definicion del problema 
Se desea crear un sistema de ABC, que estara enfocado con una tematica del videojuego japones "Pokemon". 
#### Objetivo: 
Crear el sistema de ABC, esto se lograra con la implementacion del uso del API de Java, tambien se desea conectarse con una base de datos, para poder ingresar el "Pokemon" que se esta utilizando y tener los datos de él guardados. Despues de esto se desea tener un equipo que sera conformado de 6 Pokemones. 
La forma en el que el sistema de ABC funcionara sera el siguiente:
- Altas: El Pokemon se registra o es ingresado a un equipo, maximo 6 pokemones, minimo 1. El equipo puede enfrentarse a otros entrenadores. No importa si un equipo tiene mas elementos que el adversario.  Va a regresar un int, que seria la cantidad de pokemones que contiene un equipo.
- Bajas: Cuando un "Entrenador" desea cambiar un Pokemon de su equipo, este realizara una baja a su equipo para poder ingresar otro. Otra forma para realizar esto seria atravez de una batalla en la que al momento de perder contra otro pokemon, osea al momento de perder toda la vida, este sea dado de baja. Y al momento de tener 0 Pokemones registrados en el equipo pierde el juego.
- Cambios: Como los pokemones son elementos en constante cambio, por cada batalla ellos pueden perder vida, o regenerar esta.

##### Pokemon:
Los pokemones pueden tener una de las 5 clases que vamos a definir estas serian:
- Agua
- Fuego
- Planta
- Tierra/Fantasma
- Electricidad
El concepto que se tiene es que cada uno, puede realizar un daño extra al que esta debajo de el. Como en el caso de Agua-Fuego, si tu atacas a un Tipo Fuego con un tipo Agua, se tendria un ataque extra. Igual en el caso de Fuego-Planta, el tipo planta que es atacado recibe un daño extra. 
En el caso de la defena seria al revez, como si atacas un Fuego-Agua, el Pokemon Agua recibira un daño, pero seria disminuido por una constante de daño.