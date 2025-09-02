{
4.- Realizar un programa que lea números y que utilice un módulo recursivo que escriba el
equivalente en binario de un número decimal. El programa termina cuando el usuario ingresa
el número 0 (cero).
Ayuda: Analizando las posibilidades encontramos que: Binario (N) es N si el valor es menor a 2.
¿Cómo obtenemos los dígitos que componen al número? ¿Cómo achicamos el número para la
próxima llamada recursiva? Ejemplo: si se ingresa 23, el programa debe mostrar: 10111.
}


program binario;

procedure imprimirBinario(n:integer);
begin
	if(n>1) then begin
		 imprimirBinario(n div 2);
		 write(n mod 2);
	end else write(n)
end;
var
	num:integer;
BEGIN
	readln(num);
	while(num <>0)do begin
	write('binario:');
	imprimirBinario(num);
	writeln;
	readln(num)
	end;
	
END.

