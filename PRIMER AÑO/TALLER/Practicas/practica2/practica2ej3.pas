{
3.- Implementar un programa que invoque a los siguientes módulos.
a. Un módulo recursivo que retorne un vector de 20 números enteros “random” mayores a 300
y menores a 1550 (incluidos ambos).
b. Un módulo que reciba el vector generado en a) y lo retorne ordenado. (Utilizar lo realizado
en la práctica anterior)
c. Un módulo que realice una búsqueda dicotómica en el vector, utilizando el siguiente
encabezado:
Procedure busquedaDicotomica (v: vector; ini,fin: indice; dato:integer; var pos: indice);
Nota: El parámetro “pos” debe retornar la posición del dato o -1 si el dato no se encuentra
en el vector
}


program ej3;
const
	dimf= 20;
	max=1550;
	min=300;
type
	indice=-1..20;
	
	vector= array [1..dimf] of integer;

procedure cargarVectorRecursivo(var v:vector;var diml:integer);
begin
	 if(diml < dimf) then begin
		diml:=diml+1;
		v[diml]:=random(max-min+1)+min;
		cargarVectorRecursivo(v,diml);
	 end;
end;

procedure ordenarVector(var v:vector;diml:integer);
var
	num,j,i:integer;
begin
	for i:=2 to diml do begin
		num:=v[i];
		j:=i-1;
		while(v[j]>num) do begin
			v[j+1]:=v[j];
			j:=j-1;
		end;
		v[j+1]:=num;
	end;
end;

//version uli
Procedure busquedaDicotomica (v: vector; ini,fin: indice; dato:integer; var pos: indice);
var
	medio:integer;
begin
	medio:= (ini + fin) div 2;
	if(ini <= fin) and (v[medio]<> dato) then begin
		if(v[medio]<dato) then busquedaDicotomica(v,medio+1,fin,dato,pos)
						  else busquedaDicotomica(v,ini,medio-1,dato,pos)
	
	end
	else if(v[medio] = dato) then pos:=medio
	else pos:= -1;
end;
//version mati
{Procedure busquedaDicotomica (v: vector; ini,fin: indice; dato:integer; var pos: indice);
var
	medio:integer;
begin
	medio:=(ini + fin) div 2;
	if(ini <= fin) then 
	begin
		if(v[medio] = dato) then 
			pos:=medio
		else if(v[medio]< dato) then 
			busquedaDicotomica(v,medio+1,fin,dato,pos)
		else 
			busquedaDicotomica(v,ini,medio-1,dato,pos);
	end 
	else pos:=-1;
end;}

var
	v:vector;
	i,diml:integer;
	pos:indice;
BEGIN//^<>
	diml:=0;
	randomize;
	cargarVectorRecursivo(v,diml);
	writeln('desordenado:');
	for i:=1 to diml do write(v[i],',');
	writeln;
	ordenarVector(v,diml);
	writeln('ordenado:');
	for i:=1 to diml do write(v[i],',');
	busquedaDicotomica(v,1,20,765,pos);
	writeln;
	writeln('pos aca :',pos);
END.

