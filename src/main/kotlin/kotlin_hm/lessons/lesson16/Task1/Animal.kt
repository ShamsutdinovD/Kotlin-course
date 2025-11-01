package kotlin_hm.kotlin_hm.lessons.lesson16.Task1

abstract class Animal {
    open fun makeSound(color: String) {
        println("${color} This animal makes no sound.\u001B[35m")
    }
}

