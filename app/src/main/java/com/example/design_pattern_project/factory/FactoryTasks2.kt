package com.example.design_pattern_project.factory

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * Factory:
 *
 * Это порождающий паттерн проектирования, который определяет общий интерфейс для создания объектов
 * в суперклассе, позволяя подклассам изменять тип создаваемых объектов.
 *
 * Задача: Создание UI компонентов
 *
 * Создайте фабрику для создания различных UI компонентов (например, кнопок, текстовых полей и т.д.)
 * в зависимости от переданных параметров.
 *
 * Условия:
 *
 * - Фабрика должна иметь метод createComponent(type: String), где type может быть "Button", "TextView" и т.д.
 * - Фабрика должна возвращать соответствующий компонент в зависимости от переданного типа.
 * - Каждый созданный компонент должен быть настроен с базовыми параметрами (например, текст, размер, цвет).
 *
 * **/


interface CreateUiComponentsFactory {
    @Composable
    fun CreateComponent(type: String)
}

class CreateUiComponentsFactoryImpl : CreateUiComponentsFactory {
    @Composable
    override fun CreateComponent(type: String) {
        return when (type) {
            "Button" -> CustomButton("Button")
            "TextView" -> CustomTextView("TextView")

            else -> CustomTextView("")
        }
    }
}

@Composable
fun CustomButton(text: String) {
    Button(
        onClick = {  },
        colors = ButtonDefaults.buttonColors(Color.Blue),
        modifier = Modifier.padding(8.dp)
    ) {
        Text(text = text, color = Color.White, fontSize = 16.sp)
    }
}

@Composable
fun CustomTextView(text: String) {
    Text(
        text = text,
        fontSize = 16.sp,
        color = Color.Black,
        modifier = Modifier.padding(8.dp)
    )
}