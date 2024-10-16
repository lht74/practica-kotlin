package memberreferences

data class Films(
    val title:String,
    val genre: String,
    val rating: Double
)

data class Triples(
    val a: Int,
    val b: Int,
    val c: Int
)

fun allEquals(nums: Triples): Boolean = nums.a == nums.b &&  nums.b == nums.c

fun main() {

    movies()
    triplesOperations()

}

fun triplesOperations(){
    val triples = mutableListOf<Triples>()
    val sets = mutableListOf <Set<Int>>()
    for (a in 1..10)
     for (b in 1..10)
         for (c in 1..10) {
             if (!sets.contains(setOf(a,b,c))){
             sets += setOf(a,b,c)
             triples += Triples(a, b, c)
             }
         }
//    for (element in triples)
//        println(element)

//     val example = triples.sortedWith(compareBy(Triples::a, Triples::c))
//     for (element in example)
//         println(element)

     val with5  = triples.filter { it.a == 5 || it.b == 5 || it.c ==5}

//     for (i in with5)
//        println(i)

    val withFirstFive = triples.filter{it.withFirst(5)}

    for (i in withFirstFive)
          println(i)


   println("***************************")
    val equals = triples.filter (::allEquals)

    for (i in equals)
    println(i)



}

fun Triples.withFirst(n: Int):Boolean = a == n

fun movies() {

    val collection = listOf(
        Films("The Ring", "Horror", 7.0),
        Films("Saw", "Horror", 6.2),
        Films("The Whale", "Drama", 8.0),
        Films("Resident Alien", "Comedy", 8.1)
    )

    val collection1 = collection.sortedWith(compareBy(Films::rating, Films::title))

    for (movie in collection1)
        println(movie)

}
