package intermediate.nullSafety

// Nama class diubah menjadi LatihanUser untuk menghindari error redeclaration
data class LatihanUser(val username: String, val isActive: Boolean)

fun getActiveUsernames(users: List<LatihanUser>): List<String> {
    return users.mapNotNull {
        // Menggunakan takeIf juga bisa menjadi alternatif: it.username.takeIf { _ -> it.isActive }
        if (it.isActive) it.username else null
    }
}

fun main() {
    val allUsers = listOf(
        LatihanUser("alice123", true),
        LatihanUser("bob_the_builder", false),
        LatihanUser("charlie99", true)
    )

    println(getActiveUsernames(allUsers))
    // [alice123, charlie99]
}