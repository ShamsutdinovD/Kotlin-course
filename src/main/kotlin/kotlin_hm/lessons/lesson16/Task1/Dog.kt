package kotlin_hm.kotlin_hm.lessons.lesson16.Task1

class Dog() : Animal() {
    override fun makeSound(color: String) {
        println("$color Bark")
    }
}