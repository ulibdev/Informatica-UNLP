/*
15) Contar Frecuencia de Palabras en Texto.
a) Crear un método ContarFrecuenciaPalabras que reciba una cadena de texto y devuelva un
diccionario con el conteo de cada palabra.
b) El conteo debe ser insensible a mayúsculas/minúsculas (tratar "Hola" y "hola" como iguales).
c) Dentro del método, procesar el texto para separar las palabras. Considerar usar texto.Split()
separando por espacios y signos de puntuación comunes.
d) Utilizar y devolver un Dictionary<string, int> donde la clave es la palabra y el valor su
frecuencia.
e) Probar el método: Llamarlo con un texto de ejemplo y mostrar en consola cada palabra y su
frecuencia del diccionario resultante.
Ejemplo de Salida Esperada (para "Hola, hola. Me escuchan? o no me escuchan?"):
*/
Dictionary<string,int> ContarFrecuenciaPalabras(string s)
{
    s = s.ToUpper();
    Dictionary<string, int> palabrasCant = new Dictionary<string, int>();
    string [] palabras = s.Split(',',' ','.','?');
    
    foreach(string palabra in palabras)
    {
        if (palabrasCant.ContainsKey(palabra))
        {
            palabrasCant[palabra] +=1;
        }else palabrasCant.Add(palabra,1);
        
    }
    return palabrasCant;
}



Dictionary<string, int> palabras = ContarFrecuenciaPalabras("Hola,hola.Me escuchan?o no me escuchan?");

foreach (var p in palabras)
{
    Console.WriteLine(p.Key + " " + p.Value);
}
