
/*
21) Codificar el método Imprimir para que el siguiente código produzca la salida por consola que se
observa. Considerar que el usuario del método Imprimir podría querer más adelante imprimir otros
datos, posiblemente de otros tipos pasando una cantidad distinta de parámetros cada vez que invoque el
método. Tip: usar params

Imprimir(1, "casa", 'A', 3.4, DayOfWeek.Saturday);
Imprimir(1, 2, "tres");
Imprimir();
Imprimir("-------------");

1 casa A 3,4 Saturday
1 2 tres
*/


void Imprimir (params object[] vector)
{
    foreach (object s in vector)
    {
        Console.Write(s);
        Console.Write(" ");
    }
    Console.WriteLine();
}

Imprimir(1, "casa", 'A', 3.4, DayOfWeek.Saturday);
Imprimir(1, 2, "tres");
Imprimir();
Imprimir("-------------");