package lambdas



fun main() {

    val numbers = List(size = 20){it}

    val selectedNumbers = numbers.filter { n ->
        if (n == 5){
            println("special = $n")
            return@filter  true
        }
        n % 3 ==0
    }



    println(numbers)
    println()
    println(selectedNumbers)

}