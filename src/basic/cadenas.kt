package basic


fun main() {
    val str = "Esto es una cadena de caracteres"

    println("Cadena original: $str")
    println("str.reversed(): ${str.reversed()}") // Invierte la cadena
    println("str.uppercase(): ${str.uppercase()}") // Convierte a mayúsculas
    println("str.lowercase(): ${str.lowercase()}") // Convierte a minúsculas
    println("str.capitalize(): ${str.replaceFirstChar { it.uppercase() }}") // Capitaliza la primera letra
    println("str.count { it == 'e' }: ${str.count { it == 'e' }}") // Cuenta el número de veces que aparece un carácter
    println("str.substring(5, 7): ${str.substring(5, 7)}") // Extrae una subcadena
    println("str.contains(\"cadena\"): ${str.contains("cadena")}") // Verifica si contiene una subcadena
    println("str.startsWith(\"Esto\"): ${str.startsWith("Esto")}") // Verifica si inicia con una subcadena
    println("str.endsWith(\"caracteres\"): ${str.endsWith("caracteres")}") // Verifica si termina con una subcadena
    println("str.replace(\"caracteres\", \"palabras\"): ${str.replace("caracteres", "palabras")}") // Reemplaza una subcadena
    println("str.trim(): ${str.trim()}") // Elimina espacios al inicio y final
    println("str.split(\" \"): ${str.split(" ")}") // Divide la cadena por un delimitador y devuelve una lista
    println("str.length: ${str.length}") // Devuelve la longitud de la cadena
    println("str.getOrNull(10): ${str.getOrNull(10)}") // Devuelve el carácter en una posición o null si no existe
    println("str.indexOf('c'): ${str.indexOf('c')}") // Encuentra la primera aparición de un carácter
    println("str.lastIndexOf('e'): ${str.lastIndexOf('e')}") // Encuentra la última aparición de un carácter
}


