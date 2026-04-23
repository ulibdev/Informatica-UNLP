/*
4) Contestar sobre el siguiente programa:

¿Por qué no es necesario agregar :base en el constructor de Taxi? Eliminar el segundo constructor de
la clase Auto y modificar la clase Taxi para el programa siga funcionando.

porque tiene un constructor vacio y lo usa por default
*/

Taxi t = new Taxi(3);
Console.WriteLine($"Un {t.Marca} con {t.Pasajeros} pasajeros");
class Auto
{
public string Marca { get; private set; } = "Ford";
public Auto(string marca) => this.Marca = marca;
}
class Taxi : Auto
{
public int Pasajeros { get; private set; }
public Taxi(int pasajeros):base("Ford") => this.Pasajeros = pasajeros;
}