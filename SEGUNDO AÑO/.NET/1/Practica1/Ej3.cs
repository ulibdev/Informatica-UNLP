/*
    3) El carácter @ delante de un string desactiva los códigos de escape. Probar el siguiente fragmento
    de código, eliminar el carácter @ y utilizar las secuencias de escape necesarias para que el programa
    siga funcionando de igual manera
    string st = @"c:\windows\system";
    Console.WriteLine(st);
*/

/*
    string st = @"c:\windows\system";
    Console.WriteLine(st);
    imprime c:\windows\system
*/
    string st = "c:\\windows\\system";
    Console.WriteLine(st);
    Console.ReadKey();




