package beginner.ControlFlow.LoopsPractice

fun main() {
    for (i in 1..100) {
        println(
            when {
                i % 3 == 0 && i % 5 == 0 -> "fizzbuzz"
                i % 3 == 0 -> "fizz"
                i % 5 == 0 -> "buzz"
                else -> i.toString()
            }
        )
    }
}