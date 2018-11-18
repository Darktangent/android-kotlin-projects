package com.example.c1ph3r9.tipcalculator

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    infoTextView.visibility = View.INVISIBLE
        calculateButton.setOnClickListener {
            //bill
            val bill=billEditText.text.toString().toDouble()
            //tip %
            val tipPercentage=tipPercentageEditText.text.toString().toDouble() /100
            //tip
            val tip= bill*tipPercentage
            //total
            val total=tip+bill

            //make the infotext visibile
            infoTextView.visibility = View.VISIBLE
            infoTextView.text="Tip:${doubleToDollar(tip)}Total: \$${"%.2f".format(total)}"
        }
    }

    fun doubleToDollar(number:Double):String{
        return "$" +String.format("%.2f",number)
    }
}
