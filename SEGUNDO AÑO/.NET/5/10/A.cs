using System;

namespace teoria5;
/*
10) Identificar todos los miembros en la siguiente declaración de clase. Indicar si se trata de un
constructor, método, campo, propiedad o indizador, si es estático o de instancia, y en caso que
corresponda si es de sólo lectura, sólo escritura o lectura y escritura. En el caso de las propiedades
indicar también si se trata de una propiedad auto-implementada.
Nota: La clase compila perfectamente. Sólo prestar atención a la sintaxis, la semántica es irrelevante.
*/
class A
{
private static int a;//campo estatico  lectura y escritura
private static readonly int b;//campo estatico solo lectura
A() { } //constructor instancia
public A(int i) : this() { } //constructor instancia
static A() => b = 2; // constructor estatico
int c;// campo instancia lectura y escritura
public static void A1() => a = 1;// metodo estatico
public int A1(int a) => A.a + a; //metodo instancia
public static int A2;//campo estatico escritura y lectura
static int A3 => 3; //?????
private int A4() => 4; //metodo instancia
public int A5 { get => 5; } //propiedad instancia solo lectura
int A6 { set => c = value; }//propiedad instancia solo escritura
public int A7 { get; set; }//propiedad autoimplementada lectura y escritura
public int A8 { get; } = 8;//propiedad instancia solo lectura

public int this[int i] => i; //indizador instancia solo lectura
}
