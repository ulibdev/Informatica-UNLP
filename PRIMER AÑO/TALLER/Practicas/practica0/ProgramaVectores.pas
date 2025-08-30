{
a) Implemente un módulo CargarVector que cree un vector de enteros
con a lo sumo 50 valores aleatorios. Los valores, generados
aleatoriamente (entre un mínimo y máximo recibidos por parámetro),
deben ser almacenados en el vector en el mismo orden que se
generaron, hasta que se genere el cero.
b) Implemente un módulo ImprimirVector que reciba el vector generado
en a) e imprima todos los valores del vector en el mismo orden que
están almacenados. Qué cambiaría para imprimir en orden inverso?
c) Escriba el cuerpo principal que invoque a los módulos ya
implementados.
}

program pVectores;

const dimf= 50;
type
	vector = array [1..dimf] of integer;

procedure CargarVector(var v:vector;var diml:integer;min,max:integer);
var
	ale,i:integer;
begin
	i:=0;
	randomize;
	ale:= random(max-min+1)+min;
	while(i < 50) and (ale<>0) do begin
		i:=i+1;
		v[i]:= ale;
		ale:= random(max-min+1)+min;
	end;
	diml:=i;
end;
procedure ImprimirVector(v:vector;diml:integer);
var
	i:integer;
begin
	//orden inverso :
	// i:=diml downto 1
	// orden normal:
	// i:=1 to diml
	for i:=diml downto 1 do begin
		writeln(i,':',v[i]);
	end;
end;
var
	v:vector; min,max,diml:integer;
BEGIN
	write('min:');readln(min);
	write('max:');readln(max);
	CargarVector(v,diml,min,max);
	//si tenemos mala suerte
	//y toca primero 0 no imprime nada
	ImprimirVector(v,diml);
	
END.

