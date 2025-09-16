package u1_p1.createAndUseVariablesInKotlin

fun main() {
    double()
    println()
    string()
    println()
    boolean()
}

fun double() {
//    val trip1 : Double = 3.20
//    val trip2 : Double = 4.10
//    val trip3 : Double = 1.72
//    val totalTripLength : Double = trip1 + trip2 + trip3
    val trip1 = 3.20
    val trip2 = 4.10
    val trip3 = 1.72
    val totalTripLength = trip1 + trip2 + trip3
    println("$totalTripLength miles left to destination")
}

fun string() {
    val nextMeeting = "Next meeting: "
    val date = "January 1"
    val reminder = nextMeeting + date + " at work"
    println(reminder)

    println("Say \"hello\"")
}

fun boolean () {
    val notificationsEnabled : Boolean = true
    println(notificationsEnabled)

    println("Are notifications enabled? " + notificationsEnabled)

}

// this is a comment example

/* long
long
long
comment
example
 */