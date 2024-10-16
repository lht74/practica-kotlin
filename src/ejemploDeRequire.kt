/* En este ejemplo, si ejecutamos la línea que está comentada, se mostrará el mensaje "Debes escribir un texto */


fun mostrar( texto:String?){
//    requireNotNull(texto){"Debes escribir un texto"}
    println(texto)
}


fun main() {
val texto1 = null
    mostrar(texto1)

}