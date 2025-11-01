package kotlin_hm.kotlin_hm.lessons.lesson16.Task3

class Inkjet : Printer() {
    override fun print(arg: String) {
        val a1 = arg.split(" ")
        val a2 = listOf(
            "\u001B[31m" to "\u001B[42m",
            "\u001B[33m" to "\u001B[44m",
            "\u001B[35m" to "\u001B[46m"
        )
        for ((textColor, backgroundColor) in a2) {
            for (i in a1) {
                println("$backgroundColor$textColor$i\u001B[0m")
            }
        }
    }
}

fun main() {
    val inkjet = Inkjet()
    inkjet.print("Текст на три")
}