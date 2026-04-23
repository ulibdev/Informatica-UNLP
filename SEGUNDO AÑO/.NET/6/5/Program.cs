/*
5) ¿Qué líneas del siguiente código provocan error de compilación y por qué?
la clase persona esta por default en internal provocando dificultad en el acceso al devolver Persona porque en otros namespaces
es ilegal al no saber que es una persona 
*/

public class Persona
{
public string Nombre { get; set; }
}
public class Auto
{
private Persona _dueño1, _dueño2;
public Persona GetPrimerDueño() => _dueño1;
protected Persona SegundoDueño
{
set => _dueño2 = value;
}
}