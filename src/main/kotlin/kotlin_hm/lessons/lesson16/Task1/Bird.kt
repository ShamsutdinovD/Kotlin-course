package kotlin_hm.kotlin_hm.lessons.lesson16.Task1

class Bird : Animal() {
    override fun makeSound(color: String) {
        println("$color Tweet")
    }
}

fun main() {
    val bird = Bird()
    bird.makeSound("\u001B[35m")
    val dog = Dog()
    dog.makeSound("\u001B[33m")
    val cat = Cat()
    cat.makeSound("\u001B[32m")

    val a1: List<Animal> = listOf(Dog(), Cat(), Bird())
    a1.forEach { it.makeSound("\u001B[35m") }

}