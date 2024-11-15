package corrutinas

import kotlinx.coroutines.*

fun main() {
    runBlocking {
        println("Weather forecast \uD83D\uDE42 ")
        launch {
            printForecast()
        }
        launch {
            printTemperature()
        }

        for (i in 1..10)
        cuentaR(10 - i)
        println("\uD83D\uDE42 \uD83D\uDE42 \uD83D\uDE42 \uD83D\uDE42")

    }
}

suspend fun printForecast() {
    delay(1000)
    println("Sunny")
}

suspend fun printTemperature() {
    delay(1000)
    println("30\u00b0C")
}

suspend fun cuentaR(n:Int){
    delay(500)
    println(n)
}