package kotlin_hm.kotlin_hm.lessons.lesson14

class Party(val location: String, var attendees: Int) {
    fun details() {
        println("Локация - $location, колмчество гостей - $attendees")
    }
}

fun main() {
    val party = Party("Hall", 40)
    party.details()
}