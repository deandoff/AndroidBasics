package u2_p1.ifElseStatement

fun main() {
    val trafficLightColor = "green"

    if (trafficLightColor == "red") {
        println("Stop!")
    } else if (trafficLightColor == "yellow") {
        println("Slow")
    } else if (trafficLightColor == "green") {
        println("Go")
    } else println("Invalid color")

}