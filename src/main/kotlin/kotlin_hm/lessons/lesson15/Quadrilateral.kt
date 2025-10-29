package kotlin_hm.kotlin_hm.lessons.lesson15

class Quadrilateral(
    numberOfSides: Int,
    lenghtOfSides: Double
) : Polygon(numberOfSides, lenghtOfSides) {
    fun squareQuadrilateral() {
        val sQuadrilateral = lenghtOfSides * lenghtOfSides
        println("Площадь квадрата = $sQuadrilateral")
    }
}

fun main() {
    val quadrilateral = Quadrilateral(4, 6.0)
    quadrilateral.squareQuadrilateral()
    quadrilateral.perimetr()
}