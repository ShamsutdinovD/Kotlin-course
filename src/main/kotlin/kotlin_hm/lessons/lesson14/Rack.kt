package kotlin_hm.kotlin_hm.lessons.lesson14

class Rack(
    val shelves: MutableList<String>,
    val numberOfShelf: Int
) {
    fun addShelf(shelfName: String) {
        if (shelves.contains(shelfName)) {
            println("Полка уже добавлена")
        } else if (numberOfShelf > shelves.size) {
            shelves.add(shelfName)
            println(true)
        } else {
            println(false)
        }
    }

    fun removeShelf(indexShelf: Int) {
        if (shelves.size >= indexShelf) {
            shelves.removeAt(indexShelf)
            println(shelves)
        } else {
            println(listOf<String>())
        }
    }
}

fun main() {
    val rack = Rack(mutableListOf("полка1", "полка2", "полка3"), 5)
    rack.addShelf("полка4")
    rack.removeShelf(1)
}