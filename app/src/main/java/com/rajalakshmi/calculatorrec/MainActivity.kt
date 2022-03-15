package com.rajalakshmi.calculatorrec

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val add = findViewById<Button>(R.id.btnAdd)
        val sub = findViewById<Button>(R.id.btnSubtract)
        val multiply = findViewById<Button>(R.id.btnMultiply)
        val div = findViewById<Button>(R.id.btnDivide)

        val number1 = findViewById<EditText>(R.id.tvInput1)
        val number2 = findViewById<EditText>(R.id.tvInput2)
        val op = findViewById<EditText>(R.id.tvResult)
        var a: Int = 0
        var b: Int = 0
        var result: Int = 0
        add.setOnClickListener {
            if(number1.text.isNotEmpty()){
                a = number1.text.toString().toInt()
            }
            if(number2.text.isNotEmpty()){
                b = number2.text.toString().toInt()
            }
            result = a+b
            op.setText("$result").toString()
//            Toast.makeText(this, "The result of Addition is $result",Toast.LENGTH_SHORT).show()
        }

        sub.setOnClickListener {
            if(number1.text.isNotEmpty()){
                a = number1.text.toString().toInt()
            }
            if(number2.text.isNotEmpty()){
                b = number2.text.toString().toInt()
            }
            result = a-b
            op.setText("$result").toString()
//            Toast.makeText(this, "The result of Addition is $result",Toast.LENGTH_SHORT).show()
        }

        multiply.setOnClickListener {
            if(number1.text.isNotEmpty()){
                a = number1.text.toString().toInt()
            }
            if(number2.text.isNotEmpty()){
                b = number2.text.toString().toInt()
            }
            result = a*b
            op.setText("$result").toString()
//            Toast.makeText(this, "The result of Addition is $result",Toast.LENGTH_SHORT).show()
        }

        div.setOnClickListener {
            var a: Float = 0f
            var b: Float = 0f
            if(number1.text.isNotEmpty()){
                a = number1.text.toString().toFloat()
            }
            if(number2.text.isNotEmpty()){
                b = number2.text.toString().toFloat()
            }
            val divresult: Float = (a/b)
            op.setText("$divresult").toString()
//            Toast.makeText(this, "The result of Addition is $result",Toast.LENGTH_SHORT).show()
        }
    }
}