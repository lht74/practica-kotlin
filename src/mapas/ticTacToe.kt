package mapas



class Coordenada {

    var contenido: String = "_"

    var fila: Int = 1
    var columna: Int = 1

}


fun leerEntrada(): Int {
    var fila: Int
    var columna: Int

//     println("Enter the coordinates (separated by a space):")
    while (true) {
        val entrada = readln().trim()
        try {
            // Dividir la entrada por espacios
            val partes = entrada.split(" ")
            if (partes.size != 2) {
                println("You should enter two numbers separated by a space!")
                continue
            }

            // Intentar convertir las partes en números
            fila = partes[0].toIntOrNull() ?: throw IllegalArgumentException("You should enter numbers!")
            columna = partes[1].toIntOrNull() ?: throw IllegalArgumentException("You should enter numbers!")

            // Validar que los números estén en el rango 1 a 3
            if (fila !in 1..3 || columna !in 1..3) {
                println("Coordinates should be from 1 to 3!")
                continue
            }

            break
        } catch (e: Exception) {
            println(e.message ?: "Invalid input")
        }
    }

    // Convertir las coordenadas (fila, columna) en índice lineal
    return (fila - 1) * 3 + (columna - 1)
}


// Esta función (leerTablero ) sólo fue necesaria para el desarrollo del juego
fun leerTablero(): String {
    while (true) {
        val entrada = readln()

        // Verificar que la entrada tenga exactamente 9 caracteres
        if (entrada.length != 9) {
            println("Por favor, ingresa exactamente 9 símbolos")
            continue
        }

        // Verificar que solo contenga caracteres válidos
        if (entrada.all { it in "XO_" }) {
            return entrada
        } else {
            println("Por favor, usa solo los caracteres 'X', 'O' o '_'")
        }
    }
}



fun mostrarTablero(tablero: String) {
    println("---------")
    for (i in 0..6 step 3) {
        println("| ${tablero[i]} ${tablero[i + 1]} ${tablero[i + 2]} |")
    }
    println("---------")

}
// Devuelve true si el tablero está lleno
fun verificarTableroLleno(tablero: String): Boolean {
    return ( tablero.all { it in "XO" } && tablero.length == 9 )
}

fun analizeGame(tablero: String): String {
    var ganador = ""
    var aciertos = 0

    //    verifica lineas horizontales
    for (i in 0 ..6 step 3) {
        if (tablero[i] == tablero[i + 1] && tablero[i + 1] == tablero[i + 2] && tablero[i] != '_') {
            ganador = tablero[i].toString()
            aciertos++
        }
    }
    //   verifica lineas verticales
    for(i in 0..2){
        if (tablero[i] == tablero[i + 3] && tablero[i + 3] == tablero[i + 6] && tablero[i] != '_') {
            ganador = tablero[i].toString()
            aciertos++
        }
    }

    //    verifica diagonales
    if (tablero[0] == tablero[4] && tablero[4] == tablero[8] && tablero[0] != '_') {
        ganador = tablero[0].toString()
        aciertos++

    }
    if (tablero[2] == tablero[4] && tablero[4] == tablero[6] && tablero[2] != '_') {
        ganador = tablero[2].toString()
        aciertos++
    }
    return when( aciertos ) {
        0 -> if (verificarTableroLleno(tablero)) "Draw" else
            "Game not finished"
        //        {if (juegoImposible(tablero)) "Impossible" else "Game not finished"}
        1 -> "$ganador wins"
        else -> "?"
    }
}

fun contarOcurrencias(tablero: String, simbolo: Char): Int =
    tablero.count { it == simbolo }

fun juegoImposible(tablero: String): Boolean {
    val numX = contarOcurrencias(tablero, 'X')
    val numO = contarOcurrencias(tablero, 'O')
    return numX - numO !in -1..1
}

fun creaMapa(tablero: String): MutableMap<Int, Coordenada> {
    // Validar que el tablero tenga al menos 9 caracteres
    require(tablero.length == 9) { "El tablero debe tener exactamente 9 caracteres." }

    // Crear e inicializar el mapa con 9 instancias de Coordenada
    val mapa = mutableMapOf<Int, Coordenada>()
    for (i in 0..8) {
        mapa[i] = Coordenada()
        mapa[i]?.fila = (i / 3) + 1
        mapa[i]?.columna = (i % 3) + 1
    }
    // Intentar asignar los caracteres del tablero al mapa
    for (i in 0..8) {
        if (mapa[i]?.contenido == "_") {
            mapa[i]?.contenido = tablero[i].toString()
        } else {
            throw IllegalArgumentException("This cell is occupied! Choose another one!")
        }
    }

    return mapa
}





fun main() {

    var tablero = "_________"
    val mapa = creaMapa(tablero)
    var estado: String = "Game not finished"
    var entrada  = 0
    var seguir = true
    var player = "X"

    while ( seguir ) {

        mostrarTablero(tablero)
        estado = analizeGame(tablero)

        if (estado.contains("wins") || estado.contains("Draw")
            || estado.contains("Impossible") ) {
            seguir = false
//          mostrarTablero(tablero)
            println(estado)
            break

        }



        try {

// lee coordenada jugador X
            entrada = leerEntrada()
// verifica que la coordenada esté vacía
// si está vacío, actualiza la variable 'tablero', sino, pide otra coordenada

            if (mapa[entrada]?.contenido == "_") {
                tablero = tablero.replaceRange(entrada, entrada+1, player)
                mapa[entrada]?.contenido = player
                player = if (player == "X") {
                    "O"
                } else {
                    "X"
                }
            } else {
                println("This cell is occupied! Choose another one!")
            }
        } catch (e: Exception) {
            println("Invalid input  ")
        }


    }






}