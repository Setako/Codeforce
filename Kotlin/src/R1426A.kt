import kotlin.math.ceil
import kotlin.math.roundToInt


fun main() {
    fun readWords() = readLine()!!.split(" ")
    fun readIntArr() = readWords().map { it.toInt() }
    fun readDoubleArr() = readWords().map { it.toDouble() }

    val t = readLine()!!.toInt()
    repeat(t) {
        val (n, x) = readIntArr()
        val result = when {
            n <= 2 -> 0
            else -> ceil((n - 2).toDouble() / x).roundToInt()
        }
        println(result + 1)
    }
}
