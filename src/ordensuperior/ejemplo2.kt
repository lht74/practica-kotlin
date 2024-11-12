package ordensuperior
// Función de orden superior que recibe una lista y una función como parámetros
fun applyTransformation(numbers: List<Int>, transformation: (Int) -> Int): List<Int> {
    return numbers.map { transformation(it) } // Aplica la transformación a cada número
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val lista = List(5){it}
    // Ejemplo 1: Usar una función lambda para multiplicar por 2
    val doubledNumbers = applyTransformation(numbers) { it * 2 }
    println("Números duplicados: $doubledNumbers")

    // Ejemplo 2: Usar una función lambda para sumar 3 a cada número
    val incrementedNumbers = applyTransformation(numbers) { it + 3 }
    println("Números incrementados en 3: $incrementedNumbers")

    // Ejemplo 3: Usar una función definida previamente
    fun square(x: Int): Int = x * x
    val squaredNumbers = applyTransformation(numbers, ::square)
    println("Números al cuadrado: $squaredNumbers")

    println("**********************")
    fun factorial (n: Int):Int{
        return if (n==0 || n==1) 1
        else n * factorial(n-1)
            }

    val factNumbers = applyTransformation(lista,::factorial)
    println(factNumbers)

}
