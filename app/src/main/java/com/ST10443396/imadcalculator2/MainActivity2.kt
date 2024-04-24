package com.ST10443396.imadcalculator2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.EditText
import android.widget.Button

class MainActivity2 : AppCompatActivity() {

    var etNumber : EditText? = null
    var tvOutput : TextView? = null
    var tvOutput2 : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        etNumber = findViewById(R.id.etNumber)
        tvOutput = findViewById(R.id.tvOutput)
        tvOutput2 = findViewById(R.id.tvOutput2)

        val bthADDTOLIST = findViewById<>()
    }
}