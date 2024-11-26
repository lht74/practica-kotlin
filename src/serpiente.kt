 /**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun serpienteNums(rows: Int, columns: Int) {
    var n = 0
    var ni: Int
    val width = ((columns * rows).toString().length) + 1
    
    for (i in 0 until rows) {
        for (j in 0 until columns) {
            ni = columns * i + columns - 1 - j
            if (n % columns == 0) println()
            if (i % 2 == 0) {
                print(" ${n.toString().padEnd(width)}")
            } else {
                print(" ${ni.toString().padEnd(width)}")
            }
            n++
        }
    }
}

fun main() {
    println("Hello, world!!!")
    serpienteNums(4,6)
    
}

/*  Output: Hello, world!!!

 0   1   2   3   4   5  
 11  10  9   8   7   6  
 12  13  14  15  16  17 
 23  22  21  20  19  18 */
