/*
    5) Idem. al ejercicio anterior salvo que se imprimirá un mensaje de saludo diferente según sea el
    nombre ingresado por el usuario. Así para “Juan” debe imprimir “¡Hola amigo!”, para “María” debe
    imprimir “Buen día señora”, para “Alberto” debe imprimir “Hola Alberto”. En otro caso, debe
    imprimir “Buen día ” seguido del nombre ingresado o “¡Buen día mundo!” si se ha ingresado una línea
    vacía.
*/
    
    Console.WriteLine("Ingresa un nombre");
    string nombre = Console.ReadLine();
    //A
    if (nombre.Equals("Juan"))
    {
        Console.WriteLine("¡Hola amigo!");
    }else if (nombre.Equals("Maria"))
    {
        Console.WriteLine("Buen día señora");
    }else if (nombre.Equals("Alberto"))
    {
        Console.WriteLine("Hola " + nombre);
    }else if (nombre.Equals(""))
    {
        Console.WriteLine("¡Buen día mundo!");
    }else Console.WriteLine("Buen día " + nombre);

//B

switch (nombre)
{
    case "Juan":   
        Console.WriteLine("¡Hola amigo!");
        break;
    case "Maria":   
        Console.WriteLine("Buen día señora");
        break;
    case "Alberto":   
        Console.WriteLine("Hola " + nombre);
        break;
    case "":   
        Console.WriteLine("¡Buen día mundo!");
        break;
    default:   
        Console.WriteLine("Buen día " + nombre);
        break;
}

Console.ReadKey();



