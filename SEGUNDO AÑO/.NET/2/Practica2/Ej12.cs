/*
12) Definir el tipo de datos enumerativo llamado Meses y utilizarlo para:
a) Imprimir en la consola el nombre de cada uno de los meses en orden inverso (diciembre,
noviembre, octubre ..., enero)
b) Solicitar al usuario que ingrese un texto y responder si el texto tipeado corresponde al nombre de
un mes
Nota: en todos los casos utilizar un for iterando sobre una variable de tipo Meses
*/
//a)
for(Meses mes = Meses.diciembre; mes >= Meses.enero; mes--)
{
    Console.WriteLine(mes);
}
//b
string st =Console.ReadLine();
Meses mes2 = Meses.enero;
bool encontrado = false;
while((mes2 <= Meses.diciembre) && !(encontrado))
{
    if(mes2.ToString().Equals(st))encontrado = true;
    mes2++;
}
Console.WriteLine(encontrado);

//si se declara arriba los meses error
enum Meses
{
    enero,febrero,marzo,abril,
    mayo,junio,julio,agosto,octubre,
    noviembre,diciembre
}