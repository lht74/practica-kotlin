package cuadrilateros

import kotlin.math.sqrt

data class Cuadrado(val lado: Double = 0.0) {

    fun area(): Double = lado * lado

    fun perimeter(): Double = lado * 4

//    fun diagonal(): Double = sqrt(area()*2)

}

data class Rectangle(
    val base: Double = 0.0,
    val altura: Double = 0.0
) {

    fun area(): Double = base * altura

    fun perimeter(): Double = 2 * (base + altura)

    fun diagonal(): Double = sqrt(base * base + altura * altura)

}

data class Rombo(val digMayor: Double = 0.0, val digMenor: Double = 0.0) {

    fun area(): Double = digMayor * digMenor * 0.5

    fun perimeter(): Double = 2 * sqrt(digMayor * digMayor + digMenor * digMenor)

    fun lado(): Double = perimeter() / 4

}

val Cuadrado.diagonal: Double
    get() = sqrt(area() * 2)

fun main() {
    val baldoza = Cuadrado(5.0)
    println("Lado = ${baldoza.lado} Diagonal =${baldoza.diagonal}")

}