using teoria11;
using Microsoft.Extensions.Configuration;
using Microsoft.Extensions.Hosting;

var builder = Host.CreateApplicationBuilder(args);



var options = builder.Configuration.GetSection("ProcesadorOptionsConfig").Get<ProcesadorOptions>() ?? new ProcesadorOptions();
IProcesador procesador = new ProcesadorArchivos(options);
AppRunner app = new AppRunner(procesador);
app.ejecutar();

