fun main() {
    var opcion: Int = 0;
    var num1: Float
    var num2: Float
    while (opcion !=5){
        println("Ingrese el primer numero");
        num1 = readLine()!!.toFloat()
        println("Ingrese el segundo numero")
        num2 = readLine()!!.toFloat()
        println("Elija la iopcion: \n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Finalizar")
        opcion = readLine()!!.toInt()
        when(opcion){
            1 -> println("la suma es: ${num1 + num2}")
            2 -> println("la resta es: ${num1 - num2}")
            3 -> println("la multiplicacion es: ${num1 * num2}")
            4-> {
                if(num2 <= 0){
                    println("El segundo numero no puede ser negativo o cero")
                } else{
                    println("La divicion es: ${num1 / num2}")
                }
            }
            5 -> println("programa finalizado")
            else -> println("opcion invalidad")
        }
    }
}