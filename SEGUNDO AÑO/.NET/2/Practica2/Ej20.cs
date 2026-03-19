
/*
20) Codificar el método Swap que recibe 2 parámetros enteros e intercambia sus valores. El cambio
debe apreciarse en el método invocador.

*/


void Swap(ref int x,ref int y)
{
    int aux = x;
    x = y;
    y = aux;
}

int x = 1;
int y = 2;
Console.WriteLine(y);
Console.WriteLine(x);
Swap(ref x,ref y);
Console.WriteLine(y);
Console.WriteLine(x);