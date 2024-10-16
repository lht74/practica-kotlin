package enumeraciones
import enumeraciones.Day.*
import enumeraciones.DayClassified.*

enum class Day{
    Monday,
    Tuesday,
    Wednesday,
    Thursday ,
    Friday,
    Saturday,
    Sunday
}

enum class DayClassified{
    Weekend,
    WorkingDay

}


fun Day.whatDayIs():DayClassified = when(this){
 Saturday , Sunday -> Weekend
    else -> WorkingDay
}

fun main() {
    val dia = Day.Sunday
    val otrora = Day.Friday


    println(dia.whatDayIs())
    println(otrora.whatDayIs())

    println(Day.entries)
    println(DayClassified.entries)

}