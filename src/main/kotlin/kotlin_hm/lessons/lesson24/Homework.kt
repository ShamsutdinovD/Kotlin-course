package kotlin_hm.kotlin_hm.lessons.lesson24


//1.Создай функцию, которая:
//-принимает булево значение
//-принимает функцию, принимающую строку и ничего не возвращающую
//-возвращает целое число

fun ex1 (arg1: Boolean, fn: (String) -> Unit): Int {
    return 1
}

//2.Создай функцию расширения целого числа, которая:
//-принимает функцию расширения целого числа, принимающую строку и возвращающую список строк
//-возвращает список строк

fun Int.ex2 (fn: Int.(String) -> List<String>): List<String> {
    return listOf()
}

//3.Создай функцию с двумя дженериками расширяющую первый дженерик, которая:
//-принимает функцию расширяющую первый дженерик, ничего не принимает и возвращает второй дженерик
//-возвращает второй дженерик

fun <A, B> A.ex3 (fn: A.() -> B): B {
    return fn()
}

//4.Создай функцию, которая:
//-принимает строку
//-возвращает функцию, которая ничего не принимает и возвращает строку

fun ex4 (arg1: String): () -> String {
    val fn: () -> String = {arg1}
    return fn
}

//5.Создай функцию расширяющую дженерик, которая:
//-ничего не принимает
//-возвращает функцию, принимающую строку и возвращающую дженерик

fun <A> A.ex5 (): (String) -> A {
    val fn: (String) -> A = { this }
    return fn
}

//6.Напиши функцию colorizeWords которая печатает слова из длинного предложения разбитого по пробелу разным цветом.

object Colors {
    const val RESET = "\u001B[0m"
    const val RED = "\u001B[31m"
    const val GREEN = "\u001B[32m"
    const val YELLOW = "\u001B[33m"
    const val BLUE = "\u001B[34m"
    const val PURPLE = "\u001B[35m"
    const val CYAN = "\u001B[36m"
    const val WHITE = "\u001B[37m"
}

fun String.colorize(color: String): String {
    return "$color$this${Colors.RESET}"
}

fun String.colorizeWords(fnc: (String) -> String) {
    val result = split(" ").joinToString(" ") {
        it.colorize(fnc(it))
    }
    println(result)
}

fun main() {
    val colors = listOf(Colors.RED, Colors.BLUE, Colors.GREEN, Colors.PURPLE, Colors.YELLOW, Colors.CYAN)

    val text = "Напиши функцию colorizeWords которая печатает слова из длинного предложения разбитого по пробелу разным цветом. Правило подбора цвета для каждого слова нужно передавать в виде функции, которая принимает слово и возвращает это же слово но уже \"в цвете\" через функцию colorize."

    val ex1 = { word: String ->
        when {
            word[0].uppercase()[0] == word[0] -> Colors.YELLOW
            word.length < 3 -> Colors.BLUE
            word.length > 6 -> Colors.GREEN
            word.length % 2 == 0 -> Colors.RED
            else -> Colors.PURPLE
        }
    }

    var counter = 0

    val ex2 = { _: String ->
        if (counter >= colors.size) counter = 0
        colors[counter++]
    }

    var counterFunction = { counter++ }

    val ex3 = { _: String ->
        if (counter == colors.size - 1) {
            counterFunction = { counter-- }
        }
        if (counter < 0) {
            counter++
            counterFunction = { counter++ }
        }
        colors[counterFunction()]
    }

    text.colorizeWords(ex1)

    text.colorizeWords(ex2)

    counter = 0

    text.colorizeWords(ex3)
}