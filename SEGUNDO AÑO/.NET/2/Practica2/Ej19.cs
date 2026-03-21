
/*
18) Escribir una función (método int Fac(int n)) que calcule el factorial de un número n pasado al
programa como parámetro por la línea de comando
a) Definiendo una función no recursiva
b) Definiendo una función recursiva
c) idem a b) pero con expression-bodied methods (Tip: utilizar el operador condicional ternario)

19) Idem. al ejercicio 18.a) y 18.b) pero devolviendo el resultado en un parámetro de salida void
Fac(int n, out int f)

*/

//no recursion
int FacNR(int n)
{
    int acu = 1;
    for(int i = 2; i <= n; i++)
    {
        acu*=i;
    }
    return acu;
}
//si recursion
int FacSR(int n)
{
    if(n == 1)return n;
    else return n * FacSR(n-1);
}
//si recursion + operador condicional ternario
int FacSROCT(int n) => n == 1? n : n * FacSROCT(n -1);

void FACOUT(int n, out int f)
{
    int acu = 1;
    for(int i = 2; i <= n; i++)
    {
        acu*=i;
    }
    f = acu;
}

void FACOUTR(int n, out int f)
{
    if(n == 1)f = 1;
    else
    {   
        int f2;
        FACOUTR(n-1,out f2);
        f = n* f2;
    } 
}

Console.WriteLine(FacNR(int.Parse(args[0])));

Console.WriteLine(FacSR(int.Parse(args[0])));

Console.WriteLine(FacSROCT(int.Parse(args[0])));
int x;
FACOUT(int.Parse(args[0]),out x);
Console.WriteLine(x);

int y;
FACOUT(int.Parse(args[0]),out y);
Console.WriteLine(y);