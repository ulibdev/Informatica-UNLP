{
2.- Escribir un programa que:
a. Implemente un módulo recursivo que genere y retorne una lista de números enteros
“random” en el rango 100-200. Finalizar con el número 100.
b. Un módulo recursivo que reciba la lista generada en a) e imprima los valores de la lista en el
mismo orden que están almacenados.
c. Implemente un módulo recursivo que reciba la lista generada en a) e imprima los valores de
la lista en orden inverso al que están almacenados.
d. Implemente un módulo recursivo que reciba la lista generada en a) y devuelva el mínimo
valor de la lista.
e. Implemente un módulo recursivo que reciba la lista generada en a) y un valor y devuelva
verdadero si dicho valor se encuentra en la lista o falso en caso contrario.
}
program ej2;

type
	
	lista = ^nodo;
	
	nodo = record
		dato:integer;
		sig:lista;
	end;

procedure cargarLista(var l:lista);
var
	nuevo:lista;
begin
	new(nuevo);
	nuevo^.dato:=random(20-10+1)+10;
	nuevo^.sig:=l;
	l:=nuevo;
	if(nuevo^.dato <> 10) then cargarLista(l);
end;

procedure imprimirLista(l:lista);
begin
	if(l<>nil)then begin
		writeln(l^.dato);
		imprimirLista(l^.sig);
	end;
end;
//preguntar 
procedure imprimirListaInversa(l:lista);
begin
	if(l<>nil)then begin
		imprimirLista(l^.sig);
		writeln(l^.dato);
	end;
end;


function devolverMinimo(l:lista;num:integer):integer;
begin
	if(l<>nil) then begin
		if(l^.dato < num) then begin
			num:=l^.dato;
			devolverMinimo:=devolverMinimo(l^.sig,num)
		end
		else
			devolverMinimo:= num
	end
end;

function buscar(l:lista;num:integer):boolean;

begin
		if(l<>nil) then begin
			if(l^.dato = num) then buscar := true
							else buscar:=buscar(l^.sig,num);
		
		end else buscar:= false;
			
end;

var
	l:lista;min:integer;
BEGIN
	min:=9999;
	randomize;
	cargarLista(l);
	writeln('recursivo:');
	imprimirLista(l);
	writeln('inversa:');
	imprimirListaInversa(l);
	writeln('menor:',devolverMinimo(l,min));
	writeln('existe?',buscar(l,15))
END.

