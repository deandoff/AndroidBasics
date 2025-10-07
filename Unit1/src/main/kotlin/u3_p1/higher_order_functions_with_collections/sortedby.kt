package u3_p1.higher_order_functions_with_collections

val alphabeticalMenu = cookies.sortedBy {
    it.name
}

fun main() {
    println("Alphabetical menu:")
    alphabeticalMenu.forEach {
        println(it.name)
    }
}