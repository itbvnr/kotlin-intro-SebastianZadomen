fun main(args: Array<String>) {
    val diametro = args[0]

    val resultado=calcuPizza(diametro.toFloat())
    println("La circunferencia del  diametro $diametro cm de su pizza es : $resultado cm")
}
fun calcuPizza (diametro: Float):Double {

    val area = 3.14*((diametro/2)*(diametro/2))

    return area
}
