//nested class
class Outer {
    private val bar: Int = 1
    class Nested {
        fun foo() = 2
    }
}

val demo = Outer.Nested().foo() // == 2

//inner class
class Outer1 {
    private val bar: Int = 1
    inner class Inner {
        fun foo() = bar
    }
}

val demo1 = Outer1().Inner().foo() // == 1