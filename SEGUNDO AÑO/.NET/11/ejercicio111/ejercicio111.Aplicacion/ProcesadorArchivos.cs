
namespace teoria11;
public class ProcesadorArchivos(ProcesadorOptions opciones) : IProcesador 
{
    public void Procesar()
    {
        Console.WriteLine($"Procesando un máximo de {opciones.MaxArchivosPorLote} archivos desde la ruta: {opciones.DirectorioEntrada}");
    }
}