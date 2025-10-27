package kotlin_hm.kotlin_hm.lessons.lesson14

class Concert(val group: String, val venue: String, val cost: Double, val capacity: Int, private var soldTickets: Int) {
    fun information() {
        println("Группа - $group, место проведения - $venue, стоимость билета - $cost, вместимость зала - $capacity, продано - $soldTickets")
    }
    fun buyTicket(numbersTickets: Int) {
        this.soldTickets += numbersTickets
    }
}

fun main() {
    val concert = Concert("Linkin Park", "London", 100.0, 20000, 10000)
    concert.buyTicket(3000)
    concert.information()
}