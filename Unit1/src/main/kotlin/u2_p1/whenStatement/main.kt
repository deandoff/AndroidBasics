package u2_p1.whenStatement

fun main() {
    val trafficLightColor = "amber"

    when (trafficLightColor) {
        "red" -> {
            println("Stop!")
        }
        "yellow", "amber" -> {
            println("Slow")
        }
        "green" -> {
            println("Go")
        }
        else -> println("Invalid color")
    }
}