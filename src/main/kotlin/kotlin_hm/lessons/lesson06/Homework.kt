package kotlin_hm.lessons.lesson06

// 1: "Определение сезона"

fun season(arg: Int) {
    when (arg) {
        in 1..2 -> println("Зима")
        in 3..5 -> println("Весна")
        in 6..8 -> println("Лето")
        in 9..11 -> println("Осень")
        in 12..12 -> println("Зима")
        else -> println("Неверные данные")
    }
}


// Задание 2: "Расчет возраста питомца"

fun dogAge(arg: Int) {
    if (arg in 1..2) {
      println(arg * 10.5)
    }
    else if (arg > 2) {
        println(arg * 4)
    }
    else {
        println("Некорректные данные")
    }
}


//Задание 3: "Определение способа перемещения"

fun transportation(arg: Int) {
    when (arg) {
        in 1..1 -> println("пешком")
        in 2..5 -> println("велосипед")
        else -> println("автотранспорт")
    }
}


// Задание 4: "Расчет бонусных баллов"

fun bonusPoints(arg: Int) {
    if (arg in 1..1000) {
        println(arg/100 * 2)
    }
    else if (arg > 1000) {
        println(arg/100 * 3)
    }
    else {
        println("некорректные данные")
    }
}


//Задание 5: "Определение типа документа"

fun documents(arg: String) {
    if (arg in "txt") {
        println("Текстовый документ")
    }
    else if (arg in "jpg") {
        println("Изображение")
    }
    else if (arg in "xls") {
        println("Таблица")
    }
    else {
        println("Неизвестный тип")
    }
}


//Задание 6: "Конвертация температуры"

fun temperature(arg1: Double, arg2: Char) {
    if (arg2 == 'C') {
        print(arg1 * 9/5 + 32)
        println('F')
    }
    else if (arg2 == 'F') {
        print((arg1 - 32)*5/9)
        println('C')
    } else {
        println("Неверные данные")
    }
}


//Задание 7: "Подбор одежды по погоде"

fun clothes(arg: Int) {
    when (arg) {
        in -30..9 -> println("Куртка и шапка")
        in 10..18 -> println("Ветровка")
        in 19..35 -> println("Футболка и шорты")
        else -> println("Не выходить из дома")
    }
}


//Задание 8: "Выбор фильма по возрасту"

fun films(arg: Int) {
    when (arg) {
        in 0..9 -> println("Детские")
        in 10..18 -> println("Подростковые")
        else -> println("Остальные")
    }
}


fun main() {
    season(10)
    dogAge(3)
    transportation(3)
    bonusPoints(800)
    documents("txt")
    temperature(68.0,'F')
    clothes(15)
    films(12)
}