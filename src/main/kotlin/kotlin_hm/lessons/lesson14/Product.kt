package kotlin_hm.kotlin_hm.lessons.lesson14

data class Product(val name: String, val price: Double, val quantity: Int)

fun main() {
    val product = Product("Apple", 100.0, 2)
    println(product)
}
