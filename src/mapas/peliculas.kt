package mapas


data class Peliculas(
    val titulo: String,
    val director: String,
    val reparto: List<String>,
    val qualification: Double,
    val enlace: String
)


val catalogo = listOf(
    Peliculas("La cosa (El enigma de otro mundo)", "John Carpenter", listOf( "Kurt Russell", "Wilford Brimley", "Keith David"), 7.3, "https://www.filmaffinity.com/es/film313264.html"),
    Peliculas("Posesión infernal", "Sam Raimi", listOf( "Bruce Campbell", "Ellen Sandweiss", "Betsy Baker"), 6.6, "https://www.filmaffinity.com/es/film939051.html"),
    Peliculas("Depredador", "John McTiernan", listOf( "Arnold Schwarzenegger", "Carl Weathers", "Sonny Landham"), 6.8, "https://www.filmaffinity.com/es/film987948.html"),
    Peliculas("Videodrome", "David Cronenberg", listOf("James Woods", "Deborah Harry", "Sonja Smits"), 6.6, "https://www.filmaffinity.com/es/film741689.html"),
    Peliculas("Pesadilla en Elm Street", "Wes Craven", listOf("Heather Langenkamp", "Robert Englund", "Johnny Depp"), 6.6, "https://www.filmaffinity.com/es/film183669.html"),
    Peliculas("Gremlins", "Joe Dante", listOf("Zach Galligan", "Phoebe Cates", "Hoyt Axton"), 6.6, "https://www.filmaffinity.com/es/film455839.html"),
    Peliculas("La mosca", "David Cronenberg", listOf("Jeff Goldblum", "Geena Davis", "John Getz"), 7.0, "https://www.filmaffinity.com/es/film353875.html"),
    Peliculas("Un hombre lobo americano en Londres", "John Landis", listOf("David Naughton", "Jenny Agutter", "Griffin Dunne"), 6.7, "https://www.filmaffinity.com/es/film949999.html"),
    Peliculas("Poltergeist (Fenómenos extraños)", "Tobe Hooper", listOf("Heather O'Rourke", "JoBeth Williams", "Craig T. Nelson"), 6.8, "https://www.filmaffinity.com/es/film318931.html"),
    Peliculas("Scanners", "David Cronenberg", listOf("Jennifer O'Neill", "Stephen Lack", "Patrick McGoohan"), 6.3, "https://www.filmaffinity.com/es/film774018.html"),
    Peliculas("Terroríficamente muertos", "Sam Raimi", listOf("Bruce Campbell", "Sarah Berry", "Dan Hicks"), 6.8, "https://www.filmaffinity.com/es/film216255.html"),
    Peliculas("Mal gusto (Bad Taste)", "Peter Jackson", listOf("Terry Potter", "Pete O'Herne", "Craig Smith"), 5.9, "https://www.filmaffinity.com/es/film788407.html"),
    Peliculas("Re-Animator", "Stuart Gordon", listOf("Jeffrey Combs", "Bruce Abbott", "Barbara Crampton"), 6.2, "https://www.filmaffinity.com/es/film106438.html"),
    Peliculas("Hellraiser", "Clive Barker", listOf("Andrew Robinson", "Clare Higgins", "Ashley Laurence"), 6.1, "https://www.filmaffinity.com/es/film943514.html"),
    Peliculas("Demonios", "Lamberto Bava", listOf("Urbano Barberini", "Natasha Hovey", "Karl Zinny"), 5.8, "https://www.filmaffinity.com/es/film781940.html"),
    Peliculas("El regreso de los muertos vivientes", "Dan O'Bannon", listOf("Clu Gulager, James Karen", "Don Calfa"), 6.2, "https://www.filmaffinity.com/es/film419817.html"),
    Peliculas("El corazón del ángel", "Alan Parker", listOf("Mickey Rourke", "Robert De Niro", "Charlotte Rampling"), 7.0, "https://www.filmaffinity.com/es/film656487.html"),
    Peliculas("Phenomena", "Dario Argento", listOf("Jennifer Connelly", "Daria Nicolodi", "Patrick Bauchau"), 6.1, "https://www.filmaffinity.com/es/film838324.html"),
    Peliculas("Los cazafantasmas", "Ivan Reitman", listOf("Bill Murray", "Dan Aykroyd", "Sigourney Weaver"), 6.5, "https://www.filmaffinity.com/es/film289694.html"),
    Peliculas("En compañía de lobos", "Neil Jordan", listOf("Angela Lansbury", "David Warner", "Sarah Patterson"), 6.5, "https://www.filmaffinity.com/es/film757960.html"),
    Peliculas("El más allá", "Lucio Fulci", listOf("Catriona MacColl", "David Warbeck", "Michele Mirabella"), 5.8, "https://www.filmaffinity.com/es/film412415.html"),
    Peliculas("Christine", "John Carpenter", listOf("Keith Gordon", "John Stockwell", "Alexandra Paul"), 6.2, "https://www.filmaffinity.com/es/film765863.html"),
    Peliculas("Maniaco (Maniac)", "William Lustig", listOf("Joe Spinell", "Caroline Munro", "Abigail Clayton"), 5.8, "https://www.filmaffinity.com/es/film730615.html"),
    Peliculas("El ente", "Sidney J. Furie", listOf("Barbara Hershey", "Ron Silver", "David Labiosa"), 6.4, "https://www.filmaffinity.com/es/film482208.html"),
    Peliculas("La posesión", "Andrzej Zulawski", listOf("Isabelle Adjani", "Sam Neill", "Margit Carstensen"), 6.6, "https://www.filmaffinity.com/es/film713191.html"),
    Peliculas("El cocinero, el ladrón, su mujer y su amante", "Peter Greenaway", listOf("Richard Bohringer", "Michael Gambon", "Helen Mirren"), 7.0, "https://www.filmaffinity.com/es/film951464.html"),
    Peliculas("El terror llama a su puerta", "Fred Dekker", listOf("Jason Lively", "Steve Marshall", "Jill Whitlow"), 5.6, "https://www.filmaffinity.com/es/film706478.html"),
    Peliculas("Asesinatos Anunciados", "Rufus Butler Seder", listOf("Rufus Butler Seder", "Eugene Seder", "Cheryl Hirshman"), 5.7, "https://www.filmaffinity.com/es/film747146.html"),
    Peliculas("Tetsuo, el hombre de hierro", "Shinya Tsukamoto", listOf("Tomorô Taguchi", "Kei Fujiwara", "Nobu Kanaoka"), 5.9, "https://www.filmaffinity.com/es/film376408.html"),
    Peliculas("El resplandor", "Stanley Kubrick", listOf("Jack Nicholson", "Shelley Duvall", "Danny Lloyd"), 8.2, "https://www.filmaffinity.com/es/film598422.html"),
    Peliculas("Aquella casa al lado del cementerio", "Lucio Fulci", listOf("Paolo Malco", "Catriona MacColl", "Dagmar Lassander"), 5.4, "https://www.filmaffinity.com/es/film603006.html"),
    Peliculas("Cujo", "Lewis Teague", listOf("Dee Wallace", "Daniel Hugh Kelly", "Danny Pintuaro"), 5.5, "https://www.filmaffinity.com/es/film702354.html"),
    Peliculas("Aullidos", "Joe Dante", listOf("Dee Wallace", "Patrick MacNee", "Belinda Balaski"), 6.0, "https://www.filmaffinity.com/es/film100428.html"),
    Peliculas("Basket Case ¿Dónde te escondes, hermano?", "Frank Henenlotter", listOf("Kevin Van Hentenryck", "Terri Susan Smith", "Beverly Bonner"), 5.4, "https://www.filmaffinity.com/es/film671772.html"),
    Peliculas("El Vengador Tóxico", "Michael Herz, Lloyd Kaufman", listOf("Andree Maranda", "Mitchell Cohen", "Jennifer Baptist"), 5.6, "https://www.filmaffinity.com/es/film169593.html"),
    Peliculas("Humanoides del abismo", "Barbara Peeters, Jimmy T. Murakami", listOf("Doug McClure", "Ann Turkel", "Vic Morrow"), 4.8, "https://www.filmaffinity.com/es/film815467.html"),
    Peliculas("La niebla", "John Carpenter", listOf("Adrienne Barbeau", "Tom Atkins", "Jamie Lee Curtis"), 6.2, "https://www.filmaffinity.com/es/film701969.html"),
    Peliculas("Henry: Retrato de un asesino", "John McNaughton", listOf("Michael Rooker", "Tracy Arnold", "Tom Towles"), 6.4, "https://www.filmaffinity.com/es/film917906.html"),
    Peliculas("Están vivos", "John Carpenter", listOf("Roddy Piper", "Keith David", "Meg Foster"), 6.4, "https://www.filmaffinity.com/es/film855019.html"),
    Peliculas("Inferno", "Dario Argento", listOf("Leigh McCloskey", "Irene Miracle", "Eleonora Giorgi"), 5.8, "https://www.filmaffinity.com/es/film780437.html"),
    Peliculas("Re-sonator", "Stuart Gordon", listOf("Jeffrey Combs", "Barbara Crampton", "Ken Foree"), 5.6, "https://www.filmaffinity.com/es/film897175.html"),
    Peliculas("Pacto de sangre", "Stan Winston", listOf("Lance Henriksen", "Jeff East", "John D'Aquino"), 5.6, "https://www.filmaffinity.com/es/film419963.html"),
    Peliculas("El terror no tiene forma", "Chuck Russell", listOf("Kevin Dillon", "Shawnee Smith", "Donovan Leitch"), 5.9, "https://www.filmaffinity.com/es/film561523.html"),
    Peliculas("Razorback: Los colmillos del infierno", "Russell Mulcahy", listOf("Gregory Harrison", "Arkie Whiteley", "Bill Kerr"), 5.3, "https://www.filmaffinity.com/es/film148460.html"),
    Peliculas("Lobos humanos", "Michael Wadleigh", listOf("Albert Finney", "Diane Venora", "Edward James Olmos", "Gregory Hines"), 5.8, "https://www.filmaffinity.com/es/film131637.html"),
    Peliculas("Critters 2", "Mick Garris", listOf("Terrence Mann", "Don Keith Opper", "Cynthia Garris"), 4.7, "https://www.filmaffinity.com/es/film716191.html"),
    Peliculas("Mil gritos tiene la noche", "Juan Piquer Simón", listOf("Christopher George", "Lynda Day George", "Frank Braña"), 5.2, "https://www.filmaffinity.com/es/film932937.html"),
    Peliculas("Al final de la escalera", "Peter Medak", listOf("George C. Scott", "Trish Van Devere", "Melvyn Douglas"), 7.2, "https://www.filmaffinity.com/es/film235143.html"),
    Peliculas("Creepshow", "George A. Romero", listOf("Hal Holbrook", "Leslie Nielsen", "Adrienne Barbeau"), 6.2, "https://www.filmaffinity.com/es/film293144.html"),
    Peliculas("Los chicos del maíz", "Fritz Kiersch", listOf("Peter Horton", "Linda Hamilton", "John Franklin"), 5.3, "https://www.filmaffinity.com/es/film503725.html")

)

