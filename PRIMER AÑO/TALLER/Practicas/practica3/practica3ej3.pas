{
3. Implementar un programa que contenga:
a. Un módulo que lea información de los finales rendidos por los alumnos de la Facultad de
Informática y los almacene en una estructura de datos. La información que se lee es legajo,
código de materia, fecha y nota. La lectura de los alumnos finaliza con legajo 0. La estructura
generada debe ser eficiente para la búsqueda por número de legajo y para cada alumno deben
guardarse los finales que rindió en una lista.
b. Un módulo que reciba la estructura generada en a. y retorne la cantidad de alumnos con
legajo impar.
c. Un módulo que reciba la estructura generada en a. e informe, para cada alumno, su legajo y
su cantidad de finales aprobados (nota mayor o igual a 4).
d. Un módulo que reciba la estructura generada en a. y un valor real. Este módulo debe
retornar los legajos y promedios de los alumnos cuyo promedio supera el valor ingresado.
}


program ej3;

type
	fecha = record
		dia,mes,anio:integer;
	end;
	finales = record
		f:fecha;
		codigo,legajo:integer;
		nota:real;
	end;
	
	lista= ^nodol;
	
	nodol= record
		dato:finales;
		sig:lista;
	end;
	
	arbol=^nodoa;
	
	nodoa=record
		dato:lista;
		hi,hd:arbol;
	end;

procedure agregarNodo(var l:lista;f:finales);
var
	aux:lista;
begin
	new(aux);
	aux^.dato:=f;
	aux^.sig:=l;
	l:=aux;
end;

procedure agregarArbol(var a:arbol; f:finales);
begin
	if(a=nil)then begin
		new(a);
		a^.dato:=nil;
		agregarNodo(a^.dato,f);
		a^.hi:=nil;
		a^.hd:=nil;
	end else if (a^.dato^.dato.legajo > f.legajo) then agregarArbol(a^.hi,f)
		else if(a^.dato^.dato.legajo < f.legajo ) then agregarArbol(a^.hd,f)
		else agregarNodo(a^.dato,f);
end;

procedure leerFinal(var f:finales);
begin
	write('legajo:');readln(f.legajo);
	if(f.legajo<>0)then begin
		write('codigo materia:');readln(f.codigo);
		write('dia:');readln(f.f.dia);
		write('mes:');readln(f.f.mes);
		write('año:');readln(f.f.anio);
		write('nota:');readln(f.nota);
	end;
end;
procedure cargarArbol(var a:arbol);
var
	f:finales;
begin
	leerFinal(f);
	while(f.legajo<>0)do begin
		agregarArbol(a,f);
		leerFinal(f);
	end;
end;

procedure alumnosImpar(a:arbol;var cant:integer);
begin
	if(a<>nil)then begin
		alumnosImpar(a^.hi,cant);
		alumnosImpar(a^.hd,cant);
		if(a^.dato^.dato.legajo mod 2 = 1) then cant:= cant+1;
	end 
end;

function calcularFinal(l:lista):integer;
var
	cant:integer;
begin
	cant:=0;
	while(l<>nil)do begin
		if (l^.dato.nota >= 4)then cant:=cant+1;
		l:=l^.sig;
	end;
	calcularFinal:=cant;
end;

procedure informar(a:arbol);
begin
	if(a<>nil)then begin
		informar(a^.hi);
		informar(a^.hd);
		writeln(a^.dato^.dato.legajo,' NOTAS:',calcularFinal(a^.dato));	

	end;
end;

procedure calcularPromedio(l:lista;var n:real);
var
	cant:real;
begin
	n:=0;
	cant:=0;
	while(l<>nil) do begin
		n:=l^.dato.nota+n;
		cant:= cant +1;
		l:=l^.sig;
	end;
	n:= n/cant;

end;

procedure promedios(a:arbol;n:real);
var
	prom:real;
begin
	if(a<>nil)then begin
		promedios(a^.hi,n);
		promedios(a^.hd,n);
		calcularPromedio(a^.dato,prom);
		if(prom > n ) then begin
			writeln('legajo:',a^.dato^.dato.legajo);
			writeln('promedio:',prom:2:2);
		end;
	
	end;
end;

var
	a:arbol;
	cant:integer;
BEGIN
	a:=nil;
	cargarArbol(a);
	cant:=0;
	alumnosImpar(a,cant);
	writeln('alumnos impares:',cant);
	promedios(a,4.70);
END.

