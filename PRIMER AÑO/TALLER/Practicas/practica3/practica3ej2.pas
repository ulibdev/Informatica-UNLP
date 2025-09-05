{
2. Escribir un programa que:
a. Implemente un módulo que genere aleatoriamente información de ventas de un comercio.
Para cada venta generar código de producto, fecha y cantidad de unidades vendidas. Finalizar
con el código de producto 0. Un producto puede estar en más de una venta. Se pide:
* 
i. Generar y retornar un árbol binario de búsqueda de ventas ordenado por código de
producto. Los códigos repetidos van a la derecha.
* 
ii. Generar y retornar otro árbol binario de búsqueda de productos vendidos ordenado por
código de producto. Cada nodo del árbol debe contener el código de producto y la
cantidad total de unidades vendidas.
* 
iii. Generar y retornar otro árbol binario de búsqueda de productos vendidos ordenado por
código de producto. Cada nodo del árbol debe contener el código de producto y la lista de
las ventas realizadas del producto.
* 
Nota: El módulo debe retornar TRES árboles.
b. Implemente un módulo que reciba el árbol generado en i. y una fecha y retorne la cantidad
total de productos vendidos en la fecha recibida.
c. Implemente un módulo que reciba el árbol generado en ii. y retorne el código de producto
con mayor cantidad total de unidades vendidas.
c. Implemente un módulo que reciba el árbol generado en iii. y retorne el código de producto
con mayor cantidad de ventas.
}


program ej2;

type
	fecha= record
		dia,mes,anio:integer;
	end;
	venta= record
	unidad,codigo:integer;
		f:fecha;
	end;
	
	arbol= ^nodo;
	
	nodo= record
		dato:venta;
		hi:arbol;
		hd:arbol;
	end;
	
procedure generarVenta(var v:venta);
var

begin
	v.codigo:= random(999);
	if(v.codigo <>0)then begin
		v.unidad:=random(999-1+1)+1;
		v.f.dia:=random(30-1+1)+1;
		v.f.mes:=random(12-1+1)+1;
		v.f.anio:=random(2025-1500+1)+1500;
	end;

end;	

procedure agregarArbol(var a:arbol,v:venta);
begin
	if(a=nil)then begin
		new(a);
		a^.dato:= v;
		a^.hi:=nil;
		a^.hd:=nil;
	end else if(v.codigo >= a^.dato.codigo) then agregarArbol(a^.hd,v)
		else agregarArbol(a^.hi,v)
end;
var
	arbol1:arbol;
	arbol2:arbol;
	arbol3:arbol;
BEGIN//^<>
	randomize;
	
END.

