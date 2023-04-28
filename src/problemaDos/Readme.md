# Problema Dos: Drawing Book
Un maestro le pide a la clase que abra sus libros en un número de página. Un estudiante 
puede comenzar a pasar las páginas desde el frente del libro o desde la parte posterior 
del libro. Siempre pasan las páginas de una en una. Cuando abren el libro, la pagina 1 siempre 
está del lado derecho:
Cuando pasan la página 1, ven las páginas 2 y 3. Cada página excepto la última página siempre se 
imprimirá en ambos lados. La última página sólo podrá imprimirse en el anverso, dada la 
extensión del libro. si el libro es n páginas de largo, y un estudiante quiere pasar a la 
página p, ¿cuál es el número mínimo de páginas para pasar? Pueden comenzar al principio o 
al final del libro.

Dado n y p, busque e imprima el número mínimo de páginas que deben pasarse para llegar a la página p.

### Ejemplo
n = 6
p = 2

Usando el ejemplo de arriba, si el estudiante quiere ir a la página 2, abren el libro en la página 1, voltean 1 página y están en la página correcta. 
Si abren el libro en la última página, página 6, se vuelven 2 página y están en la página correcta. Devolver el menor valor en este caso 1.

**Función descriptiva**

Complete la función pageCount.

pageCount tiene los siguientes parámetros:

**int n:** el número de páginas del libro

**int p:**  el número de página a donde ir

**Devoluciones**

**int:** el número mínimo de páginas para girar