{
4.- Una librería requiere el procesamiento de la información de sus productos. De cada
producto se conoce el código del producto, código de rubro (del 1 al 6) y precio.
Implementar un programa que invoque a módulos para cada uno de los siguientes puntos:
a. Lea los datos de los productos y los almacene ordenados por código de producto y
agrupados por rubro, en una estructura de datos adecuada. El ingreso de los productos finaliza
cuando se lee el precio -1.
b. Una vez almacenados, muestre los códigos de los productos pertenecientes a cada rubro.
c. Genere un vector (de a lo sumo 20 elementos) con los productos del rubro 3. Considerar que
puede haber más o menos de 20 productos del rubro 3. Si la cantidad de productos del rubro 3
es mayor a 20, almacenar los primeros 20 que están en la lista e ignore el resto.
d. Ordene, por precio, los elementos del vector generado en c) utilizando alguno de los dos
métodos vistos en la teoría.
e. Muestre los precios del vector resultante del punto d).
f. Calcule el promedio de los precios del vector resultante del punto d).
}
program ej4;
const
	dimf= 6;
	dimf2=20;
type
	producto= record
		codigoP:integer;
		codigoR:1..6;
		precio:real;
	end;
	
	lista= ^nodo;
	
	nodo = record
		dato:producto;
		sig:lista;
	end;
	
	vector = array [1..dimf] of lista;
	vectorProducto = array [1..dimf2] of producto;

procedure leerProducto(var p:producto);
begin
	write('precio:');readln(p.precio);
	if(p.precio <> -1)then begin
	write('codigo Producto:');readln(p.codigoP);
	write('codigo Rubro:');readln(p.codigoR);
	end;

end;

procedure insertarOrdenado(var l:lista;p:producto);
var
	ant,act,nuevo:lista;
begin
	new(nuevo);
	nuevo^.dato:=p;
	nuevo^.sig:=nil;
	if(l<>nil) then begin
		act:=l;
		while(act<>nil) and (act^.dato.codigoP<nuevo^.dato.codigoP) do begin
			ant:=act;
			act:=act^.sig;
		end;
		if(act =l)then l:=nuevo
				  else ant^.sig:= nuevo;
		nuevo^.sig:=act;
	end else l:=nuevo;
end;

procedure cargarVector(var v:vector);
var
	p:producto;
begin
	leerProducto(p);
	while(p.precio<>-1)do begin
		insertarOrdenado(v[p.codigoR],p);
		leerProducto(p);
	end;
end;

procedure imprimirLista(l:lista);
begin
	while(l<>nil)do begin
		writeln(l^.dato.codigoP);
		l:=l^.sig;
	end;
end;

procedure imprimirVector(v:vector);
var
	i:integer;
begin
	for i:=1 to dimf do begin
		writeln('rubro ',i,':');
		imprimirLista(v[i]);
	end;

end;

procedure cargarVectorElem(v:vector;var vec:vectorProducto;var diml:integer;r:integer);
var
	l:lista;i:integer;
begin
	i:=0;
	l:=v[r];
	while(l<>nil) and (i<20) do begin
		i:=i+1;
		vec[i]:=l^.dato;
		l:=l^.sig;
	end;
	diml:=i;
end;

procedure ordenarSeleccion(var v:vectorProducto;diml:integer);
var
	j,pos,i:integer;aux:producto;
begin
	for i:=1 to diml-1 do begin
		pos:=i;
		for j:=i+1 to diml do begin
			if(v[j].precio < v[pos].precio) then pos:=j
		end;
		aux:=v[pos];
		v[pos]:=v[i];
		v[i]:=aux;
	end;
end;

function calcularPromedio(v:vectorProducto;diml:integer):real;
var
	total:real;i:integer;
begin
	total:=0;
	for i:=1 to diml do begin
		total:= total + v[i].precio;
	end;
	calcularPromedio:=total/diml;
end;

procedure imprimirPrecios(v:vectorProducto;diml:integer);
var
	i:integer;
begin
	for i:=1 to diml do write(v[i].precio:2:2,',');
end;

var
	v:vector;diml,i:integer;vec:vectorProducto;
BEGIN
	for i:=1 to dimf do begin
		v[i]:=nil;
	end;
	cargarVector(v);
	imprimirVector(v);
	cargarVectorElem(v,vec,diml,3);
	ordenarSeleccion(vec,diml);
	imprimirPrecios(vec,diml);
	calcularPromedio(vec,diml);
	
END.

