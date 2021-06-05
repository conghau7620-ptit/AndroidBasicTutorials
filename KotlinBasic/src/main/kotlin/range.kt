fun main() {
    for (i in 1.rangeTo(5)) {
        print("$i ")
    }
    println()

    for (i in 1..5) {
        print("$i ")
    }
    println()

    for (i in 'D'.downTo('A')) {
        print("$i ")
    }
    println()

    for (i in 'D' downTo 'A') {
        print("$i ")
    }
    println()

    for (i in 1..10 step 2) {
        print("$i ")
    }
    println()

    for (i in 1 until 5) {
        print("$i ")
    }
}