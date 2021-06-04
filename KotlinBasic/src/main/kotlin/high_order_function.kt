fun main() {
    val saySth = passAFunction(sayHello)
    val show = showSum(sum2,1,1)
    val s = access()
    println("1 + 2 = ${s(1,2)}")
    val a = laugh()
    a()
}

//anonymous function
val sayHello = fun(){
    println("Hello there")
}

//high-order function
fun passAFunction(passedFun: () -> Unit) {
    passedFun()
}

//lambda expression
val sum2 = {x: Int, y: Int -> x+y}

//high-order function 2
fun showSum(passedFun: (Int, Int) -> Int, a: Int, b: Int) {
    println("$a + $b = ${passedFun(a,b)}")
}

fun sum3(a: Int, b: Int): Int = a+b

//high-order function return function
fun access() : (Int, Int) -> Int {
    return :: sum3
}

//bonus :))
fun haha() = println("hahaha, it's done")

fun laugh() : () -> Unit {
    return :: haha
}