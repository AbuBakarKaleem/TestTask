package com.app.mamotesttask

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatTextView

class MainActivity : AppCompatActivity() {

    private lateinit var tv_totalAmount: AppCompatTextView
    private var preFinalAmount = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_totalAmount = findViewById(R.id.tv_totalAmount)
        setFinalAmountToUI("0.00")
    }

    fun onKeypadBtnClick(view: View) {
        val textView: TextView = findViewById(view.id)
        setPreFinalAmount(textView.text.toString())

    }

    fun clearPassCode(view: View?) {
        tv_totalAmount.text = getString(R.string.currency)+" "+ getString(R.string.zero_amount)
        preFinalAmount = ""
    }

    fun onPointBtnPressed(view: View) {
        if (preFinalAmount.isEmpty().not()) {
            if (preFinalAmount.contains(".").not()) {
                setPreFinalAmount(".")
            }
        }
    }

    private fun setPreFinalAmount(amount: String) {
        preFinalAmount += amount
        setFinalAmountToUI(preFinalAmount)
    }
    private fun setFinalAmountToUI(value: String) {
        tv_totalAmount.text = getString(R.string.currency) + " " + value
    }
}