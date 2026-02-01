package intermediate.nullSafety

fun validateStock(requested: Int?, available: Int?): Int {
    // 1. Cek null menggunakan Elvis operator.
    // Jika requested null, langsung return -1.
    val req = requested ?: return -1

    // Jika available null, langsung return -1.
    val avail = available ?: return -1

    // 2. Cek apakah permintaan negatif ATAU permintaan melebihi stok yang ada
    if (req < 0 || req > avail) {
        return -1
    }

    // 3. Jika semua validasi lolos, kembalikan jumlah yang diminta
    return req
}

fun main() {
    println(validateStock(5, 10))
    // 5
    println(validateStock(null, 10))
    // -1
    println(validateStock(-2, 10))
    // -1
    println(validateStock(15, 10)) // Test case tambahan: stok tidak cukup
    // -1
}