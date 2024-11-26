package expresionesRegulares

fun main() {
    val lista = listOf("Hola mundo", "hola mundo", "chau mundo", "bye bye", "Mundo", "Inmundo", " mundo3", "mundos")
    for (str in lista){

        println("$str : contiene 'mundo'? : ${str.contains("mundo")}   ")

    }

}