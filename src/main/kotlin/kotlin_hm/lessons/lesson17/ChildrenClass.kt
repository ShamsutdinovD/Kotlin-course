package kotlin_hm.kotlin_hm.lessons.lesson17

class ChildrenClass(
    val privateVal: String,
    protectedVal: String,
    // 10. объясни, почему этот аргумент доступен в main() несмотря на то, что это не поле
    publicVal: String
) : BaseClass(privateVal, protectedVal, publicVal) {
    // 11. объясни, почему в main() доступна функция getAll() хотя её здесь нет
    // 12. проверь, что выводится на печать при вызове функции printText()
    // и объясни, почему не происходит переопределение метода privatePrint()
    private fun privatePrint() {
        println("Печать из класса ChildrenClass")
    }
    override fun generate(): String {
        return "Это генерация из дочернего класса"
    }

    fun printProtect() {
        println(protectedField)
    }

    override fun verifyPublicField(value: String): Boolean {
        return value.length < 51
    }

    fun setProtectedFieldValue(v: String) {
        protectedField = v
    }
}

fun main() {
    val a = ChildrenClass("private", "protected", "public")
    a.publicField = "Антонио Бандерас"
    println(a.publicField)
    a.setProtectedFieldValue("замена protectedField")
    println(a.getAll())
    a.printText()
}