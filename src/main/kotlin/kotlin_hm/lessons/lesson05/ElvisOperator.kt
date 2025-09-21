package kotlin_hm.lessons.lesson05

fun main() {
    val startIntensity: Double = 50.0
    val attenuationCoefficient: Double? = 0.4
    val endIntensity = startIntensity * (attenuationCoefficient ?: 0.5)
    println(endIntensity)

    val goods: Double? = null
    val delivery: Double = 1000.0
    val insuranceCoef: Double = 0.005
    val standartPrice: Double = 50.0
    val insurance = insuranceCoef * (goods ?: standartPrice)
    val priceDelivery = delivery + insurance

    val pressure: String? = "736.5"
    val warning: String = "Not information"
    val pressureIndicator = pressure ?: warning
}