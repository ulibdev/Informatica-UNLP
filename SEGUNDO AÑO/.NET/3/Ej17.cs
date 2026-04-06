/*
17) Implementar un programa que permita al usuario ingresar números por la consola. Debe ingresarse
un número por línea finalizado el proceso cuando el usuario ingresa una línea vacía. A medida que se
van ingresando los valores el sistema debe mostrar por la consola la suma acumulada de los mismos.
Utilizar double.Parse() y try/catch para validar que la entrada ingresada sea un número válido,
en caso contrario advertir con un mensaje al usuario y proseguir con el ingreso de datos.
*/

string s = Console.ReadLine();
double cantTotal = 0;
while(!string.IsNullOrWhiteSpace(s)){
    try
    {
       cantTotal += double.Parse(s);
       s = Console.ReadLine();
    }catch(FormatException e)
    {
        Console.WriteLine("error no mandaste un double");
        s = Console.ReadLine();
    }
    catch(Exception e)
    {
        Console.WriteLine("ERROR");
        s = Console.ReadLine();
    }
}
Console.WriteLine(cantTotal);
