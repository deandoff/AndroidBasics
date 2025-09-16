package u2_p1.kotlinFundamentals

fun main() {
    ex1()
    println()
    ex2()
    println()
    ex3()
    println()
    ex4()
    println()
    ex5()
    println()
    ex7()
}

fun ex1 () {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)

}

fun printNotificationSummary(numberOfMessages: Int) {
    if (numberOfMessages in 0..99) {
        println("You have $numberOfMessages notifications.")
    } else println("Your phone is blowing up! You have 99+ notifications.")
}

fun ex2() {
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("The movie ticker price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticker price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticker price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    when (age) {
        in 0..12 -> {
            return 15
        }
        in 13..60 -> {
            if (isMonday) {
                return 25
            }
            return 30
        }
        in 60..100 -> {
            return 20
        }
        else -> return -1
    }
}

fun ex3() {
    val celsiusToFahrenheit: (Double) -> Double = {
        temperature -> temperature * 9 / 5 + 32
    }

    val kelvinToCelsius: (Double) -> Double = {
        temperature -> temperature - 273.15
    }

    val fahrenheitToKelvin: (Double) -> Double = {
        temperature -> (temperature - 32) * 5 / 9 + 273.15
    }

    printFinalTemperature(27.0, "Celsius", "Fahrenheit", celsiusToFahrenheit)
    printFinalTemperature(350.0, "Kelvin", "Celsius", kelvinToCelsius)
    printFinalTemperature(10.0, "Fahrenheit", "Kelvin", fahrenheitToKelvin)

}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double,
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement))
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit")
}

fun ex4() {
    val americanIdiot : Song = Song("American Idiot", "Green Day", 2004, 15000000)
    americanIdiot.printSongDescription()
}

class Song (private val title: String, private val artist: String, private val yearPublished: Int,
            private val playCount: Int
) {

    val isPopular : Boolean = if (playCount > 1000) true else false

    fun printSongDescription() {
        println("${this.title}, performed by ${this.artist}, was released in ${this.yearPublished}.")
    }
}

fun ex5() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}

class Person (val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        println("Name: $name")
        println("Age: $age")
        if (hobby != null && referrer == null) {
            println("Likes to $hobby. Doesn't have a referrer.")
        } else if (hobby != null && referrer != null) {
            println("Likes to $hobby. Has a referrer named ${referrer.name}, who likes to ${referrer.hobby}.")
        }
    }
}

fun ex6() {

}

open class Phone(var isScreenLightOn: Boolean = false) {
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone (var isFolded: Boolean = false) : Phone() {
    override fun switchOn() {
        if (!isFolded) {
            isScreenLightOn = true
        }
    }

    fun fold() {
        isFolded = true
        switchOff()
    }

    fun unfold() {
        isFolded = false
    }

    fun checkFoldingState() {
        val foldingState = if (isFolded) "folded" else "unfolded"
        println("The phone is $foldingState")
    }
}

fun ex7() {
    val winningBid = Bid(5000, "Private Collector")

    println("Item A is sold at ${auctionPrice(winningBid, 2000)}")
    println("Item B is sold at ${auctionPrice(null, 3000)}")
}

class Bid(val amount: Int, val bidder: String)

fun auctionPrice(bid: Bid?, minPrice: Int): Int {
    return bid?.amount ?: minPrice
}