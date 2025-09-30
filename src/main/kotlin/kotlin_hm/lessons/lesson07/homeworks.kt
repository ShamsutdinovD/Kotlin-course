package kotlin_hm.kotlin_hm.lessons.lesson07

fun main() {

    // 1. Напишите цикл for, который выводит числа от 1 до 5.

    for (i in 1..5) {
        println(i)
    }
    println()

    // 2. Напишите цикл for, который выводит четные числа от 1 до 10.

    for (i in 1..10) {
        if (i % 2 == 0)
            println(i)
    }
    println()

    // 3. Создайте цикл for, который выводит числа от 5 до 1.

    for (i in 5 downTo 1) {
        println(i)
    }
    println()

    // 4. Создайте цикл for, который выводит числа от 10 до 1, уменьшая их на 2.

    for (i in 10 downTo 1 step 2) {
        println(i)
    }
    println()

    // 5. Используйте цикл for с шагом 2 для вывода чисел от 1 до 9.

    for (i in 1..9 step 2) {
        println(i)
    }
    println()

    // 6. Напишите цикл for, который выводит каждое третье число в диапазоне от 1 до 20.

    for (i in 1..20 step 3) {
        println(i)
    }
    println()

    // 7. Создайте числовую переменную 'size'. Используйте цикл for с шагом 2 для вывода чисел от 3 до size не включая size.

    val size: Int = 20
    for (i in 3 until size step 2) {
        println(i)
    }
    println()

    // 8. Создайте цикл while, который выводит квадраты чисел от 1 до 5.

    var i: Int = 0
    while (++i in 1..5) {
        println(i * i)
    }
    println()

    // 9. Напишите цикл while, который уменьшает число от 10 до 5. После этого вывести результат в консоль

    var counter: Int = 11
    while (--counter in 10 downTo 5) {
        println(counter)
    }
    println()

    // 10. Используйте цикл do while, чтобы вывести числа от 5 до 1

    var f: Int = 5
    do {
        println(f)
    } while (--f in 5 downTo 1)
    println()

    // 11. Создайте цикл do while, который повторяется, пока счетчик меньше 10, начиная с 5

    var g: Int = 5
    do {
        println(g)
    } while (++g < 10)
    println()

    // 12. Напишите цикл for от 1 до 10 и используйте break, чтобы выйти из цикла при достижении 6.

    for (i in 1..10) {
        if (i == 6) break
        println(i)
    }
    println()

    // 13. Создайте цикл while, который бесконечно выводит числа, начиная с 1, но прерывается при достижении 10.

    var q: Int = 0
    while (true) {
        if (q++ == 10) break
        println(q)
    }
    println()

    // 14. В цикле for от 1 до 10 используйте continue, чтобы пропустить четные числа

    for (i in 1..10) {
        if (i % 2 == 0) continue
        println(i)
    }
    println()

    // 15. Напишите цикл while, который выводит числа от 1 до 10, но пропускает числа, кратные 3.

    var z: Int = 0
    while (++z <= 10) {
        if (z % 3 == 0) continue
        println(z)
    }
    println()

    // 16 Используя вложенный цикл реализовать таблицу умножения, как на картинке.

    for (s1 in 1..10) {
        for (s2 in 1..10) {
            print(s1 * s2)
            print(" ")
        }
        println()
    }



}