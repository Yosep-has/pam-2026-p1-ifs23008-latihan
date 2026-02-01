package intermediate.extensionFunctions

fun String.toLowercaseString(): String {
    return this.lowercase()
}

fun main() {
    println("Hello World!".toLowercaseString())
    // hello world!
}