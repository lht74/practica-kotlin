package mapas

class CountSetAnexions<E> {

    private val mapOfAnexions = mutableMapOf<E,Int>()

    fun addToColection(element: E ) {
        mapOfAnexions[element] = ( mapOfAnexions[element] ?: 0 ) + 1
            }

    fun countElements(element: E) = mapOfAnexions[element] ?: 0

    fun showColection() {
        println(mapOfAnexions.keys)

    }
    fun showTotalSize() = mapOfAnexions.keys.size

}

fun main() {

    val colecionA = CountSetAnexions<Int>()
    val colectionB = CountSetAnexions<String>()


    colecionA.addToColection(0)
    colecionA.addToColection(1)
    colecionA.addToColection(2)
    colecionA.addToColection(3)
    colecionA.addToColection(4)
    colecionA.addToColection(5)
    colecionA.addToColection(5)

    println(colecionA.countElements(3))
    colecionA.showColection()

    colectionB.addToColection("Hola")

    for (s in 'a'..'z')
        for (t in 'a'.. 'z')
          for (u in 'a'..'z')
        {
            colectionB.addToColection("$s$t$u")
           }

    colectionB.showColection()
    println(colectionB.showTotalSize())
    println(colectionB.countElements("lht"))






}