package kotlin_hm.kotlin_hm.lessons.lesson15

class Circle (
    val radius: Int
) : Figure() {
    fun squarePerimetr() {
        val s1 = 3.14 * radius * radius
        val p1 = 2 * 3.14 * radius
        println("Площадь круга = $s1, периметр круга = $p1")
    }
}

fun main() {
    val circle = Circle(5)
    circle.squarePerimetr()
}