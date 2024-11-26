package ordensuperior

/*                                      Ejercicio Propuesto:
 *   Título: "Mapeando Índices y Elementos con Funciones de Orden Superior"
 *
 *   Descripción:
 *       Escribe una función de extensión para cualquier lista genérica (List<T>) llamada mapIndexAndElement.
 *       Esta función debe:
 *
 *           Recibir como argumento una función de transformación (Int, T) -> R, donde:
 *               Int es el índice del elemento.
 *               T es el elemento en esa posición.
 *               R es el resultado transformado para cada elemento.
 *
 *            Aplicar la transformación a cada elemento junto con su índice.
 *
 *            Retornar una nueva lista con los valores transformados.
 *
 *        Por ejemplo:
 *        Si la lista de entrada es listOf("a", "b", "c", "d") y la transformación es
 *         combinar el índice con el elemento ("$index-$item"), el resultado debe ser:
 *        listOf("0-a", "1-b", "2-c", "3-d").

 */

fun <T,R> List<T>.mapIndexAndElement( transform : (Int, T) -> R ) : List<R> {
    val salida = mutableListOf<R>()
    for ((index, element) in this.withIndex()){
        salida.add(transform(index,element))

    }

   return salida
}


fun main() {
    val listaEntrada =  listOf("a", "b", "c", "d")
    val listaEntrada1 =  listOf("uno", "dos", "tres", "cuatro","cinco")
    val listaSalida = listaEntrada.mapIndexAndElement{ index: Int, element: String -> "$index-$element" }

    val listaSalida1 = listaEntrada.mapIndexAndElement{ index: Int, element: String ->
        "\na($index) = $element "

    }



}

