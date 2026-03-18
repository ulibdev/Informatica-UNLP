/*
    1) Consultar en la documentación de Microsoft y responder cuál es la diferencia entre los métodos
    WriteLine() y Write() de la clase System.Console ¿Cómo funciona el método ReadKey() de
    la misma clase? Escribir un programa que imprima en la consola la frase “Hola Mundo” haciendo una
    pausa entre palabra y palabra esperando a que el usuario presione una tecla para continuar.
    Tip: usar los métodos ReadKey() y Write() de la clase System.Console

    La diferencia entre WriteLine() y Write() es un salto de linea en "WriteLine()" despues de imprimir

    El metodo "ReadKey()" obtiene el siguiente caracter

*/

//pruebas
Console.Write("H");
Console.WriteLine("ola");
Console.Write(".");
Console.ReadKey();
Console.WriteLine();
for(int i = 1; i <= 50; i++)
{
    Console.Write("Hello");

}
Console.ReadKey();

Console.WriteLine();
/*
    se cambio la console por externalTerminal para poder utilizar ya que tiraba un error
    (An unhandled exception of type 'System.InvalidOperationException' occurred in System.Console.dll)
    el cual pasa cuando la aplicacion no posee consola 
*/
//Punto

Console.Write("Hello");
Console.ReadKey();
Console.Write("World");
Console.ReadKey();


/*
    Imprime hello pero si tocas enter al momento del ReadKey se vera reemplazado por world? pero
    si tocas espacio se imprimira Hello World
*/

