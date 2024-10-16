


 fun serpienteNumeros(rows: Int, columns: Int)    {
    val arreglo = intArrayOf()
    var n = 0
    var ni: Int
    val width = ((columns * rows).toString().length) + 1

    for (i in 0 until rows) {
        for (j in 0 until columns) {
            ni = columns * i + columns - 1 - j
            if (n % columns == 0) println()
            if (i % 2 == 0) {
               print(" ${n.toString().padStart(width)}")

            } else {
               print(" ${ni.toString().padStart(width)}")

            }

            n++
        }
    }

}

 fun main() {
  serpienteNumeros(4,5)

}

