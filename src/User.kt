class User(var firstName: String = "Peter", var secondName: String = "Patric") {
    internal var login: String? = null
        set(value) {
            if(value == "Codi")
                field = "None"
            else
                field = value
            println("Значение переменной: $field")
        }
        get() {
            val loginField = field ?: "неизаестно"
            println("Переменная равна: $loginField")
            return field
        }

    internal fun printUser() {
        println("$firstName $secondName")
    }

//    var firstName: String = _firstName
//    var secondName: String = _secondName

//    init {
//        firstName = _firstName
//        secondName = _secondName
//    }

//    constructor(): this("Peter", "Patric") {
//        println("Данные были установлены")
//    }
//
//    constructor(firstName: String): this(firstName, "Patric") {
//        println("Данные были установлены")
//    }
}