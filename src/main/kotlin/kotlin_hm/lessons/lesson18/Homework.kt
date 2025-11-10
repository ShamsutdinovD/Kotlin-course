package kotlin_hm.kotlin_hm.lessons.lesson18

import java.io.InputStream

interface Powerable {
    fun powerOn()
    fun powerOff()
}

interface Openable {
    fun open()
    fun close()
}

interface WaterContainer {
    val capacity: Int
    fun fillWater(amount: Int)
    fun getWater(amount: Int)
}

interface TemperatureRegulatable {
    val maxTemperature: Int
    fun setTemperature(temp: Int)
}

interface WaterConnection {
    fun connectToWaterSupply()
    fun getWater(amount: Int)
}

interface AutomaticShutdown {
    val sensorType: String
    val maxSensoredValue: Int
    fun startMonitoring()
}

interface Drainable {
    fun connectToDrain()
    fun drain()
}

interface Timable {
    fun setTimer(time: Int)
}

interface BatteryOperated {
    fun getCapacity(): Double
    fun replaceBattery()
}

interface Mechanical {
    fun performMechanicalAction()
}

interface LightEmitting {
    fun emitLight()
    fun completeLiteEmission()
}

interface SoundEmitting {
    fun setVolume(volume: Int)
    fun mute()
    fun playSound(stream: InputStream)
}

interface Programmable {
    fun programAction(action: String)
    fun execute()
}

interface Movable {
    fun move(direction: String, distance: Int)
}

interface Cleanable {
    fun clean()
}

interface Rechargeable {
    fun getChargeLevel(): Double
    fun recharge()
}

//Задача 1. Создай абстрактные классы устройств, используя эти интерфейсы. Реализовывать методы не нужно.

abstract class Refrigerator : Powerable, Openable, TemperatureRegulatable
abstract class WashingMachine : Powerable, Openable, WaterConnection, Drainable
abstract class SmartLamp : Powerable, AutomaticShutdown, LightEmitting
abstract class ElectronicWatch : Powerable, Timable, Rechargeable
abstract class VacuumCleaner : Powerable, WaterContainer, Programmable, Movable, Cleanable, Rechargeable
abstract class MechanicalWatch : BatteryOperated, Mechanical
abstract class Flashlight : Powerable, BatteryOperated, LightEmitting
abstract class CoffeeMachine : Powerable, WaterContainer, AutomaticShutdown, Programmable, Cleanable
abstract class SmartColumn : Powerable, SoundEmitting, Rechargeable

//Задача 2. Создай абстрактный класс для включаемого оборудования и имплементируй соответствующий интерфейс
// с реализацией методов (достаточно println с выполняемым действием).

abstract class Power : Powerable {
    override fun powerOn() {
        println("Оборудование включено")
    }

    override fun powerOff() {
        println("Оборудование выключено")
    }
}

//Задача 3. Создай абстрактный класс для программируемого оборудования (с имплементацией соответствующего
// интерфейса и реализацией методов) и наследуй его от абстрактного класса включаемого оборудования.

abstract class Programm : Power(), Programmable {
    override fun programAction(action: String) {
        println("Действие программы")
    }

    override fun execute() {
        println("Выполнить программу")
    }
}

//Задача 4. Создай абстрактный класс оборудования с возможностью устанавливать температуру и открываться
// и с наследованием от программируемого оборудования. Также имплементируй интерфейсы.

abstract class Temperature : Programm(), TemperatureRegulatable, Openable {
    override fun setTemperature(temp: Int) {
        println("Установить температуру")
    }

    override fun open() {
        println("Открыто")
    }

    override fun close() {
        println("Закрыто")
    }
}
