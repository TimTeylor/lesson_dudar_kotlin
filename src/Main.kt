class Some {
    companion object {
        var count = 0
    }

    init {
        count++
        println("Создано объектов: $count")
    }
}

fun filterList(list: List<String>, filter: (String) -> Boolean) {
    list.forEach { el ->
        if(filter(el))
            println(el)
    }
}

val filter: (String) -> Boolean = {
    it.startsWith("J")
}

fun main(args: Array<String>) {
    val list = listOf("Java", "PHP", "Perl", "JavaScript", "C++")
    filterList(list, filter)

//    val db = Db.MongoDb(5, "mongo")
//    val db_2 = Db.PostgreSQL(5, "mongo", true)
//
//    val db_copy = db.copy(conn = "Done")
//    if(db == db_copy)
//        println("Они равны")
//    else
//        println("Они не равны")
//
//    if(db_copy is Db.MongoDb) {
//        db_copy.printInfo()
//    }

//    val test = Some()
//    val test_2 = Some()
//    val test_3 = Some()
//    val test_4 = Some()

//    Some.count = 5
}
