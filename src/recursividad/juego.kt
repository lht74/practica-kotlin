package recursividad

import kotlin.random.Random
fun jugar(n:Int, x: Int):String{
    return when {

        (n > x )-> "Menos"
        (n < x) -> "Más"
        else -> "Correcto"

    }

}
fun leerNumero(): Int {
    while (true) {
        println("Por favor, ingresa tu número : ")
        try {
            val input = readlnOrNull()?.trim()
            if (input != null) {
                val numero = input.toInt()
                if (numero > 0) {
                    return numero
                } else {
                    println("Error: El número debe ser positivo.")
                }
            }
        } catch (e: NumberFormatException) {
            println("Error: Ingrese un número válido.")
        }
    }
}

fun selectLevel():Int{

    var n = 1
    println("Elige el nivel de dificultad entre 1 y 6 " +
            "el nivel corresponde a la cantidad de dígitos que puede " +
            "tener como máximo el número que intentarás adivinar")
    n = leerNumero()
    return n
}


fun main() {
val level = selectLevel()
val numeroX = Adivinar(level).numeroX()
var text = "asdf"
var n =0
var count =  0

    while (text != "Correcto"){
   n = leerNumero()
   text = jugar(n,numeroX)
   println(text)
   count++

}
println("Haz adivinado el número en $count intentos")


}