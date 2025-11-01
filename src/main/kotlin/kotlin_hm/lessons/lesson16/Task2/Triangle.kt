package kotlin_hm.kotlin_hm.lessons.lesson16.Task2

import kotlin.math.sin

class Triangle(
    val side1: Double,
    val side2: Double,
    val angle: Double
) : Shape() {
    override fun area(): Double {
        val angleRadians = Math.toRadians(angle)
        val a1 = 0.5 * side1 * side2 * sin(angleRadians)
        return a1
    }
}

fun main() {
    val list: List<Shape> = listOf(Circle(5.0), Square(6.0), Triangle(4.0, 5.0, 30.0))
    list.forEach { println(it.area()) }
}