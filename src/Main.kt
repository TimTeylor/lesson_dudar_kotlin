fun printSome(item: String = "Hi", vararg word: Any) {
    print("$item: ")
    word.forEach { el -> print("$el ") }
    println("")
}

fun main(args: Array<String>) {
    var names = arrayOf("Bob", "John", "Alex")
    printSome()
    printSome(word = *arrayOf("Hi"))
    printSome(word = *arrayOf("Hi"), item = "Some")
    printSome("Hi", "Some", "hello")
    printSome("Hi", *names)
}