fun main(args: Array<String>) {
    var word: String? = null
    var isHasCar: Boolean = true

//    word = "Hello"

    if(word == null) {
        println("Переменная word равна значению null")

        if(!isHasCar || word == null)
            println("Что-то сработало")
    } else if(word == "Hello")
        println("Переменная: $word")
    else
        print("Переменная word не равна значению null")

    val number: Int = 50
    when(number) {
        null -> print("Переменная равна null")
        10 -> print("Переменная равна 10")
        6 -> print("Переменная равна 6")
        190 -> print("Переменная равна 190")
        5 -> print("Переменная равна 5")
        else -> print("Переменная какая-то непонятная")
    }

//    var res = 0
//    if(number > 30)
//        res = 1
//    else
//        res = 0

    var res = if(number > 30) 1 else 0

    val words = when(number) {
        null -> "Ничего"
        else -> number
    }
}