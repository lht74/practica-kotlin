import kotlin.math.absoluteValue

fun main() {
    println("Hello World!")
    var x =0
     for (n in 0..4)
    for (i in -12..12){
        x = n + i
        if (x>=0)
            println("$n + $i --> ${(n +i) % 5 }")
        else
            println("$n + $i --> ${ (5 + (x % 5))%5 }")

    }

println("-10 % 5 = ${-10 % 5} ")

}