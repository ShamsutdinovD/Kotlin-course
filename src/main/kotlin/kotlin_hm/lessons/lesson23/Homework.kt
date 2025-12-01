package kotlin_hm.kotlin_hm.lessons.lesson23


//Создай функцию, которая принимает список чисел и возвращает среднее арифметическое всех чётных чисел этого списка.
// С помощью require проверь, что список не пустой.

fun fun1(arg1: List<Int>): Double {
    var sum = 0
    var counter = 0
    for (i in arg1) {
        if (i % 2 == 0) {
            sum = sum + i
            counter += 1
        } else continue
    }
    return (sum / counter).toDouble()
}

//Создай аналогичную анонимную функцию.

val fun2 = fun(arg1: List<Int>): Double {
    var sum = 0
    var counter = 0
    for (i in arg1) {
        if (i % 2 == 0) {
            sum = sum + i
            counter += 1
        } else continue
    }
    return (sum / counter).toDouble()
}

//Создай аналогичное лямбда выражение с указанием типа.

val fun3: (List<Int>) -> Double = { arg1 ->
    var sum = 0
    var counter = 0
    for (i in arg1) {
        if (i % 2 == 0) {
            sum = sum + i
            counter += 1
        } else continue
    }
    (sum / counter).toDouble()
}

//Создай лямбда выражение без указания типа.
//Проверь, что лямбда выражение работает правильно с помощью нескольких наборов данных (в том числе пустого).

val fun4 = { arg1: List<Int> ->
    var sum = 0
    var counter = 0
    require(arg1.isNotEmpty())
    for (i in arg1) {
        if (i % 2 == 0) {
            sum = sum + i
            counter += 1
        } else continue
    }
    (sum / counter).toDouble()
}

fun main() {
    println(fun4(listOf(3, 4, 5)))
    println(fun4(listOf(1, 2, 3, 4)))
    println(fun4(listOf()))
}


//Создай функцию, которая принимает большое число и возвращает сумму цифр этого числа.
//Сделай проверку, что входящее число больше нуля. Подсказка: для парсинга символа в число можно использовать функцию digitToInt()

fun example02(bigNumber: Long): Int {
    require(bigNumber > 0) { "Число должно быть больше нуля" }
    return "$bigNumber".sumOf { it.digitToInt() }
}

//Создай аналогичную анонимную функцию.
//Создай аналогичное лямбда выражение с указанием типа.
//Создай лямбда выражение без указания типа.
//Проверь, что лямбда выражение работает правильно с помощью нескольких наборов данных.

val e2 = fun(bigNumber: Long): Int {
    require(bigNumber > 0) { "Число должно быть больше нуля" }
    return "$bigNumber".sumOf { it.digitToInt() }
}
val e22: (Long) -> Int = { number ->
    require(number > 0) { "Число должно быть больше нуля" }
    "$number".sumOf { it.digitToInt() }
}
val e222 = { number: Long ->
    require(number > 0) { "Число должно быть больше нуля" }
    "$number".sumOf { it.digitToInt() }
}
