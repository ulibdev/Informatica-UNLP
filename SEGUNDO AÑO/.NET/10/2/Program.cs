
/*
2) Listar por consola la cantidad de veces que se repiten los elementos de un vector de enteros. Ordenar
por cantidad de repeticiones. Completar el siguiente código para que la salida por consola sea la
indicada
*/


int[] vector = [1, 3, 4, 5, 9, 4, 3, 4, 5, 1, 1, 4, 9, 4, 3, 1];
vector.GroupBy(n => n)
      .OrderBy(g => g.Count())
      .Select(g => new { Numero = g.Key, Cantidad = g.Count() })
      .ToList()
      .ForEach(obj => Console.WriteLine(obj));