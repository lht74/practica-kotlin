package lambdas

fun compareNumber(x: Int, y: Int, comparation: (Int, Int) -> Int): Int {
    return comparation(x, y)
}

fun ordenPar(x: Int, y: Int, order: (Int,Int) -> Pair<Int,Int>) : Pair<Int,Int>{
    return order(x,y)
}

fun main() {
    val menor = compareNumber(5, 3) { a, b -> if (a <= b) a else b }
    println("Menor: $menor")  // Imprime "Menor: 3"

    val mayor = compareNumber(5, 3) {a,b  -> if (a >= b) a else b }
    println("Mayor: $mayor")  // Imprime "Mayor: 5"

    val ascendent = ordenPar(16,8){ a,b -> if ( a < b ) Pair(a,b) else Pair(b,a)}
    println(ascendent)

    val descendent = ordenPar(5, 12){a,b -> if (a<b) Pair(b,a) else Pair(a,b)}
    println("El par ordenado (5, 12) en orden descendente queda $descendent")
}
