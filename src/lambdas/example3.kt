package lambdas

/*  Ejemplo de aplicación de funciones lambda: La lista "numbers" contiene un intervalo de números naturales
    en la variable "sum" se almacena la sumatoria de los impares dentro de la lista, para el filtrado utilizo
    "isOdd" definido mediante lambda, luego las funciones .filter y .foreach .

 */

fun main() {
    val numbers = mutableListOf<Int>()
    val isOdd = { n: Int -> n % 2 == 1 }
    var sum = 0

    for (i in 1..32)
        numbers += i
    numbers.filter(isOdd).forEach { sum += it }
    println(sum)
}