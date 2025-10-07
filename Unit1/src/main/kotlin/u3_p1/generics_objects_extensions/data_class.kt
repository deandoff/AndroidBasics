package u3_p1.generics_objects_extensions

data class DataQuestion<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

fun main() {
    val question1 = DataQuestion<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = DataQuestion<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = DataQuestion<Int>("How many days are there between full moons?", 28, Difficulty.HARD)
    println(question1.toString())
    println(question2.toString())
    println(question3.toString())
}