/*
15) Determinar qué hace el siguiente programa y explicar qué sucede si no se pasan parámetros cuando
se invoca desde la línea de comandos.
Console.WriteLine("¡Hola {0}!", args[0]);

Basicamente {0} es un placeholder asi que al pasarle args[0] toma el primer parametro que le pasamos,
pero si le pasamos otro paramentro este ira la siguiente posicion asi que habria que pasar args[1],
ademas van por orden

si no pasamos parametro tira error System.IndexOutOfRangeException que dice que nos fuimos del limite
del array

*/

Console.WriteLine("¡Hola {0}!", args[0]);
Console.WriteLine("Adios {0}", args[1]);

