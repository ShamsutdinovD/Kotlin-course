package kotlin_hm.kotlin_hm.lessons.lesson15

open class Polygon(
    val numberOfSides: Int,
    val lenghtOfSides: Double
) : Figure() {
    fun perimetr() {
        val a1 = numberOfSides * lenghtOfSides
        println("Периметр = $a1")
    }
}

fun main() {
    val polygon = Polygon(4, 5.0)
    polygon.perimetr()
}