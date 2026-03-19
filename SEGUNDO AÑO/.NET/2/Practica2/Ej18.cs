
/*
18) Escribir una función (método int Fac(int n)) que calcule el factorial de un número n pasado al
programa como parámetro por la línea de comando
a) Definiendo una función no recursiva
b) Definiendo una función recursiva
c) idem a b) pero con expression-bodied methods (Tip: utilizar el operador condicional ternario)
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


Console.WriteLine(FacNR(int.Parse(args[0])));

Console.WriteLine(FacSR(int.Parse(args[0])));

Console.WriteLine(FacSROCT(int.Parse(args[0])));