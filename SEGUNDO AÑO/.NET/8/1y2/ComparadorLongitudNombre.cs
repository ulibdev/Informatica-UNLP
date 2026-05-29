namespace teoria7;

public class ComparadorLongitudNombre : System.Collections.IComparer
{
    public int Compare(object? x, object? y)
    {
        // 1. Si son exactamente la misma referencia (o ambos null), son iguales
        if (x == y) return 0;
        // 2. Por convención en .NET, null es menor que cualquier objeto
        if (x == null) return -1;
        if (y == null) return 1;
        // 3. Si ambos son Nombrables, comparamos sus longitudes de nombre.
        if (x is INombrable p1 && y is INombrable p2)
        {
            return p1.Nombre.Length.CompareTo(p2.Nombre.Length);
        }
        // 4. Si llegamos acá, significa que nos pasaron algo que no es Nombrable.
        throw new ArgumentException("Ambos objetos deben ser de tipo Inombrable");
    }
}