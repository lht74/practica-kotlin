package lambdas

/* esta es la solución de Salim Mazari Boufares (moderador de Hyperskill)
 * al desafío Tic-tac-toe
*/


val grid = Array(3) { Array(3) { ' ' } }

fun main() {
    gridDrawer()
    play()
}

fun play() {
    while (true) {
        print("Enter the coordinates: ")
        readLine()!!.toString().split(" ").map { it.toIntOrNull() }.run {
            when {
                contains(null) -> println("You should enter numbers!")
                this.count { it in 1..3 } != 2 -> println("Coordinates should be from 1 to 3!")
                grid[first()!! - 1][last()!! - 1] != ' ' -> println("This cell is occupied! Choose another one!")
                else -> {
                    grid[first()!! - 1][last()!! - 1] = if (gridSeq().count { it == ' ' } % 2 != 0) 'X' else 'O'
                    gridDrawer()
                    if (gridState()) return
                }
            }
        }
    }
}

fun gridSeq() = grid.joinToString("-") { it.joinToString("") }

fun gridDrawer() {
    println("-".repeat(9))
    repeat(3) { println("| ${grid[it].joinToString(" ")} |") }
    println("-".repeat(9))
}

fun gridState(): Boolean = when {
    countWins('O') -> { println("O wins"); true}
    countWins('X') -> { println("X wins"); true}
    gridSeq().contains(' ') -> { println("Game not finished"); false}
    else -> { println("Draw"); true}
}

fun countWins(s: Char) = java.util.regex.Pattern
    .compile("$s....$s....$s|$s...$s...$s|$s$s$s|..$s-.$s.-$s").matcher(gridSeq()).find()