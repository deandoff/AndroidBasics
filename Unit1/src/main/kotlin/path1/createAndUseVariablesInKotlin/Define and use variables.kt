package path1.createAndUseVariablesInKotlin

fun main () {
    printCount()
    println()
    printStringCount()
    println()
    printNumberOfPhotos()
}

fun printCount () {
//    val count: Int = 2
    val count = 2
    println(count)
}

fun printStringCount () {
//    val count: Int = 2
    val count = 2
    println("You have $count unread messages.")
}

fun printNumberOfPhotos () {
    val numberOfPhotos = 100
    val photosDeleted = 10
    println("$numberOfPhotos photos")
    println("$photosDeleted photos deleted")
    println("${numberOfPhotos - photosDeleted} photos left")
}