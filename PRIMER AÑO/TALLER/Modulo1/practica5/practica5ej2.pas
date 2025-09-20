{
2. Una agencia dedicada a la venta de autos ha organizado su stock y, tiene la información de
los autos en venta. Implementar un programa que:
a) Genere la información de los autos (patente, año de fabricación (2015..2024), marca,
color y modelo, finalizando con marca ‘MMM’) y los almacene en dos estructuras de
datos:
i. Una estructura eficiente para la búsqueda por patente.
ii. Una estructura eficiente para la búsqueda por marca. Para cada marca se deben
almacenar juntas las patentes y colores de los autos pertenecientes a ella.
b) Invoque a un módulo que reciba la estructura generado en a) i y una marca y retorne la
cantidad de autos de dicha marca que posee la agencia.
c) Invoque a un módulo que reciba la estructura generado en a) ii y una marca y retorne
la cantidad de autos de dicha marca que posee la agencia.
d) Invoque a un módulo que reciba el árbol generado en a) i y retorne una estructura con
la información de los autos agrupados por año de fabricación.
e) Invoque a un módulo que reciba el árbol generado en a) i y una patente y devuelva el
modelo del auto con dicha patente.
f) Invoque a un módulo que reciba el árbol generado en a) ii y una patente y devuelva el
color del auto con dicha patente.
}


program pract5ej2;

type
	auto = record
		patente:integer;
		anio:2015..2024;
		modelo,color,marca:string;
	end;
	
	arbol = ^nodo;
	
	nodo = record
		dato:auto;
		hi,hd:arbol;
	end;
	
	auto2 = record
		patente:integer;
		color:string;
	end;
	
	arbol2 = ^nodo2;
	
	lista = ^nodol;
	
	nodol = record
		dato:auto2;
		sig:lista;
	end;
	
	nodo2 = record
		marca:string;
		dato:lista;
		hi,hd:arbol2;
	end;
	

	lista2 = ^nodol2
	
	auto3 = record
		patente:integer;
		modelo,color,marca:string;
	end;
	
	nodol2 = record
		dato:auto3;
		sig:lista;
	end;
	vector= array [2015..2024]of lista2; 
	
procedure cargarArbol(var a1:arbol;var a2:arbol2);
		procedure leerAuto(var a:auto);
		begin
			write('marca:');readln(a.marca);
			if(a.marca <> 'MMM') then begin
				write('patente:');readln(a.patente);
				write('anio:');readln(a.anio);
				write('modelo:');readln(a.modelo);
				write('color:');readln(a.color);
			end;
		end;
		
		procedure agregarAdelante(var l:lista; a:auto2);
		var
			aux:lista;
		begin
			new(aux);
			aux^.dato:=a;
			aux^.sig:=l;
			l:=aux;
		end;
		
		procedure agregarArbol1(var a:arbol; auto:auto);
		begin
				if(a = nil) then begin
					new(a);
					a^.dato:=auto;
					a^.hi:=nil;
					a^.hd:=nil;
				end else if (a^.dato.patente > auto.patente ) then agregarArbol1(a^.hi,auto)
					else agregarArbol1(a^.hd,auto);
		end;
		
		procedure agregarArbol2(var a:arbol2;auto:auto2;marca:string);
		begin
			if(a = nil) then begin
					new(a);
					a^.dato:=nil;
					a^.marca:=marca;
					agregarAdelante(a^.dato,auto);
					a^.hi:=nil;
					a^.hd:=nil;
				end else if (a^.marca > marca ) then agregarArbol2(a^.hi,auto,marca)
					else if (a^.marca < marca ) then agregarArbol2(a^.hd,auto,marca)
					else agregarAdelante(a^.dato,auto);
		
		end;
		
		var 
			aut1:auto;
			aut2:auto2;
		begin
			leerAuto(aut1);
			while(aut1.marca <> 'MMM') do begin
				agregarArbol1(a1,aut1);
				aut2.patente:=aut1.patente;
				aut2.color:=aut1.color;
				agregarArbol2(a2,aut2,aut1.marca);
				leerAuto(aut1);
			end;
		end;

function cantAutos(a:arbol;marca:string):integer;
begin
	if(a<> nil) then begin
		if(a^.dato.marca = marca) then cantAutos:= cantAutos(a^.hi,marca) + cantAutos(a^.hd,marca) + 1
		else cantAutos:= cantAutos(a^.hi,marca) + cantAutos(a^.hd,marca);
	end else cantAutos:= 0;
end;

function cantAutos2(a:arbol2;marca:string):integer;
	function contarLista(l:lista):integer;
	var
		cant:integer;
	begin
		cant:=0;
		while(l<>nil)do begin
			cant:=cant+1;
			l:=l^.sig;
		end;
		contarLista:=cant;
	end;
	begin
		if(a^.marca = marca) then cantAutos2:= contarLista(a^.dato)
		else if( a^.marca < marca) then cantAutos2:= cantAutos2(a^.hd,marca)
		else if( a^.marca > marca)then cantAutos2:= cantAutos2(a^.hi,marca)
		else cantAutos2:=0;
	end;
var
	a1:arbol;
	a2:arbol2;
	marca:string;
BEGIN//^<>
	a1:=nil;
	a2:=nil;
	cargarArbol(a1,a2);
	readln(marca);
	writeln(cantAutos(a1,marca));
	writeln(cantAutos2(a2,marca));
	
END.

