package com.noelvillaman.software.androidgit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun calculator(num1 : Int, num2 : Int){
        if (calulation.text.toString().equals("+")){
            var sum = num1 + num2
            showResult.text = "$sum"
        }
        else if (calulation.text.toString().equals("x")){
            var mult = num1 * num2
            showResult.text = "$mult"
        }
        else if (calulation.text.toString().equals("-")){
            var sub = num1 - num2
            showResult.text = "$sub"
        }
        else if (calulation.text.toString().equals("%")){
            try {
                var div = num1/num2
                showResult.text = "$div"
            } catch (e : Exception){

            }

        }
        else {
            var result = num1 % num2
            if (result < 0) result + num1 else result
            showResult.text = "$result"
        }

    }


}