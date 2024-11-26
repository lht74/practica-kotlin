package basic

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking


suspend fun fibonacci ( n : Int): Int {
    var a3 = 0
    var a2 = 0
    var a1 = 1

    for (i in 1..n) {
       a3 = a1 + a2
       a1 = a2
       a2 = a3

    }

    return a3
}


fun main() {
    runBlocking {
        for (i in 1..40) {
            println(fibonacci(i + 1).toDouble() / fibonacci(i))
            delay(800)
        }

    }
}