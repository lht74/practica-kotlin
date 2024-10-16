package memberreferences


data class Student(
    val id: Int,
    val name: String
)
data class Numeric(
    val id: Int,
    val n: Int
)

fun main() {
    val names = listOf("Alice", "Bob","John","Stewart","Bill")
//    val students =
//        names.mapIndexed { index, name ->
//            Student(index, name)
//        }

   val numbers = List(size = 10){it*it -1}
   val sequence = numbers.mapIndexed(::Numeric)
   for (num in sequence)
       println(num)

    val list = names.mapIndexed(::Student)
    for (element in list)
        println(element)

}