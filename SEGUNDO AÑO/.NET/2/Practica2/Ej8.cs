/*
8) Investigar acerca de la clase StringBuilder del espacio de nombre System.Text ¿En qué
circunstancias es preferible utilizar StringBuilder en lugar de utilizar string? Implementar un
caso de ejemplo en el que el rendimiento sea claramente superior utilizando StringBuilder en lugar
de string y otro en el que no.

el stringbuilder es mejor a la hora de modificar string porque los string son inmutables,
es decir que cuando uno lo quiere modificar en realidad lo que se hace es hacer un string
totalmente nuevo ocupando otro espacio en memoria y perder lo anterior

StringBuilder.Append	
agrega informacion al final

StringBuilder.Insert	
inserta

StringBuilder.Remove	
remueve

StringBuilder.Replace	
reemplaza
*/

using System.Text;
//en este caso gana StringBuilder
string hola = ".";
for(int i = 0; i< 100; i++)
{
    hola = hola + "hola";
}

StringBuilder constructor = new StringBuilder(".");
for(int i = 0; i< 100; i++)
{
    constructor.Append("hola");
}
Console.WriteLine(hola);
Console.WriteLine(constructor);

//pero si se quiere hacer algo simple solo una vez gana string