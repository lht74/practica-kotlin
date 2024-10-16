package lambdas
import kotlin.math.sqrt

fun main() {
    val isEven = {  n: Int -> n % 2 == 0 }
    val isSquare = { n: Int -> sqrt( n.toDouble()) == sqrt(n.toDouble()).toInt().toDouble() }

    val numeros = mutableListOf<Int>()
    for (i in 1..1000)
        numeros+=i
    val cuadrados = numeros.filter { n -> sqrt( n.toDouble()) == sqrt(n.toDouble()).toInt().toDouble() }
    println(cuadrados)

    println("**********************************")

    val otherWayCuadrados = numeros.filter(isSquare)   // nótese que (isSquare) está entre paréntesis
    println(otherWayCuadrados)




}