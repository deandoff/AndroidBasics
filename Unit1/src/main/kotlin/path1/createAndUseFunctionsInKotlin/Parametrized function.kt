package path1.createAndUseFunctionsInKotlin

fun birthdayGreeting (name: String): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now 5 years old!"
    return "$nameGreeting\n$ageGreeting"
}

fun birthdayGreeting (name: String, age: Int): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}

fun birthdayGreetingDefault (name: String = "Rover", age: Int) : String {
    return "Happy Birthday, $name! You are now $age years old!"
}

fun main () {
    println(birthdayGreeting("Darling"))
    println()
    println(birthdayGreeting(age = 14, name = "Kotlin"))
    println()
    println(birthdayGreetingDefault(age = 14))
}