fun main() {
    var sueldo:Float = 0f;
    var antiguedad:Int = 0;
    var aunmento:Float = 0f;
    var mensaje:String = "";

    println("Ingrese su sueldo:   ")
    sueldo = readLine()!!.toFloat();
    println("Sueldo= $sueldo");

    println("Ingrese su antiguedad en la empresa")
    antiguedad = readLine()!!.toInt();
    println("Antiguedad=  $antiguedad");

    if (sueldo < 500 && antiguedad >= 10){
        aunmento = sueldo * 0.2f;
        sueldo += aunmento;
        mensaje = "Usted tiene un aumento del 20%, su sueldo nuevo es: $sueldo";
    } else if (sueldo < 500 && antiguedad < 10){
        aunmento = sueldo * 0.05f;
        sueldo += aunmento;
        mensaje = "Usted tiene un aumento del 5%, su sueldo nuevo es: $sueldo";
    } else{
        mensaje = "usted no tiene ningun aumento, su sueldo es: $sueldo"
    }

    println(mensaje);
}