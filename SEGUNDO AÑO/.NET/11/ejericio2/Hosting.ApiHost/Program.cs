using Hosting.Aplicacion;

var builder = WebApplication.CreateBuilder(args);

builder.Services.AddScoped<IServicioNotificacion,ServicioNotificacion>();
builder.Services.AddSingleton<IGestorAlertasGlobales,GestorAlertaGlobales>();


var app = builder.Build();


app.MapGet("/", (IGestorAlertasGlobales gestor) => {return "hola";});

app.Run();


/*
Un Singleton no puede depender directamente de un Scoped, ya que el Scoped podría desaparecer mientras el Singleton sigue existiendo.
*/