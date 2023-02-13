fun main() {
    println("Ingrese la cantidad de numeros a evaluar")
    val cantidad = readLine()!!.toInt()
    var sumaPositivos = 0
    var sumaNegativos = 0
    var dosDigitos = 0
    for (i in 1..cantidad){
        println("Ingrese un numero; ")
        val num = readLine()!!.toInt()

        when{
            num >= 0 -> sumaPositivos++
            else -> sumaNegativos++
        }
        if (num.toString().length >= 2){
            dosDigitos++
        }
    }
}