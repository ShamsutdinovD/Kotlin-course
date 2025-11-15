package kotlin_hm.kotlin_hm.lessons.lesson19

//1.Напиши функцию getMiddleElement с дженериком, которая будет принимать список и возвращать средний элемент,
// если он существует, иначе возвращать null. Например, у списка из четырёх элементов - среднего элемента нет.

fun <A> getMiddleElement(arg1: List<A>): A? {
    if (arg1.size % 2 == 0) {
        return null
    } else {
        val avg = arg1.size / 2
        return arg1[avg]
    }
}

//2.Напиши класс ListHolder, который будет хранить список элементов типа T и иметь метод для добавления нового
// элемента и получения всех элементов в виде неизменяемого списка.

class ListHolder<T>(val arg1: MutableList<T>) {
    fun elementAdd(arg2: T) {
        arg1.add(arg2)
    }
    fun getList() : List<T> {
        return arg1.toList()
    }
}

//3.Создай интерфейс Mapper с двумя дженериками, который будет определять методы для преобразования:
//элементов одного типа в элементы другого типа
//списка элементов одного типа в список элементов другого типа

interface Mapper<A, B> {
    fun transformElement(arg1: A) : B
    fun transformList(arg2: List<A>) : List<B>
}


//4.Создай класс PhrasesToListOfStrings и имплементируй интефрейс Mapper с типами String и List<String>.
//Метод преобразования должен разбивать входящую строку по символу пробела и возвращать список из полученных слов.
//Метод преобразования списков с аналогичной механикой.

class PhrasesToListOfStrings() : Mapper<String, List<String>> {
    override fun transformElement(arg1: String): List<String> {
        return arg1.split(" ")
    }

    override fun transformList(arg2: List<String>): List<List<String>> {
        return  arg2.map { it.split(" ") }
    }
}

//5. Создай функцию transposition с двумя дженериками, которая принимает словарь с дженериками и возвращает словарь,
// в котором ключ и значения поменялись местами.

fun <A, B> transposition(arg1: Map<A, B>) : Map<B, A> {
    return arg1.map { it }.associate { it.value to it.key }
}

//6.Напиши интерфейс Validator с дженериком с функцией валидации, которая будет принимать элемент с типом
// дженерика и возвращать булево значение.

interface Validator<A> {
    fun validate (arg1: A) : Boolean
}

//7.Создай класс StringValidator и имплементируй интерфейс Validator с типом String?.
// Реализуй проверку, что строка не является null, не пустая и не состоит из одних пробелов.

class StringValidator() : Validator<String?> {
    override fun validate(arg1: String?): Boolean {
        return arg1?.isNotBlank() ?: false
    }
}

//8.Создай класс OddValidator и имплементируй интерфейс Validator типизированный по Int.
// Реализуй проверку, что число чётное.

class OddValidator() : Validator<Int> {
    override fun validate(arg1: Int): Boolean {
        return arg1 % 2 == 0
    }
}