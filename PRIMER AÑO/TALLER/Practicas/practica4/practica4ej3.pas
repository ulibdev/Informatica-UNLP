{
3. Implementar un programa modularizado para una librería. Implementar módulos para:
* 
a. Almacenar los productos vendidos en una estructura eficiente para la búsqueda por
código de producto. De cada producto deben quedar almacenados su código, la
cantidad total de unidades vendidas y el monto total. De cada venta se lee código de
venta, código del producto vendido, cantidad de unidades vendidas y precio unitario. El
ingreso de las ventas finaliza cuando se lee el código de venta -1.
* 
b. Imprimir el contenido del árbol ordenado por código de producto.
* 
c. Retornar el código de producto con mayor cantidad de unidades vendidas.
* 
d. Retornar la cantidad de códigos que existen en el árbol que son menores que un valor
que se recibe como parámetro.
* 
e. Retornar el monto total entre todos los códigos de productos comprendidos entre dos
valores recibidos (sin incluir) como parámetros.
}


program practica4ej3;

type
	producto = record
		codigo:integer;
		unidades,monto:real;
	end;
	venta =record
		codigov,codigop:integer;
		cantidad,precio:real;
	end;
	
	arbol = ^nodo;
	
	nodo = record
		dato:producto;
		hi,hd:arbol;
	end;
	
procedure leerVenta(var v:venta);
begin
	write('codigo venta:');readln(v.codigov);
	if(v.codigov <>-1) then begin
	write('codigo producto:');readln(v.codigop);
	write('cantidad:');readln(v.cantidad);
	write('precio:');readln(v.precio);
	end;
end;	

procedure juntarDatos(var p:producto;p2:producto);
begin
	p.unidades:= p.unidades + p2.unidades;
	p.monto:=p.monto + p2.monto;
end;

procedure AgregarArbol(var a:arbol;p:producto);
begin
	if(a = nil)then begin
		new(a);
		a^.dato:=p;
		a^.hi:=nil;
		a^.hd:=nil;
	end else if(a^.dato.codigo > p.codigo ) then AgregarArbol(a^.hi,p)
		else if(a^.dato.codigo < p.codigo) then AgregarArbol(a^.hd,p)
		else juntarDatos(a^.dato,p);
end;	

procedure hacerArbol(var a:arbol);
var
	v:venta;p:producto;
begin
	leerVenta(v);
	while(v.codigov <> -1) do begin
	p.codigo:=v.codigop;
	p.monto:=v.cantidad * v.precio;
	p.unidades:=v.cantidad;
	AgregarArbol(a,p);
	leerVenta(v);
	end;
end;

procedure imprimirProducto(p:producto);
begin
	writeln('codigo producto:',p.codigo);
	writeln('unidades vendidas',p.unidades:2:2);
	writeln('monto total',p.monto:2:2);
end;
procedure ImprimirArbol(a:arbol);
begin
	if(a <> nil) then begin
		imprimirArbol(a^.hi);
		imprimirProducto(a^.dato);
		imprimirArbol(a^.hd);
	end;
end;


procedure maxUnidades(a:arbol;var codigo:integer;var max:real);
begin
	if(a <> nil) then begin
		if(a^.dato.unidades > max) then begin
			max:= a^.dato.unidades;
			codigo:=a^.dato.codigo;
		end;
		maxUnidades(a^.hi,codigo,max);
		maxUnidades(a^.hd,codigo,max);
	end;
end;

function cantMenores(a:arbol;num:integer):integer;
begin
	if(a<>nil) then begin
		if(a^.dato.codigo < num) then begin
		cantMenores:= 1 + cantMenores(a^.hi,num) + cantMenores(a^.hd,num); 
		end else cantMenores:=cantMenores(a^.hi,num);
	end else cantMenores:= 0;
end;

function montoTotal(a:arbol;valor1,valor2:integer):real;
begin
	if(a<>nil) then begin
		if(a^.dato.codigo > valor1) and (a^.dato.codigo < valor2) then begin
			montoTotal:=a^.dato.monto + montoTotal(a^.hi,valor1,valor2) + montoTotal(a^.hd,valor1,valor2)
		end else if(a^.dato.codigo >= valor2) then montoTotal:= montoTotal(a^.hi,valor1,valor2)
			else if(a^.dato.codigo <= valor1) then montoTotal:= montoTotal(a^.hd,valor1,valor2);
	end else montoTotal:=0;

end;
var
	a:arbol;
	c:integer;max:real;
BEGIN//^<>
	a:=nil;
	max:=-1;
	hacerArbol(a);
	imprimirArbol(a);
	maxUnidades(a,c,max);
	writeln(c,' ',max:2:2);
	writeln('menores :',cantMenores(a,10));
	writeln(montoTotal(a,5,10):2:2);
END.

