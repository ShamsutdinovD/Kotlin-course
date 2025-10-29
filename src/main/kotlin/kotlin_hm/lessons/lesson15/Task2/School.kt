package kotlin_hm.kotlin_hm.lessons.lesson15.Task2

open class School(
    numberOfYears: Int,
    val points: List<Int>
) : EducationInstitutions(numberOfYears) {
    fun getMedal() {
        val avgPoints = points.average()
        if (avgPoints > 4.8) {
            println("Получил медаль")
        } else {println("нет медали")}
    }
}

fun main() {
    val school = School(11, listOf(5, 5, 4, 5, 5, 5))
    school.getMedal()
}