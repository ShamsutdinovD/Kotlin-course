package kotlin_hm.kotlin_hm.lessons.lesson14

object Moon {
    fun showPhase(isVisible: Boolean, phase: String) {
        println(phase)
    }
}

fun main() {
    Moon.showPhase(true, "Full Moon")
}