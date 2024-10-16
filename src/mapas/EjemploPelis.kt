data class Peliculas1(
    val titulo: String,
    val director: String ="",
    val reparto: List<String>

)

fun createActorPeli(coleccion: List<Peliculas1>): Map<String, List<String>> {
    val resultado = mutableMapOf<String, MutableList<String>>()
    for (i in coleccion.indices) {
        for (actor in coleccion[i].reparto) {
            if (!resultado.containsKey(actor)) {
                resultado[actor] = mutableListOf()
            }
            resultado[actor]?.plusAssign(coleccion[i].titulo)
        }
    }
    return resultado
}

fun main() {
    val catalogo = listOf(

        Peliculas1("La cosa (El enigma de otro mundo)", director = "John Carpenter",
            reparto = listOf("Kurt Russell", "Wilford Brimley","Keith David")),

         Peliculas1("Posesión infernal", director = "Sam Raimi",
        reparto = listOf("Bruce Campbell", "Ellen Sandweiss","Betsy Baker")),

         Peliculas1("Depredador", director = "John McTiernan",
        reparto = listOf("Arnold Schwarzenegger", "Carl Weathers","Sonny Landham")),

         Peliculas1("Videodrome", director = "David Cronenberg",
        reparto = listOf("James Woods", "Deborah Harry","Sonja Smits")) ,


        Peliculas1("Rocky",  reparto = listOf("Stallone", "Talia Shire")),
        Peliculas1("Batman",  reparto = listOf("Michael Keaton", "Jack Nicholson")),
    )

    val maparesultante = createActorPeli(catalogo)

    for ((key, value) in maparesultante)
        println("$key , $value")
}
