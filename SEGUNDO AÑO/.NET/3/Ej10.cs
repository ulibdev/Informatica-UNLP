/*
10) Verificar con un par de ejemplos si la sección opcional [:formatString] de formatos
compuestos redondea o trunca cuando se formatean números reales restringiendo la cantidad de
decimales. Plantear los ejemplos con cadenas de formato compuesto y con cadenas interpoladas.

redondea

*/

double r = 2.13123;
Console.WriteLine($"Valor = {r:0.0}");


r = 2.93123;
Console.WriteLine($"Valor = {r:0}");