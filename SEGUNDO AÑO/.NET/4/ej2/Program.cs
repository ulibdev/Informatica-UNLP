/*
2) Modificar el programa anterior haciendo privados todos los campos. Definir un constructor adecuado
y un método público Imprimir() que escriba en la consola los campos del objeto con el formato
requerido para el listado.
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

