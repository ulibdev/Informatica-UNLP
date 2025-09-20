{
3.- Netflix ha publicado la lista de películas que estarán disponibles durante el mes de
septiembre de 2025. De cada película se conoce: código de película, código de género (1:
acción, 2: aventura, 3: drama, 4: suspenso, 5: comedia, 6: bélico, 7: documental y 8: terror) y
puntaje promedio otorgado por las críticas.
Implementar un programa que invoque a módulos para cada uno de los siguientes puntos:
a. Lea los datos de películas, los almacene por orden de llegada y agrupados por código de
género, y retorne en una estructura de datos adecuada. La lectura finaliza cuando se lee el
código de la película -1.
b. Genere y retorne en un vector, para cada género, el código de película con mayor puntaje
obtenido entre todas las críticas, a partir de la estructura generada en a)..
c. Ordene los elementos del vector generado en b) por puntaje utilizando alguno de los dos
métodos vistos en la teoría.
d. Muestre el código de película con mayor puntaje y el código de película con menor puntaje,
del vector obtenido en el punto c)
}

program ej3;

type
	
	pelicula= record
		codigoPeli:integer;
		codigoGen:1..8;
		puntaje:integer;
	end;
	
	lista = ^nodo;
	
	nodo= record
		dato:pelicula;
		sig:lista;
	end;
	
	vector = array [1..8] of lista;
	vectorContador = array [1..8] of pelicula;
	

procedure leerPelicula(var p:pelicula);
begin
		write('codigo');readln(p.codigoPeli);
		if(p.codigoPeli<>-1) then begin
		write('codigo gen');readln(p.codigoGen);
		write('puntaje');readln(p.puntaje);
		end;
end;


procedure agregarNodo(var l:lista;p:pelicula);
var
	nuevo:lista;
begin
	new(nuevo);
	nuevo^.dato:=p;
	nuevo^.sig:=l;
	l:=nuevo;
end;

procedure cargarVector(var v:vector);
var
	p:pelicula;
begin
	leerPelicula(p);
	while(p.codigoPeli <>-1) do begin
		agregarNodo(v[p.codigoGen],p);
		leerPelicula(p);
	end;

end;

procedure calcularMayor(l:lista;var codigoMax:pelicula);
var
	max:integer;
begin
	max:=-1;
	while(l<>nil) do begin
		if(max < l^.dato.puntaje) then begin
			codigoMax:= l^.dato;
			max:=l^.dato.puntaje;
		end;
		l:=l^.sig;
	end;
end;
//demasiada modularizacion is bad
procedure puntajeMayor(v:vector; var vec:vectorContador);
var
	i:integer;
begin
	for i:=1 to 8 do begin
		if(v[i]<>nil) then calcularMayor(v[i],vec[i]);
	end;
end;

procedure ordenarInsertar(var v:vectorContador);
var
	j,i:integer;aux:pelicula;
begin
	for i:=2 to 8 do begin
			aux:=v[i];
			j:=i-1;
			while(aux.puntaje < v[j].puntaje) and (0 < j) do begin
				v[j+1]:=v[j];
				j:=j-1;
			end;
		v[j+1]:= aux;
	end;
end;
var
	v:vector;vec:vectorContador;
	i:integer;
BEGIN//^<>
	for i:=1 to 8 do begin
		v[i]:=nil;
		vec[i].codigoPeli:=-1;
		vec[i].puntaje:=-1;
	end;
		
	cargarVector(v);
	puntajeMayor(v,vec);
	ordenarInsertar(vec);
	
	i:=1;
	while(vec[i].codigoPeli = -1) and (i<8) do i:=i+1;
	writeln('menor:',vec[i].codigoPeli,' con ',vec[i].puntaje);
	writeln('mayor:',vec[8].codigoPeli,' con ',vec[8].puntaje);
END.

