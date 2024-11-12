package lambdas

import kotlinx.coroutines.internal.synchronizedImpl


fun main() {
val bigger = { a: Int, b: Int -> if ( a >= b ) a else  b}  // retorna el mayor de dos números enteros
println(bigger(4,5))

val absolutValue = { x : Double -> if (x >= 0 ) x else -x}   // retorna valor absoluto de un Double

val withOutSpaces = { s: String ->
    var aux = ""
    for (ch in s)
        if (ch != ' ') aux+= ch

  aux
}



val s = "Este es un texto de prue ba"
println(withOutSpaces(s))

val repite = {s:String, n:Int ->
    var result: String = ""
        for (i in 1..n)
        result += "$s "
    result
    }

    for (i in 1..10)
        println(repite("$i",i))

}

