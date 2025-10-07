package u3_p1.higher_order_functions_with_collections

val fullMenu = cookies.map {
    "${it.name} - $${it.price}"
}

fun main() {
    println("Full menu:")
    fullMenu.forEach {
        println(it)
    }
}