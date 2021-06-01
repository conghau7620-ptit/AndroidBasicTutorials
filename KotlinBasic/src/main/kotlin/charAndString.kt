fun main() {
    var char : Char = 'H'

    var st : String = "Hau dep trai"

    for (c in st) {
        println(c)
    }

    st = st + "số " + 1

    var message = """
        Hello,
        My name is Hau,
        Nice to meet you!
    """.trimIndent()

    println(message)

    var honey = "Buddy"
    println("Hello $honey")
}