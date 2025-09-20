{
Un gimnasio necesita procesar las asistencias de sus clientes. Cada
asistencia tiene día, mes, año, número de cliente (entre 1 y 500) y la
actividad realizada (valor entre 1 y 5).
a) Implemente un módulo que retorne una lista de asistencias de clientes
un gimnasio. Las asistencias dentro de la lista deben quedar ordenadas de
menor a mayor por número de cliente. Generar aleatoriamente los valores
hasta generar un valor cero para el número de cliente.
b) Implemente un módulo que reciba la lista generada en a) e imprima
todos los valores de la lista en el mismo orden que están almacenados.
c) Implemente un módulo que reciba la lista generada en a) y un número
de cliente y retorne la cantidad de asistencias del cliente recibido. Mostrar
el resultado desde el programa principal.
d) Implemente un módulo que reciba la lista generada en a) y retorne la
actividad con mayor cantidad de asistencias. Mostrar el resultado desde el
programa principal
}

program gym;
const
	dimf=5;
type
	fecha = record
		dia:1..31;
		mes:1..12;
		anio:1..2025;
		end;
		
	cliente = record
		f:fecha;
		numcliente : integer;
		actividad : 1..5;
		end;
	
	lista = ^nodo;
	
	nodo = record
		dato:cliente;
		sig:lista;
		end;
		
	vector = array [1..dimf] of integer;
	
procedure generarAle(var c:cliente);
begin
	c.numcliente:= random(500);
	if(c.numcliente<>0)then begin
	c.f.dia:=random(31-1+1)+1;
	c.f.mes:=random(12-1+1)+1;
	c.f.anio:=random(2025-1+1)+1;
	c.actividad:=random(5-1+1)+1;
	end;
end;
procedure insertarNodo(var l:lista;c:cliente);
var
	ant,act,nuevo:lista;
begin
	new(nuevo);
	nuevo^.dato:=c;
	act:=l;
	while(act<>nil) and (act^.dato.numcliente<c.numcliente) do begin
		ant:=act;
		act:=act^.sig;
	end;
	if(act=l)then l:=nuevo
			else ant^.sig:=nuevo;
	nuevo^.sig:=act;
end;	

procedure cargarLista(var l:lista);
var
	c:cliente;
begin
	randomize;
	generarAle(c);
	while(c.numcliente <> 0) do begin
		insertarNodo(l,c);
		generarAle(c);
	end;
end;

procedure imprimirCliente(c:cliente);
begin
	writeln('numero de cliente:',c.numcliente);
	writeln('actividad:',c.actividad);
	writeln('fecha:',c.f.dia,'/',c.f.mes,'/',c.f.anio);
	
end;
procedure imprimirLista(l:lista);
begin
	while(l<>nil) do begin
		imprimirCliente(l^.dato);
		l:=l^.sig;
	end;
end;

function CalcularAsistencias(l:lista;num:integer):integer;
var
	totalAsistencias:integer;
begin
	totalAsistencias:=0;
	while(l<>nil) and (l^.dato.numcliente < num ) do begin
		l:=l^.sig;
	end;
	while(l<>nil) and (l^.dato.numcliente = num) do begin
		totalAsistencias := totalAsistencias+1;
		l:=l^.sig;
	end;
	CalcularAsistencias:=totalAsistencias;
end;

procedure MayorActividad(l:lista;var actividad,cantidad:integer);
var
	v:vector;
	i:integer;
begin
	for i:= 1 to dimf do v[i]:= 0;
	
	while(l<>nil) do begin
		v[l^.dato.actividad]:= v[l^.dato.actividad] + 1;
		l:=l^.sig;
	end;
	
	for i:=1 to dimf do begin
		if(cantidad < v[i]) then begin
				actividad:=i;
				cantidad:=v[i];
		end;
	end;
end;

var
	l:lista;
	acti,canti,num:integer;
BEGIN
	l:=nil;
	acti:=0;
	canti:=0;
	write('cliente a buscar:');readln(num);
	cargarLista(l);
	imprimirLista(l);
	writeln('asistencias:',CalcularAsistencias(l,num));
	MayorActividad(l,acti,canti);
	if(acti <> 0) then writeln('la actividad ',acti,' es la actividad con mas asistencias, con un total de ',canti)
				  else writeln('no asistio nadie aun');
END.

