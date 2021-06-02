fun main () {
    greet()
    introduce()
    doWork()
}

fun greet() {
    println("Hello")
}

fun age(): Int {
    return 21
}

fun introduce() {
    println("My name is Hau")

    fun showAge() {
        println("I'm " + age())
    }

    showAge()
}

fun doWork() {
    fun isYoung() = if (age()<20) println("I'm very young") else println("I'm still young")

    isYoung()
}