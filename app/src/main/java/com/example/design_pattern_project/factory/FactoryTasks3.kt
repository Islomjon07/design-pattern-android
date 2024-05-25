package com.example.design_pattern_project.factory

/**Pattern Factory
 *это порождающий паттерн проектирования, который определяет общий интерфейс для создания объектов
 * в суперклассе, позволяя подклассам изменять тип создаваемых объектов.
 *
 * Задача: Создание UI компонентов
 *
 * Создайте фабрику для создания различных UI компонентов (например, кнопок, текстовых полей и т.д.)
 * в зависимости от переданных параметров.
 *
 * Условия:
 *
 * - Фабрика должна иметь метод createdCarModel(type: String): CarModel, где type может быть "Mers" или "Bmw", и т.д.
 * - Фабрика должна возвращать соответствующий компонент в зависимости от переданного типа.
 *
 **/

interface CreateCarModelFactory {
    fun createCarModel(type: String): CarModel
}


class CreateCarModelFactoryImpl : CreateCarModelFactory {
    override fun createCarModel(type: String): CarModel {
        return when (type) {
            "Mers" -> MersCar()
            "Bmw" -> BmwCar()
            else -> CarModel.Companion.Default()
        }
    }
}

interface CarModel {
    fun carModelTitle(): String

    companion object {
        class Default : CarModel {
            override fun carModelTitle(): String {
                return "Default Car"
            }
        }
    }
}

class MersCar : CarModel {
    override fun carModelTitle(): String {
        return "Mers Car"
    }
}


class BmwCar : CarModel {
    override fun carModelTitle(): String {
        return "Bmw Car"
    }
}