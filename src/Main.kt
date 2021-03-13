fun main(args: Array<String>) {
    var items = 5

//    while (items > 0) {
//        println(items)
//        items--
//    }

//    do {
//        println("Items: $items")
//    } while (items == 5)

//    for(i in 1..10 step 2) {
//        println(i)
//    }

//    for(i in 10 downTo 0 step 2) {
//        println(i)
//    }

//    for(el in 'a'..'y' step 2) {
//        println(el)
//    }

    for(el in 'z' downTo 'a' step 5) {
        println(el)
    }

    val x = 20
    if(x !in 5..30) {
        println("Variable: $x")
    }
}