import kotlin.math.abs
import kotlin.math.sqrt

 fun getNonTrivialDivisors(num: Int): List<Int> {
    val divisores = mutableListOf<Int>()
    for ( i in 2..< num){
        if (num % i ==0 ) divisores.add(i)
    }
     if (divisores.isEmpty()) println("$num : Es primo")
     return divisores
}





fun sqrtIter(guess: Double, x: Double): Double {
    if (goodEnough(guess, x)) {
        return guess
    } else {
        return sqrtIter(improve(guess, x), x)
    }
}

fun improve(guess: Double, x: Double): Double {
    return (guess + (x / guess)) / 2.0
}

fun goodEnough(guess: Double, x: Double): Boolean {
    return abs(guess * guess - x) < 0.0001
}



fun main() {
    println(getNonTrivialDivisors(1))

    println(sqrtIter(1.0, 2.0)) // Salida: 1.414213562373095
    println(sqrt(2.0))
}



