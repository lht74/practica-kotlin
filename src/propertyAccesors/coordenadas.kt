package propertyAccesors

import java.util.*


class Coordinates {

    var x: Int = 0
        set(value) {

            field = value


        }


    var y: Int = 0
        set(value) {


            field = value


        }

    override fun toString(): String {
        return "( $x, $y )"
    }
}


fun processInputs() {
    val coordinates = Coordinates()
    val scanner = Scanner(System.`in`)
    do {
        val key = scanner.nextLine()
        when (key) {
            "up", "u" -> coordinates.y--
            "down", "d" -> coordinates.y++
            "left", "l" -> coordinates.x--
            "right", "r" -> {
                println("Moving right")
                coordinates.x++
            }
            "nowhere" -> {
            }
            "exit", "x" -> return
            else -> println("bad input: $key")
        }
        println(coordinates)
    } while (true)
}


//    fun processInputs() {
//        val coordinates = Coordinates()
//        var input: String?
//        do {
//            input = readlnOrNull()
//            when (input) {
//                "up", "u" -> coordinates.y--
//                "down", "d" -> coordinates.y++
//                "left", "l" -> coordinates.x--
//                "right", "r" -> {
//                    println("Moving right ")
//                    coordinates.x++
//                }
//                "nowhere" -> {
//                }
//                "exit","x" -> return
//                else -> println("bad input: $input")
//            }
//         println(coordinates)
//        } while (input != null)
//    }

    fun main() {
        // Simulando la entrada del usuario
        // System.setIn("up\nd\nnowhere\nleft\nright\nexit\nr".byteInputStream())

        processInputs()

    }


