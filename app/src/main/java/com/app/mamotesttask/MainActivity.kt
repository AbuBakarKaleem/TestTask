package com.app.mamotesttask

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatTextView

class MainActivity : AppCompatActivity() {

    private lateinit var tv_totalAmount:AppCompatTextView

    private var total_amount:Long= 0L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_totalAmount=findViewById(R.id.tv_totalAmount)
    }
    fun onKeypadBtnClick(view: View) {
      /*  val textView: TextView = findViewById(view.id)
        val inputPassCodeDigit = textView.text.toString()
        count++
        setPassCode(inputPassCodeDigit)*/
    }

    fun clearPassCode(view: View?) {
//        count = 0
//        passCodeFirstDigit.setText("")
//        passCodeSecondDigit.setText("")
//        passCodeThirdDigit.setText("")
//        passCodeFourthDigit.setText("")
//        passCodeString = ""
        total_amount=0L
        tv_totalAmount.text=getString(R.string.aed_0_00)
    }
}