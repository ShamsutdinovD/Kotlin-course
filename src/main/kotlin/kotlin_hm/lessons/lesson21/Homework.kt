package kotlin_hm.kotlin_hm.lessons.lesson21


//1.Напишите функцию analyzeDataType, принимающую параметр типа Any.
// Функция должна определить тип аргумента и вывести соответствующее сообщение

fun analyzeDataType (arg1: Any) {
    when (arg1) {
        is String -> println("Это строка: $arg1")
        is Number -> println("Это число: $arg1")
        is List<*> -> println("Это список, количество элементов: ${arg1.size}")
        is Map<*, *> -> println("Это словарь, количество пар: ${arg1.size}")
        else -> println("Неизвестный тип данных")
    }
}

//2.Создайте функцию safeCastToList, принимающую параметр типа Any и возвращающую размер списка, если аргумент
// можно безопасно привести к типу List. В случае неудачного приведения функция должна возвращать -1.
// Используйте as? для безопасного приведения типа.

fun safeCastToList (arg: Any) : Int {
    return (arg as? List<*>)?.size ?: -1
}

//3.Создайте функцию getStringLengthOrZero, которая принимает параметр типа Any? и возвращает длину строки,
// если аргумент можно привести к типу String. В случае, если аргумент равен null или не является строкой,
// функция должна возвращать 0.

fun getStringLengthOrZero (arg: Any?) : Int {
    return (arg as? String)?.length ?: 0
}

//4.Создайте функцию-расширение класса Any toSquare. Функция гарантированно вызывается у числа (в виде числа или строки,
// например 4 или 4.2 или “4.2”) и должна вернуть квадрат этого числа. Если придёт число, его нужно возвести в квадрат,
// если придёт строка, то его нужно преобразовать в число через функцию toDouble() и возвести в квадрат.

fun Any.toSquare(): Double {
    val number = (this as? Number)?.toDouble()
        ?: (this as String).toDouble()
    return number * number
}

//5.Напишите функцию sumIntOrDoubleValues, которая принимает список элементов типа Any и возвращает сумму всех
// целочисленных (Int) и вещественных (Double) значений в списке. Все остальные типы должны быть проигнорированы.

fun sumIntOrDoubleValues (arg: List<Any>) : Double {
    return arg.sumOf { (it as? Int)?.toDouble() ?: (it as? Double) ?: 0.0 }
}


fun main() {
    analyzeDataType(listOf("11", "22"))
}