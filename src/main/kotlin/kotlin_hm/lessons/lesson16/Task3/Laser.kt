package kotlin_hm.kotlin_hm.lessons.lesson16.Task3

class Laser() : Printer() {
    override fun print(arg: String) {
        val a1 = arg.split(" ")
        a1.forEach { println("\u001B[47m\u001B[30m$it\u001B[0m") }
    }
}

fun main() {
    val laser = Laser()
    laser.print("Делим на части")
}