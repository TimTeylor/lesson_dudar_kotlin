fun sayHello(first: String, number: Int) {
    println("$first - $number")
}

fun add(x: Int, y: Int): Int {
    return x + y
}

fun saySomething(first: Boolean): String = "Hello world $first"

fun main(args: Array<String>) {
    sayHello("Hello", 13)
    val result = add(4, 16)
    println(result)
    println(saySomething(true))
}