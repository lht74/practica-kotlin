package recursividad

fun fibonacci(n:Int): List<Int>{
  val listaFibNum = mutableListOf<Int>()
    for (i in 1..n){
      listaFibNum.add(fibonacciTerm(i))

    }
    return listaFibNum
}


fun fibonacciTerm(n:Int):Int{
    return if ( n == 1 || n == 2) 1
    else (fibonacciTerm(n-1) + fibonacciTerm(n-2))
}

fun main() {
   val lista = fibonacci(20)
   for( i in 0..lista.size-2)
       println("b_$i = ${lista[i+1].toDouble() /lista[i] }")
    println(lista)
}