package kotlin_hm.kotlin_hm.lessons.lesson14

class Emotion(val type: String, val intensity: Int) {
    fun express() {
        println("Эмоция - $type, интенсивность - $intensity")
    }
}

fun main() {
    val emotion = Emotion("Грусть", 2)
    emotion.express()
}