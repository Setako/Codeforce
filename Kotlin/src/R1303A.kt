fun main() {
    repeat(readLine()!!.toInt()) {
        readLine()!!.let { str ->
            str.dropWhile { c -> c == '0' }.dropLastWhile { c -> c == '0' }
                    .count { c -> c == '0' }
        }.let { println(it) }
    }
}
