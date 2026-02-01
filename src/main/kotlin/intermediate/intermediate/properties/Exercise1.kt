package intermediate.properties

fun findOutOfStockBooks(inventory: List<Int>): List<Int> {
    return buildList {
        for (i in inventory.indices) {
            // Jika jumlah buku di index 'i' adalah 0, tambahkan index tersebut ke list
            if (inventory[i] == 0) {
                add(i)
            }
        }
    }
}

fun main() {
    val inventory = listOf(3, 0, 7, 0, 5)
    println(findOutOfStockBooks(inventory))
    // [1, 3]
}