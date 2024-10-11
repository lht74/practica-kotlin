fun binarySearch(arr: IntArray, key: Int): Int {
    var low = 0
    var high = arr.size - 1

    while (low <= high) {
        val mid = low + (high - low) / 2

        when {
            arr[mid] == key -> return mid
            arr[mid] < key -> low = mid + 1
            else -> high = mid - 1
        }
    }

    return -1  // Elemento no encontrado
}

fun main() {
    val arr = intArrayOf(1, 3, 5, 7, 9, 11)
    val key = 7
    val result = binarySearch(arr, key)

    if (result != -1) {
        println("El elemento se encuentra en el índice: $result")
    } else {
        println("Elemento no encontrado.")
    }
}
