package kotlin_hm.kotlin_hm.lessons.lesson08

// 1. Преобразование строк

fun example(arg: String) {

    val result = when {
        arg.contains("Невозможно", true) -> arg.replace(
            oldValue = "Невозможно", ignoreCase = true, newValue = "совершенно точно возможно, просто требует времени"
        )
        arg.startsWith("Я не уверен") -> "$arg но моя интуиция говорит об обратном"
        arg.contains("катастрофа") -> arg.replace(
            oldValue = "катастрофа", newValue = "интересное событие"
        )
        arg.endsWith("без проблем") -> arg.replace(
            oldValue = "без проблем", newValue = "с парой интересных вызовов на пути"
        )
        arg.contains(" ") -> "Иногда, $arg, но не всегда"
        else -> arg
    }
    println(result)
}


fun main() {
    example("Это невозможно выполнить за один день")
    example("Я не уверен в успехе этого проекта")
    example("Произошла катастрофа на сервере")
    example("Этот код работает без проблем")
    example("Удача")

    // 2. Извлечение даты из строки лога

    val log: String = "Пользователь вошел в систему -> 2021-12-01 09:48:23"
    val datelog = log.split(" -> ")
    println(datelog[1])

    // 3. Маскирование личных данных

    val card: String = "4539 1488 0343 6467"
    val cardstart = card.substring(15, 19)
    println("**** **** **** $cardstart")


    // 4. Форматирование адреса электронной почты

    val email: String = "username@example.com"
    val emailresult = email.replace(oldValue = "@", newValue = "[at]")
        .replace(oldValue = ".", newValue = "[dot]")
    println(emailresult)

    // 5. Извлечение имени файла из пути

    val path: String = "C:/Пользователи/Документы/report.txt"
    val pathfile = path.split("/")
    val filename = pathfile.last()
    println(filename)

    // 6. Создание аббревиатуры из фразы

    val phrase: String = "Котлин лучший язык программирования"
    val phraseSplit = phrase.split(" ")
    var counter = ""
    for (word in phraseSplit) {
        val firstLetter = word[0].uppercase()
        counter += firstLetter
    }
    println(counter)

}



