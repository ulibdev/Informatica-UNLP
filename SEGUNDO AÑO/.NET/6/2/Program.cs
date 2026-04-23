/*
2) Aunque consultar en el código por el tipo de un objeto indica habitualmente un diseño ineficiente,
por motivos didácticos vamos a utilizarlo. Completar el siguiente código, que utiliza las clases
definidas en el ejercicio anterior, para que se produzca la salida indicada:
B_3 --> A_3
B_5 --> A_5

Es decir, se deben imprimir sólo los objetos cuyo tipo exacto sea B
a) Utilizando el operador is
b) Utilizando el método GetType() y el operador typeof() (investigar sobre éste último en la
documentación en línea de .net)

*/

//la herencia lo toma si le mandas un a is B, asi que un c y un d son considerados b
A[] vector = [ new C(1),new D(2),new B(3),new D(4),new B(5)];
foreach (A a in vector)
{
    if(!(a is D) && !(a is C))
    {
        a.Imprimir();
    }
}
Console.WriteLine("-------------------------");
//se ve que el typeof no le afecta la herencia 
foreach (A a in vector)
{
    if((a.GetType() == typeof(B)))
    {
        a.Imprimir();
    }
}

class A
{
    protected int _id;
    public A(int id) => _id = id;
    public virtual void Imprimir() => Console.WriteLine($"A_{_id}");
}
class B : A
{
    public B(int id):base(id){}
    public override void Imprimir()
    {
        Console.Write($"B_{_id} ---> ");
        base.Imprimir();
    }
}
class C : B
{
    public C(int id):base(id){}
    public override void Imprimir()
    {
        Console.Write($"C_{_id} ---> ");
        base.Imprimir();
    }
}
class D : C
{
    public D(int id):base(id){}
    public override void Imprimir()
    {
        Console.Write($"D_{_id} ---> ");
        base.Imprimir();
    }
}



