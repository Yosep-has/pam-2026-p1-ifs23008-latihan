package beginner.ControlFlow.ConditionalExpressionsPractice

fun main() {
    val button = "Y"

    println(
        when (button) {
            "A" -> "Yes"
            "B" -> "No"
            "X" -> "Menu"
            "Y" -> "Nothing"
            else -> "There is no such button"
        }
    )
}