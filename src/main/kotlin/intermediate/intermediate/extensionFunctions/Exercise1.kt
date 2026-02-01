package intermediate.extensionFunctions

fun Int.isPositive(): Boolean {
    return this > 0
}

fun main() {
    println(1.isPositive())
    // true
}