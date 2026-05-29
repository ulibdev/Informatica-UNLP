namespace teoria9;

class ListaEnlazada<T>
{
    private Nodo<T> inicio;
    
    
    public void AgregarAdelante(T argumento)
    {
        if (inicio is not null)
        {
            Nodo<T> nuevo = new Nodo<T>(argumento);
            nuevo.Proximo = inicio;
            inicio = nuevo;
        } else
        {
            inicio = new Nodo<T>(argumento);
        }
    }

    public void AgregarAtras(T argumento)
    {
        if(inicio is null)inicio = new Nodo<T>(argumento);
        else {
            Nodo<T> recorrer = inicio;
            while(recorrer.Proximo is not null)
            {
                recorrer = recorrer.Proximo;
            }
            recorrer.Proximo = new Nodo<T>(argumento);
        }
    }

    public IEnumerator<T> GetEnumerator()
    {
        Nodo<T> actual = inicio;
        while (actual is not null)
        {
            yield return actual.Valor;
            actual = actual.Proximo;
        }
    }
}