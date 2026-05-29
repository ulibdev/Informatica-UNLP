/*
2) Codificar los métodos que faltan para que el siguiente código produzca la salida en la consola
indicada.

1 2 110
True False True
Hola Mundo! dos tres
*/


int[] vector1 = [1, 2, 3];
bool[] vector2 = [true, true, true];
string[] vector3 = ["uno", "dos", "tres"];
Set<int>(vector1, 110, 2);
Set<bool>(vector2, false, 1);
Set<string>(vector3, "Hola Mundo!", 0);
Imprimir(vector1);
Imprimir(vector2);
Imprimir(vector3);

void Set<T>(T[] a ,T nuevo,int pos) {
    a[pos] = nuevo;
}

void Imprimir<T>(T[] vector)
{
    foreach(T e in vector)
    {
        Console.Write(e + " ");
    }
    Console.WriteLine();
}