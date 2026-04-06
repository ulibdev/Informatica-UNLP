/*
9) ¿Qué líneas del siguiente método provocan error de compilación y por qué?
var a = 3L;
dynamic b = 32;
object obj = 3;
a = a * 2.0; long x double error
b = b * 2.0;
b = "hola";
obj = b;
b = b + 11;
obj = obj + 11; objeto desconoce si es string int o lo que sea asi hay que castearlo
var c = new { Nombre = "Juan" };
var d = new { Nombre = "María" };
var e = new { Nombre = "Maria", Edad = 20 };
var f = new { Edad = 20, Nombre = "Maria" };
f.Edad = 22; no modificable
d = c;
e = d;distintos tipos
f = e;distintos tipos
*/

