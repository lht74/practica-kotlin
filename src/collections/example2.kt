package collections

fun main() {
    val mapa = mutableMapOf<Int,Int>()
    val n = List(size = 11){it}
    val pow2 = List(11){it*it}
    for (i in n)
        mapa += i to pow2[i]

   for( (index, value ) in mapa)
       println("$index^2 = $value; ")

   println("\n/******************************/\n")
   val pow3 = List(size = 11){it*it*it}
   for (i in n){
       mapa.replace(i,pow3[i])
   }

    for( (index, value ) in mapa)
        println("$index^3 = $value; ")

    println("N = ${n.joinToString("; ", prefix = "{ ", postfix = " }"){"$it"}}")

}