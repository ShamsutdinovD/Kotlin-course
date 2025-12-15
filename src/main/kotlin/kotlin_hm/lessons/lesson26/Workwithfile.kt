package kotlin_hm.kotlin_hm.lessons.lesson26

import java.io.File

class Workwithfile {
}


//Создайте текстовый файл workspace/task1/example.txt. Запишите в него строку "Hello, Kotlin!", а затем проверьте,
// существует ли файл. Реши задачу с использованием scope функции без создания переменной.

fun ex1() {
    File("workspace/task1/example.txt").apply {
        parentFile?.mkdirs()
        createNewFile()
        writeText("Hello, Kotlin!")
        if (exists()) {
            println("Файл существует")
        } else {
            println("Файл не найден")
        }
    }
}

//Создайте директорию workspace/task2/testDir. Проверьте, является ли она директорией, и выведите её абсолютный путь.

fun ex2() {
    File("workspace/task2/testDir").apply {
        mkdirs()
        if (isDirectory) {
            println("Это директория")
        } else {
            println("Это не директория")
        }
        println(absolutePath)
    }
}

//Создайте директорию workspace/task3/structure. Внутри директории structure создайте папку myDir с двумя вложенными
// поддиректориями subDir1 и subDir2. Проверьте, что myDir действительно содержит эти поддиректории. Используй scope
// функции для минимизации создания переменных а так же метод file.resolve("myDir") для создания нового объекта File
// путём добавления к существующему пути ещё одной секции. И так же для других директорий.

fun ex3() {
    with(File("workspace/task3/structure")) {
        mkdirs()
        resolve("myDir")
    }.apply {
        mkdir()
        resolve("subDir1").mkdir()
        resolve("subDir2").mkdir()
        val files = list()
        if (files?.all { it.contains("subDir1") || it.contains("subDir2") } ?: false) {
            println("Директории найдены")
        } else {
            println("Директории не найдены в ${list().joinToString()}")
        }
    }
}

//Создайте директорию workspace/task4/temp. Внутри директории temp создайте несколько вложенных файлов и директорий.
// Удалите директорию workspace/task4 со всем содержимым

fun ex4() {
    File("workspace/task4/temp").apply {
        mkdirs()
        mapOf(
            "dir1" to true,
            "file1" to false,
            "dir2" to true,
            "dir3" to true,
            "file2" to false,
            "file3" to false
        ).forEach { (name, isDirectory) ->
            resolve(name).also {
                if (isDirectory) {
                    it.mkdir()
                } else {
                    it.createNewFile()
                }
            }
        }
        check(list() != null && list()!!.size == 6) { "Список файлов и директорий не полный ${list()?.joinToString()}" }
        parentFile.deleteRecursively()
    }
    check(!File("workspace/task4").exists())
}

//Создайте файл workspace/task5/config/config.txt. запишите в него список параметров (в формате ключ=значение),
// а затем прочитайте файл и выведите только значения.

fun ex5() {
    with(File("workspace/task5/config/config.txt")) {
        parentFile.mkdirs()
        createNewFile()
        listOf("param 1 = true", "param 2 = false").also {
            writeText(it.joinToString("\n"))
        }
        readLines().map {
            it.split("=")
                .getOrNull(1)
                ?.trim() ?: ""
        }.also {
            println(it.joinToString())
        }
    }
}

//Пройди по всем вложенным директориям workspace и выведи в консоль сначала пути директорий, а потом пути файлов

fun ex6() {
    File("workspace").apply {
        walk().groupBy { if (it.isDirectory) "dir" else "file" }
            .also {
                println("Directories")
                println(it["dir"]?.joinToString("\n"))
                println("Files")
                println(it["file"]?.joinToString("\n"))
            }
    }
}