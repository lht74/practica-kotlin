package ordensuperior


fun <T, R : Any> Iterable<T>.mapIndexedNotNull(
    transform: (Int, T) -> R?
): List<R> {
    val result = mutableListOf<R>()
    for ((index,item) in this.withIndex()) {
        val aux = transform(index,item)
        if (aux != null)
            result.add(aux)
    }

    return result
}



fun main() {
    val list = listOf("a", "b", "c", "d")
    val listT = list.mapIndexedNotNull { index, s ->
        if (index % 2 == 0) "$s!" else null
    }
    println(listT)

    val listNum = List(20){it*it -1}

    val listNumT = listNum.mapIndexedNotNull{ index, n -> if (n % 2 == 0 ) "a($index) = $n  " else null }
    println(listNumT)

    for( (i, n ) in listNum.withIndex() )
        println("$i : $n")



}


