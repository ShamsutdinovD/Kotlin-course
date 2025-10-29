package kotlin_hm.kotlin_hm.lessons.lesson15

import kotlin.math.sqrt

class Triangle(
    numberOfSides: Int,
    lenghtOfSides: Double
) : Polygon(numberOfSides, lenghtOfSides) {
    fun squareTriangle() {
        val sTriangle = sqrt(3.0) * lenghtOfSides * lenghtOfSides / 4
        println("Площадь треугольника = $sTriangle")
    }
}

fun main() {
    val triangle = Triangle(3, 3.0)
    triangle.perimetr()
    triangle.squareTriangle()
}