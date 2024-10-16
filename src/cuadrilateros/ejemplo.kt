import cuadrilateros.*

fun main() {
    val cuad1 = Cuadrado(1.0)
    println("lado = ${cuad1.lado}")
    println("perímetro = ${cuad1.perimeter()}")
    println("area = ${cuad1.area()}")
    println("diagonal = ${cuad1.diagonal}")

  val rombo1 = Rombo(8.0, 6.0)
    println("lado = ${rombo1.lado()}")
    println("perímetro = ${rombo1.perimeter()}")
    println("area = ${rombo1.area()}")




}