package recursividad

import kotlin.random.Random

class Adivinar (val nivel : Int  ){

   fun numeroX () : Int {
                var n = 1
                for (i in 1..nivel)
                        n *=10
                return Random.nextInt(1,n)
        }





}
