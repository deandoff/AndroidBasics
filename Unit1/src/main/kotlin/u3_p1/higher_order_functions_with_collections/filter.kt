package u3_p1.higher_order_functions_with_collections

//val softBakedMenu = cookies.filter {
//    it.softBaked
//}

fun main() {
    println("Soft cookies:")
    softBakedMenu.forEach {
        println("${it.name} - $${it.price}")
    }
}