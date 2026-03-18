/*
    Probar, analizar y responder para la
    próxima clase sobre el código siguiente:
    1. ¿Cuál es la salida por consola?
        10
        9
        8
        8
    2. ¿En qué difieren el pre y post decremento?
        en el post decremento de y = x--, primero se asigno el valor quedando y con 10, luego se decremento
        quedando x = 9, mientras que en el pre decremento x e y quedaron con ambos 8 porque primero se decremento
        y luego se asigno
*/

    int x = 10;
    int y = x--; //post decremento
    Console.WriteLine(y);
    Console.WriteLine(x);
    y = --x; //pre decremento
    Console.WriteLine(y);
    Console.WriteLine(x);