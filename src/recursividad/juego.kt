package recursividad
import kotlin.math.pow


fun jugar(n: Int, x: Int): String {
    return when {
        (n > x) -> "El número es Menor que $n"
        (n < x) -> "El número es Mayor que $n"
        else -> "¡Correcto! El número era $n"
    }
}

fun leerNumero(): Int {
    while (true) {
        println("Por favor, ingresa tu número: ")
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

fun selectLevel(): Int {
    while (true) {
        println("\nElige el nivel de dificultad entre 1 y 6")
        println("El nivel corresponde a la cantidad de dígitos que puede")
        println("tener como máximo el número que intentarás adivinar")
        val n = leerNumero()
        if (n in 1..6) return n
        println("Error: El nivel debe estar entre 1 y 6")
    }
}

fun mostrarRango(nivel: Int) {
    val maximo = 10.0.pow(nivel.toDouble()).toInt() - 1
    println("\nDebes adivinar un número entre 1 y $maximo")
}

fun preguntarContinuar(): Boolean {
    while (true) {
        println("\n¿Deseas jugar otra vez? (S/N): ")
        when (readlnOrNull()?.trim()?.uppercase()) {
            "S" -> return true
            "N" -> return false
            else -> println("Por favor, responde S para Sí o N para No")
        }
    }
}

fun jugarPartida() {
    val level = selectLevel()
    val numeroX = Adivinar(level).numeroX()
    var text = ""
    var n = 0
    var count = 0

    mostrarRango(level)

    while (text != "¡Correcto! El número era $n") {
        n = leerNumero()
        text = jugar(n, numeroX)
        println(text)
        count++
    }

    println("\n¡Felicitaciones! Has adivinado el número en $count intentos")
}

fun main() {
    println("¡Bienvenido al juego de Adivinar el Número!")

    do {
        jugarPartida()
    } while (preguntarContinuar())

    println("\n¡Gracias por jugar! ¡Hasta la próxima!")
}