package lambdas

import java.io.File
import kotlin.random.Random

fun main() {
    val listaDePalabras = listOf("enero", "febrero", "marzo", "abril", "mayo", "junio",
                                 "julio", "agosto","septiembre","octubre","noviembre","diciembre")
    val palabrasMayusculas = listaDePalabras.map { it.uppercase() }
    val gridSize = palabrasMayusculas.maxOf { it.length } + 2

    val sopaDeLetras = Array(gridSize) { CharArray(gridSize) { '-' } }

    // Colocar palabras en posiciones aleatorias
    palabrasMayusculas.forEach { palabra ->
        colocarPalabraAleatoria(sopaDeLetras, palabra)
    }

    // Imprimir la sopa de letras
    println("Sopa de letras generada:")


    val sopaCompleta = sopaDeLetras.map { row ->
        row.map { char ->
            if (char == '-') randomLetter() else char
        }.toCharArray()
    }.toTypedArray()


    sopaDeLetras.forEach { row ->

        println(row.joinToString(" "))
    }

   println("_".repeat(20))


    sopaCompleta.forEach { row ->

        println(row.joinToString(" "))
    }

    File("C:\\Users\\lucas\\Documents\\sopa-de-letras1.txt").printWriter().use { out ->
        sopaCompleta.forEach { row ->
            out.println(row.joinToString(" "))
        }
    }
    generarHTML(sopaCompleta, "C:\\Users\\lucas\\Documents\\sopa-de-letras1.html")
}

fun generarCSV(sopaDeLetras: Array<CharArray>,destino: String = "sopaDeLetras.csv" ) {
    File(destino ).printWriter().use { out ->
        sopaDeLetras.forEach { row ->
            out.println(row.joinToString(","))
        }
    }
}
fun generarHTML(sopaDeLetras: Array<CharArray>,
                destino: String = "C:\\Users\\lucas\\Documents\\sopaDeLetras.html") {
    val html = buildString {
        // Añadimos estilos CSS más específicos
        appendLine("""
            <style>
                table {
                    border-collapse: collapse;
                    font-family: monospace;
                    font-size: 20px;
                }
                td {
                    border: 1px solid black;
                    width: 40px;      /* Ancho fijo */
                    height: 40px;     /* Alto fijo para hacer celdas cuadradas */
                    text-align: center;
                    vertical-align: middle;
                }
            </style>
        """.trimIndent())

        appendLine("<table>")
        sopaDeLetras.forEach { row ->
            appendLine("<tr>")
            row.forEach { char ->
                appendLine("<td>$char</td>")
            }
            appendLine("</tr>")
        }
        appendLine("</table>")
    }

    // Guardar el HTML
    File(destino).writeText(html)
}
fun randomLetter(): Char =  ('A'..'Z').random()
fun colocarPalabraAleatoria(grid: Array<CharArray>, palabra: String) {
    val direcciones = listOf( "D" ,"V", "H")
    val invertir = Random.nextBoolean()

    val texto = if (invertir) palabra.reversed() else palabra

    while (true) {
        val direccion = direcciones.random()
        val startRow = Random.nextInt(grid.size)
        val startCol = Random.nextInt(grid.size)

        if (puedeColocarPalabra(grid, texto, startRow, startCol, direccion)) {
            insertarPalabra(grid, texto, startRow, startCol, direccion)
            break
        }
    }
}

fun puedeColocarPalabra(
    grid: Array<CharArray>,
    palabra: String,
    startRow: Int,
    startCol: Int,
    direccion: String
): Boolean {
    for (i in palabra.indices) {
        val row = when (direccion) {
            "H" -> startRow
            "V" -> startRow + i
            "D" -> startRow + i
            else -> return false
        }

        val col = when (direccion) {
            "H" -> startCol + i
            "V" -> startCol
            "D" -> startCol + i
            else -> return false
        }

        if (row !in grid.indices || col !in grid[row].indices) return false // Fuera de los límites
        if (grid[row][col] != '-' && grid[row][col] != palabra[i]) return false // Colisión
    }
    return true
}

fun insertarPalabra(
    grid: Array<CharArray>,
    palabra: String,
    startRow: Int,
    startCol: Int,
    direccion: String
) {
    for (i in palabra.indices) {
        val row = when (direccion) {
            "H" -> startRow
            "V" -> startRow + i
            "D" -> startRow + i
            else -> startRow
        }

        val col = when (direccion) {
            "H" -> startCol + i
            "V" -> startCol
            "D" -> startCol + i
            else -> startCol
        }

        grid[row][col] = palabra[i]
    }
}
