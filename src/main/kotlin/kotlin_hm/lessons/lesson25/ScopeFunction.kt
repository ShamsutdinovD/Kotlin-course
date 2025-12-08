package kotlin_hm.kotlin_hm.lessons.lesson25


class Person(val name: String, val age: Int) {
    var email: String = ""
}

class Employee(val name: String, val age: Int, val position: String) {
    var email: String = ""
    var department: String = "General"
}

//Задание 2: Использование apply для инициализации объекта Employee
//Создайте объект Employee и используйте apply для инициализации его полей email и department.

fun main() {
    val em = Employee("Qwe", 28, "QA")
    em.apply {
        email = "qwerty@mail.ru"
        department = "Digital"
    }
}

//Задание 3: Использование also для логирования
//Создайте функцию, принимающую объект Person и выводящую информацию об объекте в консоль в красивом, отформатированном виде.
// Используй with для создания контекста Person и возможности использовать поля объекта напрямую без обращения к переменной.
//Создайте объект Person и используйте also для добавления почты и печати данных в консоль с помощью метода который
// только что создали.

fun printPerson(person: Person) {
    with(person) {
        println("""
           Name: $name
           Age: $age
           Email: $email
       """.trimIndent())
    }
}

fun main2() {
    val person = Person("Anna", 26).also {
        it.email = "anna@gm.com"
        printPerson(it)
    }
}

//Задание 4: Использование with для преобразование Person в Employee
//Создайте объект класса Person. Используйте функцию with, чтобы создать из этого объекта Employee,
// указав дополнительно должность. Возвращаемым значением должен быть новый объект Employee.

fun main3() {
    val person = Person("Andrew", 32).apply {
        email = "andrew@gm.com"
    }

    val employee = with(person) {
        Employee(name, age, "Front dev").also {
            it.email = email
            it.department = "dep2"
        }
    }
}

//Задание 5: Использование run для преобразования и инициализации Employee
//Перепиши предыдущую задачу на использование run вместо with.

fun main4() {
    val person = Person("Andrew", 32).apply {
        email = "andrew@gm.com"
    }

    val employee = person.run {
        Employee(name, age, "Front dev").also {
            it.email = email
            it.department = "dep2"
        }
    }
}

//Задание 6: Использование let для безопасного преобразования Person в Employee
//Создайте функцию toEmployee, которая расширяет класс Person, который может быть null. В функции используйте
// функцию let для создания Employee, только если объект Person не null. В противном случае возвращается null

fun Person?.toEmployee(position: String, depart: String): Employee? {
    return this?.let {
        Employee(it.name, it.age, position).apply {
            email = it.email
            department = depart
        }
    }
}