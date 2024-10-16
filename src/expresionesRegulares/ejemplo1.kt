package expresionesRegulares



import kotlin.text.Regex

fun main() {
    // 1. Creación de un objeto Regex
    val regex1 = Regex("patrón")
    val regex2 = "patrón".toRegex()

    // 2. Coincidencia de patrones
    val texto = "uno dos dos tres tres"
    val coincide = regex1.matches(texto)
    println("¿Coincide 'Hola, mundo!' con 'patrón'? $coincide")

    // 3. Búsqueda de patrones
    val regex3 = Regex("tres")
    val coincidencias = regex3.findAll(texto)
    println("Palabras encontradas: ${coincidencias.map { it.value }}")

    // 4. Reemplazo de patrones
    val reemplazo = regex3.replace(texto, "PALABRA")
    println("Texto con reemplazo: $reemplazo")

    // 5. Ejemplos de patrones comunes
    val emailRegex = Regex("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\$")
    println("¿Es 'usuario@dominio.com' un email válido? ${emailRegex.matches("usuario@dominio.com")}")

    val fechaRegex = Regex("^\\d{4}-\\d{2}-\\d{2}\$")
    println("¿Es '2024-09-25' una fecha válida? ${fechaRegex.matches("2024-09-25")}")

    // 6. Uso de opciones de regex
    val regexInsensible = Regex("kotlin", RegexOption.IGNORE_CASE)
    println("¿Coincide 'KOTLIN' con 'kotlin' (ignorando mayúsculas)? ${regexInsensible.matches("KOTLIN")}")
}