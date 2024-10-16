fun converge(linea: Int, mensaje: String) {
    val longitud = mensaje.length
    var i = 0
    var j = longitud - 1

    do {
        print("\u001B[$linea;$i${mensaje[i]}")
        print("\u001B[$linea;$j${mensaje[j]}")
        i++
        j--
    } while (i < j)
}
fun main() {
    print("\u001B[10;5Hx")

}