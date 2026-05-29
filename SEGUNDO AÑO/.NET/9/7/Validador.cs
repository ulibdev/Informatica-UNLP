namespace teoria9;

class Validador<T>
{
    private List<ReglaValidacion<T>> reglas = new List<ReglaValidacion<T>>();
    public Validador<T> AgregarRegla(ReglaValidacion<T> regla)
    {
        reglas.Add(regla);
        return this;
    }

    public bool Validar(T objeto, out List<string> errores)
    {
        errores = new List<string>();

        foreach (ReglaValidacion<T> regla in reglas)
        {
            if (!regla.Ok(objeto)) {
                errores.Add(regla.MensajeError);
            }
        }

        return errores.Count == 0;
        
    }
}