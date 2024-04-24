package com.ST10443396.imadcalculator2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var etNum1 : EditText? = null
    var etNum2 : EditText? = null
    var tvDisp : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNum1 = findViewById(R.id.etNum1)
        etNum2 = findViewById(R.id.etNum2)
        tvDisp = findViewById(R.id.tvDisp)

        val btnAdd = findViewById<Button>(R.id.btnAdd)
        btnAdd.setOnClickListener { add() }

        val btnSub = findViewById<Button>(R.id.btnSub)
        btnSub.setOnClickListener { sub() }

        val btnMul = findViewById<Button>(R.id.btnMul)
        btnMul.setOnClickListener { mul() }

        val btnDiv = findViewById<Button>(R.id.btnDiv)
        btnDiv.setOnClickListener { div() }

        val btnSqr = findViewById<Button>(R.id.btnSqr)
        btnSqr.setOnClickListener { sqr() }

        val btnPow = findViewById<Button>(R.id.btnPow)
        btnPow.setOnClickListener { power() }
        val btnNextScreen = findViewById<Button>(R.id.btnNextScreen)
        btnNextScreen.setOnClickListener(){
            //cal the next screen
            val intent = Intent
        }
    }


    private fun add(){
        val input1 = etNum1?.text?.toString()
        val input2 = etNum2?.text?.toString()

        if (input1.isNullOrEmpty() || input2.isNullOrEmpty()) {
            tvDisp?.text = "Please enter valid numbers"
            return
        }
        val intNum1 = input1.toInt()
        val intNum2 = input2.toInt()
        var intAnswer = 0

        intAnswer = intNum1 + intNum2

        tvDisp?.text = intAnswer.toString()

    }
    private fun sub(){
        val input1 = etNum1?.text?.toString()
        val input2 = etNum2?.text?.toString()

        if (input1.isNullOrEmpty() || input2.isNullOrEmpty()) {
            tvDisp?.text = "Please enter valid numbers"
            return
        }
        val intNum1 = input1.toInt()
        val intNum2 = input2.toInt()
        var intAnswer = 0

        intAnswer = intNum1 - intNum2

        tvDisp?.text = intAnswer.toString()
    }
    private fun mul(){
        val input1 = etNum1?.text?.toString()
        val input2 = etNum2?.text?.toString()

        if (input1.isNullOrEmpty() || input2.isNullOrEmpty()) {
            tvDisp?.text = "Please enter valid numbers"
            return
        }
        val intNum1 = input1.toInt()
        val intNum2 = input2.toInt()
        var intAnswer = 0

        intAnswer = intNum1 * intNum2

        tvDisp?.text = intAnswer.toString()
    }
    private fun div(){
        val input1 = etNum1?.text?.toString()
        val input2 = etNum2?.text?.toString()

        if (input1.isNullOrEmpty() || input2.isNullOrEmpty()) {
            tvDisp?.text = "Please enter valid numbers"
            return
        }
        val intNum1 = input1.toInt()
        val intNum2 = input2.toInt()
        var intAnswer = 0

        intAnswer = intNum1 / intNum2

        tvDisp?.text = intAnswer.toString()
    }
    private fun sqr(){}
    private fun power(){
        var
    }
}