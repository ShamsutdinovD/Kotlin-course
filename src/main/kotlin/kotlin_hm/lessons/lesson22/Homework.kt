package kotlin_hm.kotlin_hm.lessons.lesson22

class Homework {
}

//Воспроизвести фрагменты кода, которые могут привести к возникновению исключений и обернуть их в блок try-catch

fun main() {

    try {
        null!!
    } catch (e: NullPointerException) {
        println("It is NullPointerException! \uD83C\uDF89")
    }

    try {
        listOf("")[1]
    } catch (e: IndexOutOfBoundsException) {
        println("It is IndexOutOfBoundsException! \uD83C\uDF89")
    }

    try {
        "" as Int
    } catch (e: ClassCastException) {
        println("It is ClassCastException! \uD83C\uDF89")
    }

    try {
        require(false)
    } catch (e: IllegalArgumentException) {
        println("It is IllegalArgumentException! \uD83C\uDF89")
    }

    try {
        "".toInt()
    } catch (e: NumberFormatException) {
        println("It is NumberFormatException! \uD83C\uDF89")
    }

    try {
        check(false)
    } catch (e: IllegalStateException) {
        println("It is IllegalStateException! \uD83C\uDF89")
    }

    try {
        (0..Long.MAX_VALUE).map { Long.MAX_VALUE }
    } catch (e: OutOfMemoryError) {
        println("It is OutOfMemoryError! \uD83C\uDF89")
    }

    try {
        a()
    } catch (e: StackOverflowError) {
        println("It is StackOverflowError! \uD83C\uDF89")
    }
}

fun a() {
    a()
}

fun catchable(arg: Any?) {
    try {
        arg!!
        arg as List<*>
        arg[2]
        require(arg[2] is String)
        check((arg[2] as String).toInt() == 3)
    } catch (e: Throwable) {
        val result = when (e) {
            is NullPointerException -> "It is NullPointerException"
            is ClassCastException -> "It is ClassCastException"
            is IndexOutOfBoundsException -> "It is IndexOutOfBoundsException"
            is NumberFormatException -> "It is NumberFormatException"
            is IllegalArgumentException -> "It is IllegalArgumentException"
            is IllegalStateException -> "It is IllegalStateException"
            else -> "It is unknown exception"
        }
        println(result)
        throw e
    }
    println("We have a fantastically good argument!")
}

