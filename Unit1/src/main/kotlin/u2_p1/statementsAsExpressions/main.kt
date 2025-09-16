package u2_p1.statementsAsExpressions

fun main() {
    val trafficLightColor = "red"

    val message = if (trafficLightColor == "red") {
        println("Stop!")
    } else if (trafficLightColor == "yellow") {
        println("Slow")
    } else if (trafficLightColor == "green") {
        println("Go")
    } else {
        println("Invalid color")
    }

}

fun main1() {
    val trafficLightColor = "amber"

    when (trafficLightColor) {
        "red" -> println("Stop!")
        "yellow", "amber" -> println("Slow!")
        "green" -> println("Go")
        else -> println("Invalid color")
    }

}