# Problema Uno: Punched Cards
Un equipo secreto de programadores está conspirando para alterar el panorama de los lenguajes de programación y recuperar las tarjetas
perforadas mediante la introducción de un nuevo lenguaje llamado python de tarjetas perforadas que permite a las personas
codificar en python usando tarjetas perforadas. 
Como buenos disruptores, van a lanzar una campaña viral para promocionar su nuevo lenguaje antes incluso de tener el diseño 
de un prototipo. Para la campaña quieren dibujar tarjetas perforadas de diferentes tamaños en arte ASCII.

El arte ASCII de una tarjeta perforada que quieren dibujar es similar a una matriz RxC sin la celda superior izquierda.
Eso significa que tiene (R.C)-1 celdas en total. Cada celda se dibuja en arte ASCII como un punto (.) rodeado de guiones
(-) arriba y abajo, barras verticales (|) a la izquierda y a la derecha, y signos (+) para cada esquina. Las celdas adyacentes
comparten los caracteres comunes en el borde. Los puntos (.) se utilizan para alinear las celdas en la fila superior.

### Ejemplo
La siguiente es una tarjeta perforada con R = 3 filas y C = 4 columnas:

..+-+-+-+

..|.|.|.|

+-+-+-+-+

|.|.|.|.|

+-+-+-+-+

|.|.|.|.|

+-+-+-+-+

### Input
(int) T = equivales al numero de casos que se ingresaran
(int R) = equivales a las filas
(int C) = equivales a las columnas

### Output
Dibujo de la tarjeta perforada, como se describe arriba.