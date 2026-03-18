/*
4) Resolver los errores de compilación en el siguiente fragmento de código. Utilizar el operador as
cuando sea posible.
object o = "Hola Mundo!";
string st = o;
int i = 12;
byte b = i;
double d = i;
float f = d;
o = i;
i = o + 1;
*/

object o = "Hola Mundo!";
string st = (string)o;
int i = 12;
byte b = (byte)i;
double d = i;
float f = (float)d;
o = i;
i = (int)o + 1;

Console.WriteLine(o);
Console.WriteLine(st);
Console.WriteLine(i);
Console.WriteLine(b);
Console.WriteLine(d);
Console.WriteLine(f);
Console.WriteLine(o);
Console.WriteLine(i);