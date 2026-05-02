/*
1) Codificar las clases e interfaces necesarias para modelar un sistema que trabaja con las siguientes
entidades: Autos, Libros, Películas, Personas y Perros. Algunas de estas entidades pueden ser:
alquilables (pueden ser alquiladas y devueltas por una persona), vendibles (pueden ser vendidas a una
persona), lavables (se pueden lavar y secar) reciclables (se pueden reciclar) y atendibles (se pueden
atender). A continuación se describen estas relaciones:
● Son Alquilables: Libros y Películas
● Son Vendibles: Autos y Perros
● Son Lavables: Autos
● Son Reciclables: Libros y Autos
● Son Atendibles: Personas y Perros
Completar el código de la clase estática Procesador:

static class Procesador
{
public static void Alquilar(IAlquilable x, Persona p) => x.SeAlquilaA(p);
public static 
}

Auto auto = new Auto();
Libro libro = new Libro();
Persona persona = new Persona();
Perro perro = new Perro();
Pelicula pelicula = new Pelicula();
Procesador.Alquilar(pelicula, persona);
Procesador.Alquilar(libro, persona);
Procesador.Atender(persona);
Procesador.Atender(perro);
Procesador.Devolver(pelicula, persona);
Procesador.Devolver(libro, persona);
Procesador.Lavar(auto);
Procesador.Reciclar(libro);
Procesador.Reciclar(auto);
Procesador.Secar(auto);
Procesador.Vender(auto, persona);
Procesador.Vender(perro, persona);

Alquilando película a persona
Alquilando libro a persona
Atendiendo persona
Atendiendo perro
Película devuelta por persona
Libro devuelto por persona
Lavando auto
Reciclando libro
Reciclando auto
Secando auto
Vendiendo auto a persona
Vendiendo perro a persona


2) Incorporar al ejercicio anterior la posibilidad también de lavar a los perros. También se debe
incorporar una clase derivada de Película, las “películas clásicas” que además de alquilarse pueden
venderse. Estos cambios deben poder realizarse sin necesidad de modificar la clase estática Procesador.
El siguiente código debe producir la salida indicada:

Alquilando película a persona
Alquilando libro a persona
Atendiendo persona
Atendiendo perro
Película devuelta por persona
Libro devuelto por persona
Lavando auto
Reciclando libro
Reciclando auto
Secando auto
Vendiendo auto a persona
Vendiendo perro a persona
Lavando perro
Secando perro
Alquilando película clásica a persona
Película clásica devuelta por persona
Vendiendo película clásica a persona


*/


using teoria7;

Auto auto = new Auto();
Libro libro = new Libro();
Persona persona = new Persona();
Perro perro = new Perro();
Pelicula pelicula = new Pelicula();
Procesador.Alquilar(pelicula, persona);
Procesador.Alquilar(libro, persona);
Procesador.Atender(persona);
Procesador.Atender(perro);
Procesador.Devolver(pelicula, persona);
Procesador.Devolver(libro, persona);
Procesador.Lavar(auto);
Procesador.Reciclar(libro);
Procesador.Reciclar(auto);
Procesador.Secar(auto);
Procesador.Vender(auto, persona);
Procesador.Vender(perro, persona);
Procesador.Lavar(perro);
Procesador.Secar(perro);
PeliculaClasica peliculaClasica = new PeliculaClasica();
Procesador.Alquilar(peliculaClasica, persona);
Procesador.Devolver(peliculaClasica, persona);
Procesador.Vender(peliculaClasica, persona);
