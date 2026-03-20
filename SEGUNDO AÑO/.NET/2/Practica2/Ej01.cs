/*
1) Sea el siguiente código:
    object o1 = "A";
    object o2 = o1;
    o2 = "Z";
    Console.WriteLine(o1 + " " + o2);
    El tipo object es un tipo referencia, por lo tanto luego de la sentencia o2 = o1 ambas variables están
    apuntando a la misma dirección. ¿Cómo explica entonces que el resultado en la consola no sea “Z Z”?
    porque son strings y al ser string lo que hace no es cambiar el valor 
    sino desligarse tomar otro espacio de memoria y hacer un nuevo string
*/

object o1 = "A";
object o2 = o1;
o2 = "Z";
Console.WriteLine(o1 + " " + o2);

