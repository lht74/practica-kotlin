
package argumentosVariables

fun mostrarVariables(s: String,  vararg n : Int){
    println("$s ${n.toList()}")
}

fun promediar(vararg n:Int){
    println("El promedio de: ${n.toList()} es ${n.average()}")

}

fun main() {
mostrarVariables("numeros", 1,2,3)
promediar(4,5,6)

}