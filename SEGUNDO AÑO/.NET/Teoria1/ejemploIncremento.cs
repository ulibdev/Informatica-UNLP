/*
    Probar, analizar y responder para la
    próxima clase sobre el código siguiente:
    1. ¿Cuál es la salida por consola?
        1
        2
        3
        3
    2. ¿En qué difieren el pre y post incremento?
        en post incrementa despues de utilizar el metodo y en pre antes
*/

int x = 1;
Console.WriteLine(x++); // post incremento
//como incrementa post en el siguiente saldra x+1
Console.WriteLine(x);

Console.WriteLine(++x);//pre incremento
//como incrementa pre en el siguiente saldra x
Console.WriteLine(x);