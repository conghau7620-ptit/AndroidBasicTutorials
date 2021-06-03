fun main() {
    var x = 10;
    while (x>0) {
        println(x)
        if (x==5)
            break
        x--
    }
    do {
        if (x==7){
            x++
            continue
        }
        println(x)
        x++
    } while (x<10)
}