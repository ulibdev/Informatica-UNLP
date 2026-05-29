/*
7) Dada la siguiente clase que representa una regla de validación con un mensaje de error asociado

El campo _predicado es una función que toma un objeto de tipo T y devuelve un valor booleano
indicando si la regla se cumple o no.
La propiedad MensajeError es un mensaje descriptivo que se mostrará si la regla de validación no se
cumple.
Se debe implementar la clase Validador<T> que permitirá la validación de objetos de tipo T según las
reglas proporcionadas.
Métodos:
1. AgregarRegla(ReglaValidacion<T> regla): Este método deberá agregar una regla de
validación a la lista de reglas que el validador aplicará.
2. Validar(T objeto, out List<string> errores): Este método deberá validar el objeto
proporcionado según todas las reglas de validación agregadas. Los errores encontrados deben
almacenarse en la lista errores. Esta lista debe contener los mensajes de error correspondientes
a las reglas de validación que no se cumplieron.
El siguiente código, debe producir la salida por la consola indicada:

Validando a Pedro de 17 años ==> False
* Menor de edad
Validando a de 16 años ==> False
* Falta el nombre
* Menor de edad
Validando a María de 44 años ==> False
* Edad excedida
Validando a José de 30 años ==> True
*/
using teoria9;

var regla1 = new ReglaValidacion<Persona>(p => p.Nombre != "", "Falta el nombre");
var regla2 = new ReglaValidacion<Persona>(p => p.Edad <= 35, "Edad excedida");
var regla3 = new ReglaValidacion<Persona>(p => p.Edad >= 18, "Menor de edad");
var validadorPersona = new Validador<Persona>()
.AgregarRegla(regla1)
.AgregarRegla(regla2)
.AgregarRegla(regla3);
var pedro = new Persona { Nombre = "Pedro", Edad = 17 };
var ana = new Persona { Nombre = "", Edad = 16 };
var maria = new Persona { Nombre = "María", Edad = 44 };
var jose = new Persona { Nombre = "José", Edad = 30 };
Validar(pedro, validadorPersona);
Validar(ana, validadorPersona);
Validar(maria, validadorPersona);
Validar(jose, validadorPersona);
void Validar(Persona p, Validador<Persona> validadorPersona)
{
List<string> listaErrores;
bool esValido = validadorPersona.Validar(p, out listaErrores);
Console.WriteLine($"Validando a {p} ==> {esValido}");
listaErrores.ForEach(st => System.Console.WriteLine(" * " + st));
}