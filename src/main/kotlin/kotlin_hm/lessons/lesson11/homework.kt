package kotlin_hm.kotlin_hm.lessons.lesson11

//1.Не принимает аргументов и не возвращает значения.
fun a1(){}

//2.Принимает два целых числа и возвращает их сумму.
fun a2(a: Int, b: Int): Int {
    return a + b
}

//3.Принимает строку и ничего не возвращает.
fun a3(a: String) {}

//4.Принимает список целых чисел и возвращает среднее значение типа Double.
fun a4(a: List<Int>): Double {
    var sum = 0
    for (i in a) {
        sum += i
    }
    return sum.toDouble() / a.size
}

//5.Принимает nullable строку и возвращает её длину в виде nullable целого числа и доступна только в текущем файле.
private fun a5(a: String?): Int? {
        return a?.length
}

//6.Не принимает аргументов и возвращает nullable вещественное число.
fun a6(): Int? {
    return 1
}

//7.Принимает nullable список целых чисел, не возвращает значения и доступна только в текущем файле.
private fun a7(a: List<Int?>) {

}

//8. Принимает целое число и возвращает nullable строку.
fun a8(a: Int): String? {
    return if (a == 0) {
        "Число"
    } else {
        null
    }
}

//9.Не принимает аргументов и возвращает список nullable строк.
fun a9(): String? {
    return null
}

//10.Принимает nullable строку и nullable целое число и возвращает nullable булево значение.
fun a10(a: String?, b: Int?): Boolean? {
    return true
}


//11.Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.
fun multiplyByTwo(a: Int): Int {
    return a * 2
}

//12.Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное, и false в противном случае.
fun isEven(a: Int): Boolean {
    return a % 2 == 0
}

//13.Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n.
// Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.
fun printNumbersUntil(n: Int) {
    if (n > 1) {
        for (i in 1..n) {
            print(i)
        }
    }
    return
}


//14.Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное число в списке.
// Если отрицательных чисел нет, функция должна вернуть null.
fun findFirstNegative(a: List<Int>): Int? {
    for (i in a) {
        if (i < 0) {
            return i
        }
    }
    return null
}

//15.Напишите функцию processList, которая принимает список строк. Функция должна проходить по списку и выводить каждую строку.
// Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата значения.
fun processList(a: List<String?>): String {
    var q = ""
    for (i in a) {
        if (i == null) {
            return ""
        }
        q += "$i "
    }
    return q
}

fun main() {
    println(multiplyByTwo(3))
    println(isEven(7))
    printNumbersUntil(7)
    println()
    println(findFirstNegative(listOf(1, 3, 0, -5, 4)))
    println(processList(listOf("Домашка", "по", "Котлину")))

}