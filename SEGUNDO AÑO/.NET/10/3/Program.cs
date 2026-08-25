using teoria10;

/*
a) Obtener el listado con los nombres de los alumnos que rindieron al menos un examen, ordenado
alfabéticamente (tip: puede utilizarse el método de extensión Distint() para obtener una
secuencia de elementos no repetidos). La salida debería ser:

Ana
Andrés
Camila
María
Paula
Raúl

b) Obtener el listado con los cursos donde se hayan rendido exámenes. Se debe listar el título del
curso junto con la cantidad de exámenes. El listado debe ordenarse por cantidad de exámenes. La
salida debería ser:

{ Título = Inglés, Cantidad = 2 }
{ Título = Historia, Cantidad = 2 }
{ Título = Literatura, Cantidad = 3 }
{ Título = Geografía, Cantidad = 4 }

c) Obtener el listado con los alumnos que hayan rendido al menos un exámen informando el
nombre del alumno, el título del curso y la nota del examen. La salida debería ser:

{ Alumno = Ana, Curso = Inglés, Nota = 5 }
{ Alumno = Ana, Curso = Geografía, Nota = 8 }
{ Alumno = Andrés, Curso = Geografía, Nota = 10 }
{ Alumno = Paula, Curso = Literatura, Nota = 7 }
{ Alumno = Paula, Curso = Historia, Nota = 9 }
{ Alumno = María, Curso = Literatura, Nota = 9 }
{ Alumno = María, Curso = Geografía, Nota = 5 }
{ Alumno = Camila, Curso = Historia, Nota = 5 }
{ Alumno = Camila, Curso = Literatura, Nota = 9 }
{ Alumno = Raúl, Curso = Inglés, Nota = 7 }
{ Alumno = Raúl, Curso = Geografía, Nota = 1 }


d) Filtrar el listado del punto anterior para mostrar sólo los casos aprobados (nota >=6).
e) Obtener el listado con los nombres de los alumnos que no han rendido ningún examen.
f) Obtener el listado de los alumnos que hayan rendido algún examen junto con el promedio de
todos sus exámenes. La salida debería ser:

{ Alumno = Ana, Promedio = 6,5 }
{ Alumno = Andrés, Promedio = 10 }
{ Alumno = Paula, Promedio = 8 }
{ Alumno = María, Promedio = 7 }
{ Alumno = Camila, Promedio = 7 }
{ Alumno = Raúl, Promedio = 4 }

*/

List<Alumno> alumnos = new List<Alumno>
    {
        new Alumno { AlumnoId = 1, Nombre = "Juan" },
        new Alumno { AlumnoId = 2, Nombre = "Ana" },
        new Alumno { AlumnoId = 3, Nombre = "Andrés" },
        new Alumno { AlumnoId = 4, Nombre = "Paula" },
        new Alumno { AlumnoId = 5, Nombre = "Sebastián" },
        new Alumno { AlumnoId = 6, Nombre = "María" },
        new Alumno { AlumnoId = 7, Nombre = "Camila" },
        new Alumno { AlumnoId = 8, Nombre = "Iván" },
        new Alumno { AlumnoId = 9, Nombre = "Raúl" }
    };

     
List<Curso> cursos = new List<Curso>
    {
        new Curso { CursoId = 1, Titulo = "Inglés" },
        new Curso { CursoId = 2, Titulo = "Matemática" },
        new Curso { CursoId = 3, Titulo = "Historia" },
        new Curso { CursoId = 4, Titulo = "Geografía" },
        new Curso { CursoId = 5, Titulo = "Literatura" },
        new Curso { CursoId = 6, Titulo = "Contabilidad" }
    };

        
List<Examen> examenes = new List<Examen>
    {
        new Examen { AlumnoId = 2, Nota = 5, CursoId = 1 },
        new Examen { AlumnoId = 4, Nota = 7, CursoId = 5 },
        new Examen { AlumnoId = 4, Nota = 9, CursoId = 3 },
        new Examen { AlumnoId = 3, Nota = 10, CursoId = 4 },
        new Examen { AlumnoId = 7, Nota = 5, CursoId = 3 },
        new Examen { AlumnoId = 2, Nota = 8, CursoId = 4 },
        new Examen { AlumnoId = 6, Nota = 9, CursoId = 5 },
        new Examen { AlumnoId = 9, Nota = 7, CursoId = 1 },
        new Examen { AlumnoId = 6, Nota = 5, CursoId = 4 },
        new Examen { AlumnoId = 9, Nota = 1, CursoId = 4 },
        new Examen { AlumnoId = 7, Nota = 9, CursoId = 5 }
    };


alumnos.Join(examenes, a=> a.AlumnoId, e=> e.AlumnoId, (a,e) => new {Alumno = a.Nombre}).Distinct().ToList().ForEach(a => Console.WriteLine(a.Alumno));

cursos.Join(examenes.GroupBy(e => e.CursoId), c => c.CursoId, e => e.Key , (c,e) => new{ Titulo = c.Titulo, Cantidad = e.Count()}).OrderBy(e => e.Cantidad).ToList().ForEach(e => Console.WriteLine($"Titulo = {e.Titulo}, Cantidad = {e.Cantidad}"));

alumnos.Join(examenes, a=> a.AlumnoId, e=> e.AlumnoId, (a,e) => new {Alumno = a.Nombre, Nota = e.Nota, CursoId = e.CursoId}).Join(cursos, c =>c.CursoId, ae => ae.CursoId, (ae,c) => new {Alumno = ae.Alumno, Nota = ae.Nota, Titulo = c.Titulo} ).ToList().ForEach(a => Console.WriteLine($"Alumno = {a.Alumno}, Curso = {a.Titulo}, Nota = {a.Nota}"));

alumnos.Join(examenes, a=> a.AlumnoId, e=> e.AlumnoId, (a,e) => new {Alumno = a.Nombre, Nota = e.Nota, CursoId = e.CursoId}).Join(cursos, c =>c.CursoId, ae => ae.CursoId, (ae,c) => new {Alumno = ae.Alumno, Nota = ae.Nota, Titulo = c.Titulo} ).Where(e => e.Nota >=6).ToList().ForEach(a => Console.WriteLine($"Alumno = {a.Alumno}, Curso = {a.Titulo}, Nota = {a.Nota}"));

alumnos.ExceptBy(examenes.Select(l2 => l2.AlumnoId), alumno => alumno.AlumnoId).ToList().ForEach(a => Console.WriteLine(a.Nombre));


alumnos.Join(examenes, a=> a.AlumnoId, e=> e.AlumnoId, (a,e) => new {Alumno = a.Nombre, Nota = e.Nota}).GroupBy(a => a.Alumno).ToList().ForEach(a => Console.WriteLine($"Nombre = {a.Key}, Promedio = {a.Average(x => x.Nota)}"));