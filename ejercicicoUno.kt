fun main(args: Array<String>) {
    println("Ingrese el valor de su compra: ");
    var compraValor = readLine()!!.toDouble();
    println("Valor de la compra: $compraValor");

    var descuento = 0.0;

    if(compraValor >= 100000){
        descuento = compraValor * 0.5;
        compraValor -= descuento;

        println("Se aplico un descuento del 50% equivalente a: $descuento");
    }

    println("Valor final: $compraValor");

}