package beginner.Classes

data class Employeee(val name: String, var salary: Int)

fun main() {
    val emp = Employeee("Mary", 20)
    println(emp)
    emp.salary += 10
    println(emp)
}