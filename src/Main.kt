fun main(args: Array<String>) {
    val alex = User("Alex", "Marley")

//    alex.firstName = "Alexander"
    println(alex.firstName)
//    alex.printUser()

    alex.login = "Codi"
    alex.login

    val john = User("John", "Doe")
//    john.firstName = "John"
//    john.secondName = "Doe"

    val peter = User()
    val bob = User(secondName = "Bob")

    peter.login
}