package com.app.mamotesttask

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
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
    }
}