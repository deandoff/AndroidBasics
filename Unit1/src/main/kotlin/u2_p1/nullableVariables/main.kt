package u2_p1.nullableVariables

fun main() {
    var number: Int? = 10
    println(number)

    number = null
    println(number)

    println()
    fun1()
}

fun fun1() {
    var favoriteActor: String? = "Sandra Oh"
    println(favoriteActor?.length)

    favoriteActor = null
    println(favoriteActor?.length)

//    println(favoriteActor!!.length)

    if (favoriteActor != null) {
        println(favoriteActor.length)
    } else {
        println("Empty name")
    }

    var favoriteActor2: String? = "Sandra Oh"
    val nameLength = favoriteActor2?.length ?: 0
    println(nameLength)

}