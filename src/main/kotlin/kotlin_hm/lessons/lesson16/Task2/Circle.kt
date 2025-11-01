package kotlin_hm.kotlin_hm.lessons.lesson16.Task2

class Circle(
    val radius: Double
) : Shape() {
    override fun area(): Double {
        val a1 = 3.14 * radius * radius
        return a1
    }
}