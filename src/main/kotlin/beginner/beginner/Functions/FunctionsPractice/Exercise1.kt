package beginner.Functions.FunctionsPractice

import kotlin.math.PI

fun circleArea(radius: Int): Double {
    return PI * radius * radius
}

fun main() {
    println(circleArea(2)) // Output: 12.566370614359172
}