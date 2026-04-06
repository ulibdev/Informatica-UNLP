/*
7) ¿De qué tipo quedan definidas las variables x, y, z en el siguiente código?

int i = 10;int
var x = i * 1.0;double
var y = 1f;float
var z = i * y;float
*/

int i = 10;
var x = i * 1.0;
var y = 1f;
var z = i * y;

Console.WriteLine(x.GetType());

Console.WriteLine(y.GetType());

Console.WriteLine(z.GetType());