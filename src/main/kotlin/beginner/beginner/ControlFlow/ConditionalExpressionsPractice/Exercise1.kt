package beginner.ControlFlow.ConditionalExpressionsPractice

import kotlin.random.Random

fun main() {
    val firstResult = Random.nextInt(1, 7)
    val secondResult = Random.nextInt(1, 7)

    if (firstResult == secondResult) {
        println("You win :)")
    } else {
        println("You lose :(")
    }
}