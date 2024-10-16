package secuencias

fun collatz( x:Int ):List<Int>{

    val resp: MutableList<Int> = mutableListOf()
    var aux = x

    while (aux!=1) {
        resp += aux
        aux = if ((aux % 2 == 0)) aux / 2 else 3 * aux + 1

    }
    resp += aux
    return resp

}

fun mostrarNumList ( lista :List<Int>){
    val cadenaResultado = lista.joinToString(" ")

    // Definir el ancho máximo de la pantalla
    val anchoMaximoPantalla = 120

    // Dividir la cadena en palabras
    val palabras = cadenaResultado.split(" ")

    // Unir las palabras en líneas sin cortar números
    var lineaActual = ""
    for (palabra in palabras) {
        if (lineaActual.length + palabra.length + 1 > anchoMaximoPantalla) {
            println(lineaActual)
            lineaActual = palabra
        } else {
            if (lineaActual.isNotEmpty()) {
                lineaActual += " "
            }
            lineaActual += palabra
        }
    }

    // Imprimir la última línea si es necesario
    if (lineaActual.isNotEmpty()) {
        println(lineaActual)
    }

}


fun main() {
    val mapa: MutableMap<Int,Int> = mutableMapOf()
    var cantidad: Int
    var claveDeMax = 0
    val cota = 10000

    for (i in 3..cota){
        cantidad = collatz(i).size
        mapa[i] = cantidad
    }

    val maximo:Int = mapa.values.max()

    for ((key,value ) in mapa){
        if (value==maximo)
            claveDeMax = key

    }
  println("_".repeat(80))
  println("En los primeros $cota números la secuencia más larga corresponde" +
          "al número $claveDeMax y tiene una longitud de $maximo ")

  println("La secuencia completa es: ")
  mostrarNumList(collatz(claveDeMax))
  println("*".repeat(160))
  mostrarNumList(collatz(55))
}