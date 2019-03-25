Create Database Pokemon

Use Pokemon

Create table Pokemon (
   Codigo int,
   Nombre varchar(30),
   HP int,
   ATK int, 
   DEF int,
   VEL int,
   Tipo varchar(10)
)

Select *
From Pokemon

Insert into Pokemon(Codigo, Nombre, HP, ATK, DEF, VEL, Tipo) values (1, 'Bulbasaur', 45, 49, 49, 45, 'Grass')
Insert into Pokemon(Codigo, Nombre, HP, ATK, DEF, VEL, Tipo) values (2, 'Ivysaur', 60, 62, 63, 60, 'Grass')
Insert into Pokemon(Codigo, Nombre, HP, ATK, DEF, VEL, Tipo) values (3, 'Venusaur', 80, 82, 83, 80, 'Grass')
Insert into Pokemon(Codigo, Nombre, HP, ATK, DEF, VEL, Tipo) values (4, 'Charmander',39,52,43,65,'Fire')
Insert into Pokemon(Codigo, Nombre, HP, ATK, DEF, VEL, Tipo) values (5,'Charmeleon', 58,64,58,80,'Fire')
Insert into Pokemon(Codigo, Nombre, HP, ATK, DEF, VEL, Tipo) values (6, 'Charizard', 78, 84, 78, 100, 'Fire')
Insert into Pokemon(Codigo, Nombre, HP, ATK, DEF, VEL, Tipo) values (7, 'Squirtle', 44,48,65,43, 'Water')
Insert into Pokemon(Codigo, Nombre, HP, ATK, DEF, VEL, Tipo) values (8,'Wartortle', 58,63,80,58, 'Water')
Insert into Pokemon(Codigo, Nombre, HP, ATK, DEF, VEL, Tipo) values (9, 'Blastoise', 79,83,100,78, 'Water')




DELETE FROM Pokemon WHERE Codigo=1

DROP TABLE Pokemon