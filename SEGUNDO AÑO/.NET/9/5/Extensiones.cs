
namespace teoria9;
public static class Extensiones
{
    public static void ForEach<T>(this IEnumerable<T> secuencia,Action<T> a)
    {
        foreach(T x in secuencia)
        {
            a(x);
        }
    }

}