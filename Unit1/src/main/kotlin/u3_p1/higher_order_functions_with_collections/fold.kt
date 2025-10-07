package u3_p1.higher_order_functions_with_collections

val totalPrice = cookies.fold(0.0) {total, cookie ->
    total + cookie.price
}

fun main() {
    println("Total price: $${totalPrice}")
}