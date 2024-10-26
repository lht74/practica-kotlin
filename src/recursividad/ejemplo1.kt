package recursividad

fun countDown(n: Int) {
    if (n > 0) {
        println(n)
        countDown(n - 1) // llamada recursiva
    }
}

fun factorial(n:Int):Int{
    return if (n == 0 || n ==1) 1
    else n * factorial(n-1)

}

fun main() {

    val pares = mutableMapOf<Int,Int>()
    for (i in 0 ..10)
        pares[i]= factorial(i)

    for ((key,value ) in pares )
        println("$key ! = $value")

    countDown(5) // imprime 5, 4, 3, 2, 1



}
