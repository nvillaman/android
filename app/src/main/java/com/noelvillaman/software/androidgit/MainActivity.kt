package com.noelvillaman.software.androidgit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        result.setOnClickListener(View.OnClickListener {
            calculator(editTextNumber1.text.toString().toInt(), editTextNumber2.text.toString().toInt())
        })
    }

    private fun calculator(num1 : Int, num2 : Int){
        when (calulation.text.toString()) {
            "+" -> {
                var sum = num1 + num2
                showResult.text = "$sum"
            }
            "-" -> {
                var sub = num1 - num2
                showResult.text = "$sub"
            }
            "x" -> {
                var mult = num1 * num2
                showResult.text = "$mult"
            }
            "/" -> {
                try {
                    var div = num1/num2
                    showResult.text = "$div"
                } catch (e : Exception){

                }
            }
            else -> { // Note the block
                var result = num1 % num2
                if (result < 0) result + num1 else result
                showResult.text = "$result"
            }
        }
    }


}