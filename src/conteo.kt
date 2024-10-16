fun main() {
    val numeroMaximo = 1000
    var listaNumeros = ""
    var contadorRojos = 0
    var auxiliar =""
    // Concatenar números del 1 al 1000 en una cadena
    for (i in 1..numeroMaximo) {
        listaNumeros += i.toString()
    }

    // Iterar sobre la cadena y contar los 9 rojos
    var colorActual = "Rojo"
    for (i in listaNumeros.indices) {
        if (listaNumeros[i] == '9' && colorActual == "Rojo") {
            contadorRojos++

        }

        // Cambiar color cada 3 dígitos
        auxiliar=  listaNumeros[i].toString()
        print(auxiliar)
        if ((i + 1) % 3 == 0) {
            colorActual = if (colorActual == "Rojo") "Verde" else "Rojo"

            println()

        }
    }
    println(listaNumeros)
    println("Cantidad de 9 rojos: $contadorRojos")
}