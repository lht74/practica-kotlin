package expresionesRegulares

fun countCharOccurrences2(char: Char, text: String): Int {
    // Mapa de caracteres no acentuados a sus versiones acentuadas
    val accentMap = mapOf(
        'a' to "[aáàâä]",
        'e' to "[eéèêë]",
        'i' to "[iíìîï]",
        'o' to "[oóòôö]",
        'u' to "[uúùûü]",
        'n' to "[nñ]"
    )

    // Obtenemos el patrón para el carácter, incluyendo acentos si es aplicable
    val pattern = accentMap[char.lowercaseChar()] ?: Regex.escape(char.toString())

    // Creamos un patrón Regex, ignorando mayúsculas y minúsculas
    val regex = Regex(pattern, RegexOption.IGNORE_CASE)

    // Usamos findAll para encontrar todas las ocurrencias y las contamos
    return regex.findAll(text).count()
}

fun main() {
    val testText = "El rápido zorro marrón salta sobre el perro perezoso "

    println("Texto: \"$testText\"")

    val charsToCount = listOf('a', 'e', 'i', 'o', 'u', 'n')

    charsToCount.forEach { char ->
        val count = countCharOccurrences2(char, testText)
        println("Ocurrencias de '$char' (incluyendo acentos): $count")
    }

    // Probamos con un carácter específico con acento
    val charToCount = 'á'
    println("Ocurrencias de '$charToCount': ${countCharOccurrences2(charToCount, testText)}")
}