fun main() {
    fun readWords() = readLine()!!.split(" ")
    fun readIntList() = readWords().map { it.toInt() }
    fun readDoubleList() = readWords().map { it.toDouble() }

    fun readIntMatrix(rows: Int) = (1..rows).map { readIntList() }


    val t = readLine()!!.toInt()
    repeat(t) {
        val (n, m) = readIntList()
        val matrixs = (1..n).map { readIntMatrix(2).flatten() }
        if (m % 2 != 0) {
            println("No")
        } else {


            val i0Map = hashMapOf<Int, HashSet<Int>>()
            val i1Map = hashMapOf<Int, HashSet<Int>>()
            val i2Map = hashMapOf<Int, HashSet<Int>>()
            val i3Map = hashMapOf<Int, HashSet<Int>>()

            matrixs.forEachIndexed { index, (i0, i1, i2, i3) ->
                i0Map.getOrPut(i0) { HashSet() }.add(index)
                i1Map.getOrPut(i1) { HashSet() }.add(index)
                i2Map.getOrPut(i2) { HashSet() }.add(index)
                i3Map.getOrPut(i3) { HashSet() }.add(index)

            }

            if (!matrixs.any { (i0, i1, i2, i3) -> i1 == i2 }) {
                println("No")
                return@repeat
            }

            if (!matrixs.withIndex().any { (index, value) ->
                        val (i0, i1, i2, i3) = value
                        val i0match = i0Map[i0] ?: setOf()
                        val i1match = i1Map[i2] ?: setOf()
                        val i2match = i2Map[i1] ?: setOf()
                        val i3match = i3Map[i3] ?: setOf()

                        i0match.intersect(i1match).intersect(i2match).intersect(i3match).isNotEmpty()

                    }) {
                println("No")
                return@repeat
            }

            println("Yes")
        }
    }
}
