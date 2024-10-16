package mapas

/* Uso de mapas
   definición de funciones infix
   uso de mutableSetOf
   uso de joinToString() para dar formato a la salida de texto*/



fun Int.cuadrado():Int = this * this
fun isTernPitag( a: Int, b: Int, c:Int): Boolean {
    val aux = listOf(a,b,c).sorted()
    return aux[2].cuadrado() == aux[1].cuadrado() + aux[0].cuadrado()
    }


fun main() {

    val resultado = mutableMapOf<Int, Set<Int>>()
    var terna: MutableSet<Int>
    var count = 0
    for (a in 1..100 )
        for (b in 1..100)
            for (c in 1..100) {
                if (isTernPitag(a, b, c)) {
                    terna = mutableSetOf(a, b, c)

                    if (!resultado.containsValue(terna)) {
                        resultado[count] = terna
                        count++
                    }
                }

            }
    for ((key,value ) in resultado) println("($key) = " +
            "${value.joinToString(prefix = "{" , postfix = "}", separator = "; ")} ")

}

