package u1_p1.createAndUseVariablesInKotlin

fun main () {
    cartTotalVar()
    println()
    increment()
}

//fun cartTotalVal () {
//    val cartTotal = 0
//    cartTotal = 20
//    println("Total: $cartTotal")
//}

fun cartTotalVar() {
    var cartTotal = 0
    println("Total: $cartTotal")
    cartTotal = 20
    println("Total: $cartTotal")
}

fun increment() {
    var count = 10
    println("You have $count unread messages")
    count += 1
    println("You have $count unread messages")
    count--
    count--
    println("You have $count unread messages")
}