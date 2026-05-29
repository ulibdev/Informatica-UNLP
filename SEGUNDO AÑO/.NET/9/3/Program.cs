/*
3) Codificar los métodos genéricos CrearArreglo y GetNuevoObjetoDelMismoTipo que faltan
para que el siguiente código produzca la salida en la consola indicada. El método
GetNuevoObjetoDelMismoTipo debe crear y devolver un nuevo elemento del mismo tipo del que
recibe como parámetro. Tip: Para codificar el método CrearArreglo tener presente el uso de params

uno - dos -
1 - 2,3 - 4,1 - 6,7 -
System.Text.StringBuilder
System.Int32
*/

string[] vector1 = CrearArreglo<string>("uno", "dos");
foreach (string st in vector1) Console.Write(st + " - ");
Console.WriteLine();
double[] vector2 = CrearArreglo<double>(1, 2.3, 4.1, 6.7);
foreach (double valor in vector2) Console.Write(valor + " - ");
Console.WriteLine();
var stb = new System.Text.StringBuilder();
var a = GetNuevoObjetoDelMismoTipo(stb);
var b = GetNuevoObjetoDelMismoTipo(17);
Console.WriteLine(a.GetType());
Console.WriteLine(b.GetType());

T[] CrearArreglo<T>(params T[] x)
{
    return x;
}

T GetNuevoObjetoDelMismoTipo<T> (T x) where T: new()
{
    
    return new T();
}