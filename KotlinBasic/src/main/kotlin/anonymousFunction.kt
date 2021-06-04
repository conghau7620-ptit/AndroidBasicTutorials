//anonymous function returning value
var add = fun(a: Int, b: Int) :Int {
    return a+b
}

//anonymous function without returning value
var sayHi = fun() {
    println("Hi there")
}

fun main() {
    println("1 + 1 = ${add(1,1)}")
    sayHi()
}
