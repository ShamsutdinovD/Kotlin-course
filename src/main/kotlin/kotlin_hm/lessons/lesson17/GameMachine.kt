package kotlin_hm.kotlin_hm.lessons.lesson17

class GameMachine(
    val color: String,
    val model: String,
    private val pinCode: String
    ) {
    private var isOn: Boolean = false
    private var loadOS: Boolean = false
    private val games: List<String> = mutableListOf("CS2", "dota2", "Fifa")
    val joystick: Boolean = true
    private var balance: Double = 0.0
    private val owner: String = "FIO"
    var phoneSupport: String = "+71111111111"
    private var sessionPaid: Boolean = false
    private val sessionCost: Double = 100.0

    fun turnOn() {
        isOn = true
        println("Игровлй автомат включен")
    }

    fun turnOff() {
        isOn = false
        println("Игровлй автомат выключен")
    }

    fun loadingOSOn() {
        loadOS = true
        println("ОС загружен")
    }

    fun loadingOSOff() {
        loadOS = false
        println("ОС выгружен")
    }

    fun showGames() {
        println(games)
    }

    fun sessionBuy() {
        sessionPaid = true
    }

}



//включить
//выключить
//загрузить ОС
//завершить работу ОС
//показать список игр
//включить игру
//оплатить игровой сеанс
//забрать наличные с помощью пин-кода
//открыть сейф и выдать наличные