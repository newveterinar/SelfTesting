package ru.geekbrains.tests.selftesting_422

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity: AppCompatActivity() {

    /** Задание переменных */ //region
    lateinit var button: Button
    //endregion

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            Toast.makeText(this, "Hello team!", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onBackPressed() {
        Toast.makeText(this, "Close team!", Toast.LENGTH_SHORT).show()
    }
}