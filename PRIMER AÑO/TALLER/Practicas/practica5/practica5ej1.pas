{
1 El administrador de un edificio de oficinas tiene la información del pago de las expensas
de dichas oficinas. Implementar un programa con:
a) Un módulo que retorne un vector, sin orden, con a lo sumo las 300 oficinas que
administra. Se deben cargar, para cada oficina, el código de identificación, DNI del
propietario y valor de la expensa. La lectura finaliza cuando llega el código de
identificación 0.
b) Un módulo que reciba el vector retornado en a) y retorne dicho vector ordenado por
código de identificación de la oficina. Ordenar el vector aplicando uno de los métodos
vistos en la cursada.
c) Un módulo que realice una búsqueda dicotómica. Este módulo debe recibir el vector
generado en b) y un código de identificación de oficina. En caso de encontrarlo, debe
retornar la posición del vector donde se encuentra y en caso contrario debe retornar 0.
Luego el programa debe informar el DNI del propietario o un cartel indicando que no
se encontró la oficina.
d) Un módulo recursivo que retorne el monto total acumulado de las expensas.
}


program prac5ej1;
const
	dimf = 300;
type
	oficina = record
		codigo,dni:integer;
		valor:real;
	end;
	
	vector = array [1..dimf] of oficina;

procedure cargarVector (var v:vector;var diml:integer);
	procedure leerOficina(var o:oficina);
	begin
		write('codigo de oficina:');readln(o.codigo);
		if(o.codigo <> 0) then begin
			write('dni:');readln(o.dni);
			write('valor:');readln(o.valor);
		end;
	end;
var
	o:oficina;

begin
	leerOficina(o);
	while(o.codigo<> 0) and (diml < dimf) do begin
		diml:=diml+1;
		v[diml]:= o;
		leerOficina(o);
	end;
end;

procedure ordenarVector(var v:vector;diml:integer);
var
	pos,j,i:integer; aux:oficina;
begin
	for i:= 1 to diml-1 do begin
			pos:=i;
			for j:=i to diml do begin
				if(v[j].codigo < v[pos].codigo) then pos:=j; 
			end;
			aux:= v[i];
			v[i]:= v[pos];
			v[pos]:=aux;
	end;
end;

function busquedaDicotomica(v:vector;num,ini,diml:integer):integer;
var
	medio:integer;
begin
	if(ini <= diml) then begin
		medio:=(diml + ini) div 2;
		if(v[medio].codigo = num) then busquedaDicotomica:=medio
		else if(v[medio].codigo < num) then busquedaDicotomica:= busquedaDicotomica(v,num,medio+1,diml)
		else busquedaDicotomica:= busquedaDicotomica(v,num,ini,medio-1);
	end
	else busquedaDicotomica:= 0;
end;


function montoTotal(v:vector;diml:integer):real;
begin
	if(diml<> 0) then begin
		montoTotal:= montoTotal(v,diml-1) + v[diml].valor;
	end; 
end;


var
	v:vector;diml:integer; i:integer;
BEGIN
	diml:=0;
	cargarVector(v,diml);
	ordenarVector(v,diml);
	for i:=1 to diml do writeln(v[i].codigo);
	writeln(busquedaDicotomica(v,8,1,diml));
	writeln('monto total:',montoTotal(v,diml):2:2);
END.

