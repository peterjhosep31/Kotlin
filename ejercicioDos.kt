import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`);
    println("Ingrese el valor de la compra: ");
    var compraValor = scanner.nextDouble();

    var descuento = 0.0;

    if (compraValor >= 100000){
        descuento = compraValor *0.5;
        compraValor -= descuento;
        println("Se aplico un descuento del 50% equivalente a: $descuento");
    } else {
        descuento = compraValor * 0.1;
        compraValor -= descuento;
        println("Se aplico un descuneto del 10% equivalentes a: $descuento")
    }

    println("Valor a pagar = $compraValor")
}