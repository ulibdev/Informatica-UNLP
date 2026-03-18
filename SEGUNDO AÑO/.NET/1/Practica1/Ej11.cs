/*
   11) Comprobar el funcionamiento del siguiente fragmento de código, analizar el resultado y contestar
    las preguntas.
    a) ¿Qué se puede concluir respecto del operador de división “/” ?
        si son enteros lo deja como enteros pero si son doubles lo imprimira como double
        en el caso de 10/3 imprime 3, en el caso de 10.0/3 o 10/3.0 imprime 3.3333
    b) ¿Cómo funciona el operador + entre un string y un dato numérico?
        los concatena
*/

Console.WriteLine("10/3 = " + 10 / 3);
Console.WriteLine("10.0/3 = " + 10.0 / 3);
Console.WriteLine("10/3.0 = " + 10 / 3.0);
int a = 10, b = 3;
Console.WriteLine("Si a y b son variables enteras, si a=10 y b=3");
Console.WriteLine("entonces a/b = " + a / b);
double c = 3;
Console.WriteLine("Si c es una variable double, c=3");
Console.WriteLine("entonces a/c = " + a / c);
Console.ReadKey();



