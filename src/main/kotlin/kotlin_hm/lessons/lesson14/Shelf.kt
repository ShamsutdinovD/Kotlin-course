package kotlin_hm.kotlin_hm.lessons.lesson14

class Shelf(
    val capacity: Int,
    var items: MutableList<String>
)
{
    fun addItem(itemName: String){
        val sumItem = items.sumOf { it.length }
        if (capacity >= (itemName.length + sumItem)) {
            items.add(itemName)
            println(true)
        } else {
            println(false)
        }
    }

    fun removeItem(itemName: String) {
        if (items.contains(itemName)) {
            items.remove(itemName)
            println(true)
        } else {
            println(false)
        }
    }

    fun getItems() {
        println(items)
    }
}

fun main() {
    val shelf = Shelf(30, mutableListOf("молоток", "нож", "плоскогубцы"))
    shelf.addItem("ножовка")
    shelf.removeItem("Нож")
    shelf.getItems()
}