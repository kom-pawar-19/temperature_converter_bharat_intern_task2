package com.example.temperatureconverter

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var editTextCelsius: EditText
    private lateinit var editTextFahrenheit: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextCelsius = findViewById(R.id.editTextCelsius)
        editTextFahrenheit = findViewById(R.id.editTextFahrenheit)
    }

    fun convertTemperature(view: View) {
        val celsiusStr = editTextCelsius.text.toString()
        if (celsiusStr.isNotEmpty()) {
            val celsius = celsiusStr.toDouble()
            val fahrenheit = celsius * 9 / 5 + 32
            editTextFahrenheit.setText(String.format("%.2f", fahrenheit))
        }
    }
}


