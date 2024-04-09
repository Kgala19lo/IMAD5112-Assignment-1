@file:Suppress("IMPLICIT_CAST_TO_ANY")

package com.example.assignment1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

@Suppress("IMPLICIT_CAST_TO_ANY", "IMPLICIT_CAST_TO_ANY")
class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Declaring views
        val ageNumber = findViewById<EditText>(R.id.ageNumber)
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val btnCancel = findViewById<Button>(R.id.btnCancel)
        val txtResults = findViewById<TextView>(R.id.txtResult)
        btnGenerate.setOnClickListener {
            val age = ageNumber.text.toString().toIntOrNull()
            if (age != null) {
                val result = when (age) {
                    in 20..28 -> "Tupac"
                    in 28..36 -> "Bruce Lee"
                    in 36..44 -> "Paul Walker"
                    in 45..52 -> "Michael Jackson"
                    in 52..59 -> "Jamie Barlett"
                    in 60..68 -> "Diego Maradona"
                    in 69..76 -> "Muhammad Ali"
                    in 76..84 -> "Pele"
                    in 85..92 -> "Nikola Tesla"
                    in 93..100 -> "Nelson Mandela"
                    else -> {}
                }
                txtResults.text = "Age: $age\n${
                    when (result){
                        "Tupac" -> "Tupac died at the age of 25"
                        "Bruce Lee" -> "Bruce Lee died at the age of 32"
                        "Paul Walker" -> "Paul Walker died at the age of 40"
                        "Michael Jackson" -> "Michael Jackson died at the age of 50"
                        "Jamie Barlett" -> "Jamie Barlett died at the age of 55"
                        "Diego Maradona" -> "Diego Maradona died at the age of 60"
                        "Muhammad Ali" -> "Muhammad Ali died at the age of 74"
                        "Pele" -> "Pele died at the age of 82"
                        "Nikola Tesla" -> "Nikola Tesla died at the age of 86"
                        "Nelson Mandela" -> "Nelson Mandela died at the age of 95"
                        else -> {}
                    }
                }"
            } else {
                txtResults.text = "Please enter a valid age."
            }
        }

        btnCancel.setOnClickListener {
            ageNumber.text.clear()
            txtResults.text = ""
        }


    }
}

