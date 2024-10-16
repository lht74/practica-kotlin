package collections

fun main() {

    val lista = List(size = 10){it}    // it devuelve el índice   0 <= it < size
    val letras = List(size = 10){'z' - it}
    val letras1 = List(size = 12) {letras [it %3] }  // // Cycle through a sequence

    println(lista)
    println(letras)
    println(letras1)

    /* output:
        [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        [z, y, x, w, v, u, t, s, r, q]
        [x, y, z, x, y, z, x, y, z, x, y, z]
 */


}