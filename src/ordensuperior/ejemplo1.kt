package ordensuperior

fun executeOperation(operation: () -> Unit) {
    operation() // ejecuta la función pasada como parámetro
}

fun main() {
    executeOperation { println("Esta es una operación") }
}
