/*
1) Tomar como base el ejercicio 2 de la práctica 7 e incorporar las interfaces, propiedades y métodos
necesarios para que el siguiente código produzca la salida indicada:
Carlos: Carlos es una persona
Chopper: Chopper es un perro
Claudia: Claudia es una persona
Sultán: Sultán es un perro
Zulema: Zulema es una persona
*/


using teoria7;
INombrable[] vector = [
new Persona() {Nombre="Ana María"},
new Perro() {Nombre="Sultán"},
new Persona() {Nombre="Ana"},
new Persona() {Nombre="José Carlos"},
new Perro() {Nombre="Chopper"}
];
Array.Sort(vector, new ComparadorLongitudNombre());//ordena por longitud de Nombre
foreach (INombrable n in vector)
{
Console.WriteLine($"{n.Nombre.Length}: {n.Nombre}");
}