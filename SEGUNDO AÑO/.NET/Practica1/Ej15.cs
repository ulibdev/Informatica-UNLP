/*
   15) ¿Cuál es el problema del código siguiente y cómo se soluciona?
   int i = 0;
    for (int i = 1; i <= 10;)
    {
    Console.WriteLine(i++);
    }
    
    doble int declarado
    depende de lo que se quiera hacer, en este caso podriamos borrar
    int i = 0 y dejar el int i=1 dentro del for
    
*/

for (int i = 1; i <= 10;)
{
    Console.WriteLine(i++);
}
Console.ReadKey();



