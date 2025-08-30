{
2.- El administrador de un edificio de oficinas cuenta, en papel, con la información del pago de
las expensas de dichas oficinas.
Implementar un programa que invoque a módulos para cada uno de los siguientes puntos:
a. Genere un vector, sin orden, con a lo sumo las 300 oficinas que administra. De cada oficina
se ingresa el código de identificación, DNI del propietario y valor de la expensa. La lectura
finaliza cuando se ingresa el código de identificación -1, el cual no se procesa.
b. Ordene el vector, aplicando el método de inserción, por código de identificación de la
oficina.
c. Ordene el vector aplicando el método de selección, por código de identificación de la oficina.
}
program ej2;
const
	dimf= 300;
	
type
	oficina = record
		valor,dni,codigo:integer;
		end;
	
	vector = array [1..dimf] of oficina;

procedure imprimirVector(v:vector;diml:integer);
var i :integer;
begin
	for i:=1 to diml do begin
		writeln(v[i].codigo)
	end;

end;

procedure generarVector(var v:vector; var diml:integer);

procedure leerOficina(var o:oficina);
begin
	write('codigo id:');readln(o.codigo);
	if(o.codigo <> -1) then begin
		write('dni:');readln(o.dni);
		write('valor:');readln(o.valor);
	end;
end;
var
	o:oficina;i:integer;
begin
	i:=0;
	leerOficina(o);
	while(o.codigo <> -1) and (i < dimf)do begin
		i:=i+1;
		v[i]:=o;
		leerOficina(o);
	end;
	diml:=i;
end;

procedure ordenarVectorInsercion(var v:vector;diml:integer);
var
	j,i:integer;aux:oficina;
begin
	for i:=2 to diml do begin
			aux:=v[i];
			j:=i-1;
			while(aux.codigo < v[j].codigo) and (j>0) do begin
				v[j+1]:= v[j];
				j:=j-1;
			end; 
			v[j+1]:= aux;
	end;
end;

procedure ordenarVectorSeleccion(var v:vector;diml:integer);
var
	pos,j,i:integer;
	aux:oficina;
begin
	for i:=1 to diml-1 do begin
		pos:=i;
		for j:=i+1 to diml do begin
			if(v[pos].codigo > v[j].codigo) then pos:= j;
		end;
		aux:=v[pos];
		v[pos]:=v[i];
		v[i]:=aux;
	end;
end;


var
	v:vector;diml:integer;
BEGIN
	generarVector(v,diml);
	imprimirVector(v,diml);
	ordenarVectorSeleccion(v,diml);
	imprimirVector(v,diml);
END.

