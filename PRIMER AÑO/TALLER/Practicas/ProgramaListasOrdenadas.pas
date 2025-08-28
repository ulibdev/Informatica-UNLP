{
a) Implemente un módulo CargarListaOrdenada que cree una lista de
enteros y le agregue valores aleatorios entre el 100 y 150, hasta que se
genere el 120. Los valores dentro de la lista deben quedar ordenados
de menor a mayor.
b) Reutilice el módulo ImprimirLista que reciba una lista generada en a) e
imprima todos los valores de la lista en el mismo orden que están
almacenados.
c) Implemente un módulo BuscarElementoOrdenado que reciba la lista
generada en a) y un valor entero y retorne true si el valor se encuentra
en la lista y false en caso contrario.
d) Invocar desde el programa principal a los módulos implementados
para crear una lista ordenada, mostrar todos sus elementos y
determinar si un valor leído por teclado se encuentra o no en la lista.
}
program horaDeListasOrdenadas;
type

	lista = ^nodo;
	nodo = record
			dato:integer;
			sig:lista;
		end;
procedure insertarNodo(var l:lista;num:integer);
var
	act,ant,nuevo:lista;
begin
		new(nuevo);
		nuevo^.dato:=num;
		act:=l;
		while(act<>nil) and (num > act^.dato) do begin
			ant:=act;
			act:=act^.sig;
		end;
		if(act = l) then l:=nuevo
					else ant^.sig:=nuevo;
		nuevo^.sig:=act;
end;
procedure CargarLista(var l:lista);		
var
	ale:integer;
begin
	randomize;
	ale:=random(150-100+1)+100;
	while(ale<>120)do begin
		insertarNodo(l,ale);
		ale:=random(150-100+1)+100;
	end;
end;

procedure imprimirLista(l:lista);
begin
	while(l<>nil) do begin
		writeln(l^.dato);
		l:=l^.sig;
	end;
end;

function buscarElementoOrdenado(l:lista;num:integer):boolean;
begin
	while(l<>nil) and (l^.dato<num) do begin
		l:=l^.sig;
	end;
	if(l <> nil) then buscarElementoOrdenado:=(l^.dato = num)
				 else buscarElementoOrdenado:= false;
end;

var
	l:lista;
	num:integer;

BEGIN
	l:=nil;
	write('num a buscar:');readln(num);
	CargarLista(l);
	imprimirLista(l);
	writeln(buscarElementoOrdenado(l,num));
	
END.

