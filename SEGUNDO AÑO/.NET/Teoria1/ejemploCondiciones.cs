/*
    Probar, analizar y responder para la
    próxima clase sobre el código siguiente:
    1. ¿Cuál es la salida por consola?
        true
        true
        true
        true
    2. ¿ si se reemplaza int x = 2; por int x = 0;?
        An unhandled exception of type 'System.DivideByZeroException' occurred in teoria1.dll
        (que ocurrio una division por zero y no se puede eso)
*/


int x = 0;
int y = 5;
Console.WriteLine(x != 0 && y / x == 2);
Console.WriteLine(x != 0 & y / x == 2);
/*
    Basicamente cuando las condiciones estan en cortocircuito "&&"
    se corta en la primera condicion como con x!=0, al ser zero
    ya corta ahi y no evalua la segunda asi evitando la division en zero, 
    pero en la siguiente linea no esta en cortocircuito asi que se evaluan
    ambas condiciones asi teniendo que hacer una division por zero provocando el error
*/
Console.WriteLine(x == 0 || y / x == 2);
Console.WriteLine(x == 0 | y / x == 2);