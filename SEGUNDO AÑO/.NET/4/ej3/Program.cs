/*
3) Agregar a la clase Persona un método EsMayorQue(Persona p) que devuelva verdadero si la
persona que recibe el mensaje tiene más edad que la persona enviada como parámetro. Utilizarlo para
realizar un programa que devuelva la persona más jóven de la lista.
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
Persona menor = new Persona("ultramayor",99999999,0);
foreach(Persona p in lista)
{
    if (!p.EsMayorQue(menor))
    {
        menor = p;
    }
}
menor.Imprimir();

