package lambdas

fun List<Int>.cuadrados(): List<Int> =
  filter { it % 2 == 1 }.map { it*it }        // devuelve una lista con los cuadrados de los números de la lista origen

fun List<Int>.sumOdd():Int =
    filter { it % 2 == 1 }.sumOf { it  }    // suma los números impares de la lista

fun main() {
val lista = List(15){it}
val lista2 = lista.cuadrados()
    println(lista2)
val lista3 = lista.sumOdd()
   println(lista3)

}