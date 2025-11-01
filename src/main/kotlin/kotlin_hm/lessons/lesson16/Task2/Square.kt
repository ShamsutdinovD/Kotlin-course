package kotlin_hm.kotlin_hm.lessons.lesson16.Task2

class Square(
    val side: Double
) : Shape() {
    override fun area(): Double {
        val a1 = side * side
        return a1
    }
}