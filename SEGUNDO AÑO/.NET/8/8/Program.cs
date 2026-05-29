/*
8) Agregar al ejercicio anterior el método de extensión Donde(...) para el tipo int[] que recibe
como parámetro un delegado de tipo Predicado y devuelve un nuevo vector de enteros con los
elementos del vector que cumplen ese predicado. El siguiente programa debe producir la salida
indicada.
Valores iniciales: 1, 2, 3, 4, 5
Pares: 2, 4
Impares al cuadrado: 1, 9, 25
*/
using teoria8;

int[] vector =[1, 2, 3, 4, 5];
vector.Print("Valores iniciales: ");
vector.Donde(n => n % 2 == 0).Print("Pares: ");
vector.Donde(n => n % 2 == 1).Seleccionar(n => n * n).Print("Impares al cuadrado: ");