namespace teoria11;


public class AppRunner(IProcesador procesador){
    
    public void ejecutar()
    {
        procesador.Procesar();
    }

}