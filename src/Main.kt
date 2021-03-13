fun printArray(items: Map<String, Any>) {
    items.forEach { key, value ->
        println("$key -> $value")
    }
}

fun main(args: Array<String>) {
    var items: Array<Any> = arrayOf(4, 5, 7, 1, 2, 0, "Hello", true)
//    var items_list = listOf(4, 5, 7, 1, 2, 0)
    var items_list = mutableListOf<Any>(4, 5, 7, 1, 2, 0)
//    val someArray = arrayOf(true, false)
//    println(items.set(0, 11))
//    println(items[0])
//    println(items.get(1))
//    println(items.size)

    var dogs = listOf<Any>("Bob", "Charley")

    items_list.add("Dogs")
    items_list.addAll(4, dogs)

//    var user = mapOf("name" to "Bob", "age" to 1, "isHasCar" to true)
    var user = mutableMapOf<String, Any>("name" to "Bob", "age" to 1, "isHasCar" to true)
    user.put("city", "New York")

    printArray(user)

//    for(el in items)
//        println(el)

//    items.forEachIndexed { index, el ->
//        println("$el с индексом $index")
//    }

//    user.forEach { (key, value) -> println("$key -> $value") }
}