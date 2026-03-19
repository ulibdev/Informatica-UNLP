
int n = int.Parse(args[0]);
for(int i= 1; i< n; i++)
{
    if(EsPrimo(i))Console.WriteLine(i);
}

bool EsPrimo(int n)
{
    if(n <= 1)return false;
    else for (int i = 2;i<= Math.Sqrt(n); i++)
    {
        if(n%i == 0)return false;
    }
    return true;
}