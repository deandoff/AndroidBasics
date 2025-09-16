package u1_p1.createAndUseFunctionsInKotlin

fun main() {
    println(birthdayGreetingString())
}

fun birthdayGreetingString() : String {
    val nameGreeting = "Happy Birthday, Rover!"
    val ageGreeting = "You are now 5 years old!"
    return "$nameGreeting\n$ageGreeting"
}