using System;

namespace teoria5;

public class Cuenta
{
    private double _saldo;
    private readonly int id;
    private static int s_id = 0;
    private static int s_cantDepositos = 0;
    private static int s_cantExtracciones = 0;
    private static int s_cantExtraccionesDenegadas = 0;
    private static double s_totalDepositado = 0;
    private static double s_totalExtraido = 0;
    private static double s_totalSaldo = 0;

    private static List<Cuenta> s_cuentas = new List<Cuenta>();

    public static List<Cuenta> cuentas
    {
        get => new List<Cuenta>(s_cuentas);
    }

    public Cuenta()
    {   
        s_id +=1;
        id = s_id;
        s_cuentas.Add(this);
        Console.WriteLine($"Se creó la cuenta Id={s_id}");
    }

    public Cuenta Depositar(double num)
    {
        s_cantDepositos+=1;
        s_totalDepositado+=num;
        _saldo+=num;
        s_totalSaldo+=num;
        Console.WriteLine($"Se depositó {num} en la cuenta {id} (Saldo={_saldo})");
        return this;
    }

    public Cuenta Extraer(double num)
    {
        if(_saldo >= num)
        {
            s_cantExtracciones+=1;
            s_totalSaldo-= num;
            _saldo -= num;
            s_totalExtraido += num;
            Console.WriteLine($"Se extrajo {num} en la cuenta {id} (Saldo={_saldo})");
        }else {
            Console.WriteLine("Operación denegada - Saldo insuficiente");
            s_cantExtraccionesDenegadas+=1;
        }
        return this;
    }


    public static void ImprimirDetalle()
    {
        Console.WriteLine($"Cuentas creadas {s_id}");
        Console.WriteLine($"Depositos       {s_cantDepositos}   -total depositados: {s_totalDepositado}");
        Console.WriteLine($"Extracciones:   {s_cantExtracciones}   -total Extraidos:   {s_totalExtraido}");
        Console.WriteLine($"                    -Saldo:             {s_totalSaldo}");
        Console.WriteLine($"Se denegaron {s_cantExtraccionesDenegadas} extracciones por falta de fondos");
    }

}
