using System;

namespace teoria7;
static class Procesador
{
    public static void Alquilar(IAlquilable x, Persona p) => x.SeAlquilaA(p);
    public static void Atender(IAtendible x) => x.Atender();
    public static void Devolver(IAlquilable x, Persona p) => x.Devolver(p);
    public static void Lavar(ILavable x) => x.Lavar();
    public static void Secar(ILavable x) => x.Secar();

    public static void Reciclar(IReciclable x) => x.Reciclar();

    public static void Vender(IVendible x, Persona p) => x.Vender(p);
}
