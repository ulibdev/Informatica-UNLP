{a) Implementar un módulo que lea compras de videojuegos. De cada compra se lee
código del videojuego, código de cliente y mes. La lectura finaliza con el código de
cliente 0. Se sugiere utilizar el módulo leerCompra(). El módulo debe retornar un árbol
binario de búsqueda ordenado por código de videojuego. En el árbol, para cada código
de videojuego debe almacenarse una lista con código de cliente y mes perteneciente a
cada compra.
b) Implementar un módulo que reciba el árbol generado en a) y un código de videojuego.
El módulo debe retornar la lista de las compras de ese videojuego.
c) Implementar un módulo recursivo que reciba la lista generada en b) y un mes. El
módulo debe retorne la cantidad de clientes que compraron en el mes ingresado}


program untitled;

type
 compra = record
 cod_videojuego : integer;
 cod_cliente : integer;
 mes : integer;
 end;

	lista = ^nodol;
	datol = record
		codigo:integer;
		mes:integer;
	end;
	
	nodol = record
		dato:datol;
		sig:lista;
		end;

	arbol = ^nodo;

	nodo = record
		codigo:integer;
		dato:lista;
		hi,hd:arbol;
		end;


procedure leerCompra (var c : compra);
begin
 c.cod_cliente := Random(200);
 if (c.cod_cliente <> 0)
 then begin
 c.mes := Random(12) + 1;
 c.cod_videojuego := Random(200) + 1000;
 end;
end;

procedure agregarLista(var l:lista;c:compra);
var
	aux:lista; d:datol;
begin
	new(aux);
	d.codigo:=c.cod_cliente;
	d.mes:=c.mes;
	aux^.dato:=d;
	aux^.sig:=l;
	l:=aux;
end;


procedure cargarArbol(var a:arbol; c:compra);
begin
		if(a = nil) then begin
			new(a);
			a^.dato:=nil;
			a^.codigo:= c.cod_videojuego;
			agregarLista(a^.dato,c);
			a^.hi:=nil;
			a^.hd:=nil;
		end else if (a^.codigo < c.cod_videojuego) then cargarArbol(a^.hd,c)
			else if (a^.codigo > c.cod_videojuego) then cargarArbol(a^.hi,c)
			else agregarLista(a^.dato,c);
end;

procedure llenarArbol(var a:arbol);
var
	c:compra;
begin
		leerCompra(c);
		while (c.cod_cliente <>0)do begin
			cargarArbol(a,c);
			leerCompra(c);
		end;
		
end;

function retornarLista(a:arbol;cod:integer):lista;
begin
			if (a <> nil) then begin
			if(a^.codigo = cod) then retornarLista:= a^.dato
			else if(a^.codigo > cod) then retornarLista:=retornarLista(a^.hi,cod)
			else  if(a^.codigo < cod) then retornarLista:=retornarLista(a^.hd,cod)
			end else retornarLista:= nil;
end;

function contarCompras(l:lista;mes:integer):integer;
begin
			if(l<>nil)then begin
				if(l^.dato.mes = mes) then contarCompras := 1 + contarCompras(l^.sig,mes)
				else contarCompras:= contarCompras(l^.sig,mes);
			end else contarCompras := 0;
end;

procedure imprimirArbol(a:arbol);
begin
		if(a <> nil) then begin
			imprimirArbol(a^.hi);
			writeln(a^.codigo);
			imprimirArbol(a^.hd);
		end;

end;

var
	a:arbol;mes,cod:integer;
	l:lista;
BEGIN
	l:=nil;
	a:=nil;
	llenarArbol(a);
	imprimirArbol(a);
	writeln('cod:');readln(cod);
	l:=retornarLista(a,cod);
	write('mes');readln(mes);
	if (l <> nil) then writeln(contarCompras(l,mes))
					else writeln('no existe');
END.
