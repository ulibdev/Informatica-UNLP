/*
7) ¿Cuál es la salida por consola del siguiente fragmento de código? ¿Por qué la tercera y sexta línea
producen resultados diferentes?
char c1 = 'A';
char c2 = 'A';
Console.WriteLine(c1 == c2);
object o1 = c1;
object o2 = c2;
Console.WriteLine(o1 == o2);

porque con los char solo compara los valores en la pila en cambio, con los object
compara si la direccion guardada en la pila es la misma 
*/

char c1 = 'A';
char c2 = 'A';
Console.WriteLine(c1 == c2);// true
object o1 = c1;
object o2 = c2;
Console.WriteLine(o1 == o2);//false