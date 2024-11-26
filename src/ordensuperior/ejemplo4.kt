package ordensuperior

/* Descripción:
*  Escribe una función de extensión para cualquier lista de cadenas (List<String>) llamada filterAndSumLengths.
*  Esta función debe:

*    1) Recibir como argumento un predicado (una función (String) -> Boolean)
*    que determine qué elementos deben ser incluidos.
*    2) Filtrar los elementos de la lista basándose en el predicado.
*    3) Calcular la suma de las longitudes de las cadenas que pasaron el filtro.
*    4) Retornar el resultado como un Int.

*  Por ejemplo:
*  Si la lista de entrada es listOf("apple", "banana", "cherry", "date")
*  y el predicado verifica si la cadena tiene más de 5 caracteres,
*  el resultado debe ser 11 (longitudes de "banana" y "cherry").
 */

//mi primera versión
fun List<String>.filterAndSumLenghts(predicate:(String)->Boolean): Int {
    var aux = 0

    for ((index,item) in this.withIndex()){
        if (predicate(item))
         aux += item.length
    }
    return aux

}

// segunda versión:
fun List<String>.filterAndSumLenghts1( predicate: (String) -> Boolean ): Int {
    var aux = 0

        for (item in this) {
            if (predicate(item)) {
                aux += item.length
            }
        }
    return aux
   }

// versión utilizando programación funcional:
fun List<String>.filterAndSumLenghts2( predicate: (String) -> Boolean ): Int{
 return this.filter(predicate).sumOf { it.length }

}


//versión que maneja valores null dentro de la lista


fun List<String?>.filterAndSumLenghts3( predicate: (String) -> Boolean ): Int{
    return this.filterNotNull()  // filtra los nulos de la lista ( los excluye)
        .filter(predicate)      // ´predicate´ opera sobre String, ya que los nulos se han excluído
        .sumOf { it.length }

}



fun main() {
    val miLista = listOf("cara", "cruz","seca", "naipe", "dado")

    val resultado = miLista.filterAndSumLenghts2 { s: String -> s.contains('a') }
    val resultado1 = miLista.filterAndSumLenghts2 { s: String -> s.contains('z') }
    println("Contiene 'a' : $resultado")
    println("Contiene 'z' : $resultado1")

   val miListaConNull = listOf("uno", "dos","cuarenta","tres", null, "cuatro")
   var resultado2 = miListaConNull.filterAndSumLenghts3 { s:String -> s.contains('c')  }
   var resultado3 = miListaConNull.filterAndSumLenghts3 { s:String -> s.startsWith('c') }
   println("Empiezan con 'c' $resultado3 ")

}