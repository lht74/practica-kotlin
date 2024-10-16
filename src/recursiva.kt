fun main() {
//    val iterations = 5
//    val approximation = squareRootApproximation(iterations)
//    println("Aproximación a la raíz cuadrada de 2 después de $iterations iteraciones: $approximation")

   for (i in 1..6)
       println("Luego de $i iteraciones el resultado es: ${squareRootApproximation(i)}")


}

fun squareRootApproximation(iterations: Int): Double {
    require(iterations >= 0) { "El número de iteraciones debe ser no negativo." }

    // Valor inicial de la aproximación
    var approximation = 1.0

    // Llamada a la función recursiva
    approximation = improveApproximation(approximation, iterations)

    return approximation
}

fun improveApproximation(approximation: Double, iterations: Int): Double {
    // Caso base: Si no hay más iteraciones, devolver la aproximación actual
    if (iterations == 0) {
        return approximation
    }

    // Fórmula de Herón para mejorar la aproximación
    val newApproximation = 0.5 * (approximation + 2 / approximation)

    // Llamada recursiva con una iteración menos
    return improveApproximation(newApproximation, iterations - 1)
}
