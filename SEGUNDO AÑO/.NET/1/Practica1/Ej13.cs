/*
   13) Si a y b son variables enteras, identificar el problema (y la forma de resolverlo) de la siguiente
    expresión. Tip: observar qué pasa cuando b = 0.
    if ((b != 0) & (a/b > 5)) Console.WriteLine(a/b);

    Hay que hacerlo de cortocircuito
*/

int a = 60;
int b = 0;
if ((b != 0) && (a/b > 5)) Console.WriteLine(a/b); 
Console.ReadKey();



