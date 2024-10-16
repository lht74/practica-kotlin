package expresionesRegulares

fun main() {
    val phrase = "To be or not to be"

    // a) Todas las ocurrencias de palabras
    val wordRegex = Regex("\\b\\w+\\b")
    val words = wordRegex.findAll(phrase)
    println("a) Todas las palabras:")
    words.forEach { println("   ${it.value} (posición: ${it.range})") }

    // b) Todas las ocurrencias de la palabra "be"
    val beRegex = Regex("\\bbe\\b", RegexOption.IGNORE_CASE)
    val beOccurrences = beRegex.findAll(phrase)
    println("\nb) Ocurrencias de 'be':")
    beOccurrences.forEach { println("   ${it.value} (posición: ${it.range})") }

    // c) Todas las ocurrencias de la letra "e"
    val eRegex = Regex("e", RegexOption.IGNORE_CASE)
    val eOccurrences = eRegex.findAll(phrase)
    println("\nc) Ocurrencias de la letra 'e':")
    eOccurrences.forEach { println("   ${it.value} (posición: ${it.range})") }

    // d) Cuenta la cantidad de vocales

    val texto = "La palabra murciélago contiene todas las vocales"
    val vocalsRegex= Regex("[aeiouáéíóú]",RegexOption.IGNORE_CASE)
    val vocals = vocalsRegex.findAll(texto).count()
    println("\nd) Cantidad de vocales en texto \n '$texto' es $vocals vocales." +
            "\n Detalle:")
    vocalsRegex.findAll(texto).forEach {
        println("'${it.value}' in the position ${it.range}" )
    }


}