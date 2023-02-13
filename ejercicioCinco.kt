fun main() {
    println("Ingrese el numero de horas trabajadas:")
    val horasTrabajadas = readLine()!!.toInt();
    val tarifaHora = 2000;
    var salario = horasTrabajadas * tarifaHora;
    println("El salario base es $salario");
    var porc = 0.1;
    var descuento = salario * porc;
    println("Se le realizara un descuento del 10% equivalente a: $descuento");
    var salarioTotal = salario - (descuento);
    println("El salario neto a pagar aplicando el descuento es $salarioTotal");

    println("Ingrese el tipo de empleado (A, B, C): ");
    val tipoEmpleada = readLine();
    var porcAumento = 0.0;

    when(tipoEmpleada){
        "a", "A" -> {
            porcAumento = 30.0
            println("Es tipo A")
        }
        "b", "B" -> {
            porcAumento = 20.0
            println("Es tipo B")
        }
        "c", "C" -> {
            porcAumento = 10.0
            println("Es tipo C")
        }
        else -> {
            println("No se realizara ningun aumento")
            porcAumento = 0.0
        }
    }

    if (porcAumento!=0.0){
        var aumento = salarioTotal*(porcAumento/100)
        salarioTotal = salarioTotal + aumento
        println("Se realizo un aumento de $aumento, equivalente al $porcAumento%")
        println("El salario final quedo en $salarioTotal")
    }

}