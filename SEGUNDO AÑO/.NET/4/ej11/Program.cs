

object? st = null,st2 = null,st3 = null,st1 = null,st4 = null;

st =  st1 ?? (st2 ?? st3);

Console.WriteLine(st);

if (st1 == null){

    if (st2 == null){
        st = st3;
    }
    else{
        st = st2;
    }
}else{
    st = st1;
}

Console.WriteLine(st);

st4 ??= "valor por defecto";

if (st4 == null){
    st4 = "valor por defecto";
}

Console.WriteLine(st4);