fun actorToPelis ( films: List<Peliculas>): MutableMap<String, MutableList<String>> {

    val resp = mutableMapOf<String,MutableList<String>>()
    val actores = mutableSetOf<String>()

    /* guardo los nombres de todos los actores en un conjunto, para evitar duplicados */
    for ( peli in films)
        for (actor in peli.reparto)
            actores += actor


    for (actor in actores)   {
        if (!resp.containsKey(actor))
            resp[actor] = mutableListOf()
                }

    for ((key, value) in resp)
        for (peli in films)
            if (peli.reparto.contains(key) ) value += peli.titulo



        return resp
    }

fun directorToPelis ( films: List<Peliculas>): MutableMap<String, MutableList<String>> {

    val respuesta = mutableMapOf<String,MutableList<String>>()

    for (cadaPeli in films)
        if (!respuesta.containsKey(cadaPeli.director)) {
            respuesta[cadaPeli.director] = mutableListOf()
        }

    for (( key , value) in respuesta)
        for (cadaPeli in films)
            if (cadaPeli.director == key ) value+= cadaPeli.titulo



    return respuesta
}


fun main() {

 val mejores = mutableListOf<Peliculas>()

    for ( i in catalogo)
        if( i.qualification>=7.0)
            mejores+=i

    println("-----------------------------------")
    println("----Ordenadas por calificación-----")
    println("-----------------------------------\n")


    for (n in catalogo.sortedBy { it.qualification })
        println("${n.titulo}   Calificación: ${n.qualification}")

    println("\n-------------------------------")
    println("----Calificación >= 6.5--------")
    println("--------------------------------\n")


    mejores.sortBy { it.qualification }
    for (n in mejores)
     println("${n.titulo}   Calificación: ${n.qualification}")

    println("\n--------------------------------------------")
    println("--Listado de títulos por cada Director------")
    println("--------------------------------------------\n")

val directores = directorToPelis( catalogo)
    for ((key,value) in directores)
        println("$key // $value")


    println("\n--------------------------------------------")
    println("--Listado de títulos por cada actor------")
    println("--------------------------------------------\n")


    val actores = actorToPelis(catalogo)
    for ((key,value) in actores)
        println("$key // $value")

}