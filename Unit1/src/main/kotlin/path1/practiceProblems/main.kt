package path1.practiceProblems

fun main() {
    printMessages()
    println()
    fixError()
    println()
    stringTemplates()
    println()
    stringConcatenation()
    println()
    messageFormatting()
    println()
    basicMath()
    println()
    defaultParameters()
    println()
    pedometer()
    println()
    compare()
    println()
    removeDuplicateCode()

}

fun printMessages () {
    println("Use the val keyword when the value doesn't change.")
    println("Use the var keyword when the value can change.")
    println("When you define a function, you define the parameters that can be passed to it.")
    println("When you call a function, you pass arguments for the parameters.")
}

//fix compile error
//fun main() {
    //println("New chat message from a friend'}
//}
fun fixError() {
    println("New chat message from a friend")
}

fun stringTemplates() {
//    val discountPercentage: Int = 0
    var discountPercentage: Int = 0
//    val offer: String = ""
    var offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"

    println(offer)
}

fun stringConcatenation() {
//    val numberOfAdults = "20"
//    val numberOfKids = "30"
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids

    println("The total party size is: $total")
}

fun messageFormatting() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = baseSalary + bonusAmount
    println("Congratulations for your bonus! You will recieve a total of $totalSalary (additional bonus).")
}

fun basicMath () {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    val subResult = subtract(firstNumber, secondNumber)
    val anotherSubResult = subtract(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")

    println("$firstNumber - $secondNumber = $subResult")
    println("$firstNumber - $thirdNumber = $anotherSubResult")
}

fun add(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber + secondNumber
}

fun subtract(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber - secondNumber
}

fun defaultParameters() {
    val firstUserEmailId = "user_one@gmail.com"
    println(displayAlertMessage(email = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"
    println(displayAlertMessage(osName = secondUserOperatingSystem, email = secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"
    println(displayAlertMessage(osName = thirdUserOperatingSystem, email = thirdUserEmailId))
    println()

}

fun displayAlertMessage(osName: String = "Unknown OS", email: String) : String {
    return "There's a new sign-in request on $osName for your Google Account $email."
}

fun pedometer() {
    val steps = 4000
    val caloriesBurned = pedometerStepsToCalories(steps)
    println("Walking $steps steps burns $caloriesBurned calories.")
}

fun pedometerStepsToCalories(numberOfSteps: Int) : Double {
    val caloriesBurnedForEachStep = 0.04
    val totalCaloriesBurned = numberOfSteps * caloriesBurnedForEachStep
    return totalCaloriesBurned
}

fun compare() {
    var firstNumber = 300
    var secondNumber = 250

    println(compareTwoNumbers(firstNumber, secondNumber))

    firstNumber = 300
    secondNumber = 300

    println(compareTwoNumbers(firstNumber, secondNumber))

    firstNumber = 200
    secondNumber = 220

    println(compareTwoNumbers(firstNumber, secondNumber))
}

fun compareTwoNumbers(firstNumber: Int, secondNumber: Int) : Boolean {
    return firstNumber > secondNumber
}

fun removeDuplicateCode() {
    weatherInCity(city = "Ankara", lowTemperature = 27, highTemperature = 31, rainChance = 82)
    weatherInCity(city = "Tokyo", lowTemperature = 32, highTemperature = 36, rainChance = 10)
    weatherInCity(city = "Cape Town", lowTemperature = 59, highTemperature = 64, rainChance = 2)
    weatherInCity(city = "Guatemala City", lowTemperature = 50, highTemperature = 55, rainChance = 7)
}

fun weatherInCity(city: String, lowTemperature : Int, highTemperature : Int, rainChance : Int) : Unit {
    println("City: $city")
    println("Low temperature: $lowTemperature, High temperature: $highTemperature")
    println("Chance of rain: $rainChance%")
    println()
}