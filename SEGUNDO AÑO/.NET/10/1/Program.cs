/*
1) Utilizando el método Range de la clase System.Linq.Enumerable y los métodos de LINQ que
sean necesarios, obtener:
a) Lista con todos los múltiplos de 5 entre 100 y 200
b) Lista con todos los números primos menores que 100
c) Lista con las potencias de 2, desde 2 0 a 2 10
d) La suma y el promedio de los valores de la lista anterior
e) Lista de todos los n2 que terminan con el dígito 6, para n entre 1 y 20

f) Lista con los nombres de los días de la semana en inglés que contengan una letra ‘u’
(tip: utilizar el enumerativo DayOfWeek)

*/

var lista1 = Enumerable.Range(100,101).Where(n => n%5 == 0);

var lista2 = Enumerable.Range(0,100).Where(n => EsPrimo(n));

var lista3 = Enumerable.Range(0,11).Select(n => Math.Pow(2,n));

var lista4 = Enumerable.Range(1,21).Select(n => Math.Pow(n,2)).Where(n=> n % 10 == 6);

var lista5 = Enum.GetNames(typeof(DayOfWeek)).Where(n => n.Contains('u'));

foreach(string i in lista5)
{
    Console.WriteLine(i);
}

Console.WriteLine(lista3.Sum());
Console.WriteLine(lista3.Average());


bool EsPrimo(int numero)
{
    if (numero < 2) return false;
    if (numero == 2) return true;
    if (numero % 2 == 0) return false; 

    int limite = (int)Math.Sqrt(numero);
    for (int i = 3; i <= limite; i += 2)
    {
        if (numero % i == 0) return false;
    }
    return true;
}
