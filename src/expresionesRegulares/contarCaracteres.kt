package expresionesRegulares

/* Esta función cuenta la cantidad de ocurrencias del Char "char" en un String "texto" */

fun countCharOccurrences(char: Char, text: String): Int {
    // Creamos un patrón Regex para el carácter, ignorando mayúsculas y minúsculas
    val regex = Regex(Regex.escape(char.toString()), RegexOption.IGNORE_CASE)

    // Usamos findAll para encontrar todas las ocurrencias y las contamos
    return regex.findAll(text).count()
}

fun main() {
    val testText = "The quick brown fox jumps over the lazy dog"

    // Probamos la función con diferentes caracteres
    val charToCount1 = 'o'
    val charToCount2 = 'T'
    val charToCount3 = 'z'

    println("Texto: \"$testText\"")
    println("Ocurrencias de '$charToCount1': ${countCharOccurrences(charToCount1, testText)}")
    println("Ocurrencias de '$charToCount2': ${countCharOccurrences(charToCount2, testText)}")
    println("Ocurrencias de '$charToCount3': ${countCharOccurrences(charToCount3, testText)}")

    // Probamos con un carácter que no está en el texto
    val charToCount4 = 'X'
    println("Ocurrencias de '$charToCount4': ${countCharOccurrences(charToCount4, testText)}")
}