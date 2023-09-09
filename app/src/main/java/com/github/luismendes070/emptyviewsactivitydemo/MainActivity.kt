package com.github.luismendes070.emptyviewsactivitydemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttons = arrayOf(button1, button2, button3, button4, button5, button6, button7, button8, button9)

        buttons.forEachIndexed { index, button ->
            button.setOnClickListener {
                // Handle button click here
                // Example: Toast.makeText(this, "Button $index clicked", Toast.LENGTH_SHORT).show()
            }
        }

    } // end function onCreate
}