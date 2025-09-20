{
a) Implemente un módulo CargarLista que cree una lista de enteros y le
agregue valores aleatorios entre el 100 y 150, hasta que se genere el
120.
b) Implemente un módulo ImprimirLista que reciba una lista generada en
a) e imprima todos los valores de la lista en el mismo orden que están
almacenados.
c) Implemente un módulo BuscarElemento que reciba la lista generada
en a) y un valor entero y retorne true si el valor se encuentra en la lista
y false en caso contrario.
d) Invocar desde el programa principal a los módulos implementados
para crear una lista, mostrar todos sus elementos y determinar si un
valor leído por teclado se encuentra o no en la lista.
}

program horaDeLasListas;
type

	lista = ^nodo;
	nodo = record 
			dato:integer;
			sig:lista;
		   end;
		   
procedure agregarAdelante(var l:lista;num:integer);
var
	nuevo:lista;
begin
		new(nuevo);
		nuevo^.dato:= num;
		nuevo^.sig:=l;
		l:=nuevo;
end;

procedure CargarLista(var l:lista);
var
	ale:integer;
begin
	randomize;
	ale:=random(150-100+1)+100;
	while(ale <> 120) do begin
		agregarAdelante(l,ale);
		ale:=random(150-100+1)+100;
	end;
	//opcion2
	{repeat
		ale:=random(150-100+1)+100;
		agregarAdelante(l,ale);
	until (ale = 120);
	}
end;

procedure imprimirLista(l:lista);
begin
	while(l<>nil)do begin 
		writeln(l^.dato);
		l:=l^.sig;
	end;
end;

function BuscarElemento(l:lista;num:integer):boolean;
var
	encontrado:boolean;
begin
	encontrado:=false;
	while(l<>nil) and NOT (encontrado) do begin
		if(l^.dato = num) then encontrado := true;
		l:=l^.sig;
	end;
	BuscarElemento:= encontrado;
end;
function BuscarElemento2(l:lista;num:integer):boolean;
begin
	while(l<>nil) and NOT (l^.dato = num) do begin
		l:=l^.sig;
	end;
	if(l<>nil) then BuscarElemento2:= (l^.dato = num)
			   else BuscarElemento2:= false;
end;

var
	l:lista;num:integer;
BEGIN
	l:=nil;
	write('numero a buscar entre 100 y 150:');readln(num);
	CargarLista(l);
	imprimirLista(l);
	writeln(BuscarElemento(l,num));
	writeln(BuscarElemento2(l,num));
END.

