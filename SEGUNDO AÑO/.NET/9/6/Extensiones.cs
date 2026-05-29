
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

    public static IEnumerable<T> Donde<T>(this IEnumerable<T> secuencia,Func<T,Boolean> a)
    {
        List<T> nuevo = new List<T>();
        foreach(T x in secuencia)
        {
            if (a(x))
            {
                nuevo.Add(x);
            }
        }
        return nuevo;
    }
    public static IEnumerable<TResult> Seleccionar<T, TResult>(this IEnumerable<T> secuencia,Func<T,TResult> a)
    {
        List<TResult> nuevo = new List<TResult>();
        foreach(T x in secuencia)
        {
           nuevo.Add(a(x));
        }
        return nuevo;
    }

}