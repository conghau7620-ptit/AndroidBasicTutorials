fun main() {
    var a=1
    var b=2
    var max: Int

    if (a>b) {
        max = a
    } else {
        max = b
    }
    println(max)

    //if expression
    max = if (a>b) a else b
    println(max)

    //use block
    max = if (a>b) {
        println("choose a")
        a
    } else {
        println("choose b")
        b
    }
}