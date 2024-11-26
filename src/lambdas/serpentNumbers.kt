package lambdas

fun serpienteNumeros(rows: Int, columns: Int) {
    val width = ((columns * rows).toString().length) + 1 // Ancho de formato

    // Construye la matriz con el patrón deseado
    val grid = Array(rows) { row ->
        IntArray(columns) { col ->
            if (row % 2 == 0) columns * row + col // Normal
            else columns * row + (columns - 1 - col) // Reverso
        }
    }

    // Imprime la matriz
    grid.forEach { row ->
        println(row.joinToString(" ") { it.toString().padStart(width) })
    }
}

fun main() {
    serpienteNumeros(4, 5)
}
