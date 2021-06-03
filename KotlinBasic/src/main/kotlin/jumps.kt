fun main() {
    count()
}

fun count() {
        for (i in 1..10) {
            if (i==5) continue
            println(i)
        }
}