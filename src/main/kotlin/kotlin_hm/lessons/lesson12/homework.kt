package kotlin_hm.kotlin_hm.lessons.lesson12

val collection1 = listOf(-1, 2, -3, 4, -5, 8, 264)
val collection2 = listOf("один", "два", "три")

//1.Проверить, что размер коллекции больше 5 элементов.
val a1 = collection1.size > 5

//2.Проверить, что коллекция пустая
val a2 = collection1.isEmpty()

//3.Проверить, что коллекция не пустая
val a3 = collection1.isNotEmpty()

//4.Взять элемент по индексу или создать значение если индекса не существует
val a4 = collection1.getOrElse(1) { 10 }

//5.Собрать коллекцию в строку
val a5 = collection1.joinToString()

//6.Посчитать сумму всех значений
val a6 = collection1.sum()

//7.Посчитать среднее
val a7 = collection1.average()

//8.Взять максимальное число
val a8 = collection1.max()

//9.Взять минимальное число
val a9 = collection1.min()

//10.Взять первое число или null
val a10 = collection1.firstOrNull()

//11.Проверить что коллекция содержит элемент
val a11 = collection1.contains(5)


//12.Отфильтровать коллекцию по диапазону 18-30
val a12 = collection1.filter { it in 18..30 }

//13.Выбрать числа, которые не делятся на 2 и 3 одновременно
val a13 = collection1.filterNot { it % 2 == 0 && it % 3 == 0 }

//14.Очистить текстовую коллекцию от null элементов
val a14 = collection2.filterNotNull()

//15.Преобразовать текстовую коллекцию в коллекцию длин слов
val a15 = collection2.map { it.length }

//16.Преобразовать текстовую коллекцию в мапу, где ключи - перевёрнутые слова, а значения - длина слов
val a16 = collection2.associate { it.reversed() to it.length }

//17.Отсортировать список в алфавитном порядке
val a17 = collection2.sorted()

//18.Взять первые 3 элемента списка
val a18 = collection2.take(3)

//19.Распечатать квадраты элементов списка
val a19 = collection1.forEach {
    println(it * it)
}

//20.Группировать список по первой букве слов
val a20 = collection2.groupBy { it.first() }

//21.Очистить список от дублей
val a21 = collection2.distinct()

//22.Отсортировать список по убыванию
val a22 = collection1.sortedDescending()

//23.Взять последние 3 элемента списка
val a23 = collection1.takeLast(3)