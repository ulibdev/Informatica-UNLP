/*
1) Definir una clase Persona con 3 campos públicos: Nombre, Edad y DNI. Escribir un algoritmo que
permita al usuario ingresar en una consola una serie de datos de esta forma:
Nombre,Documento,Edad <ENTER>.

Una vez finalizada la entrada de datos, el programa debe imprimir en la consola un listado con 4
columnas de la siguiente forma:
Nro) Nombre Edad DNI.
Ejemplo de listado por consola:
1) Juan Perez 40 2098745
2) José García 41 1965412
...
*/

using teoria2;

List<Persona> lista = new List<Persona>();
for(int i =1;i<=3;i++){
    string s = Console.ReadLine();
    string[]separado = s.Split(',');
    Persona p = new Persona(separado[0],int.Parse(separado[1]),int.Parse(separado[2]));
    lista.Add(p);
}
int a = 1;
foreach(Persona p in lista)
{
    Console.Write(a++ +")");
    p.Imprimir();
    Console.WriteLine();
}

