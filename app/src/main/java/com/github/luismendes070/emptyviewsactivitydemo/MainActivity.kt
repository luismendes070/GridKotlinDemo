package com.github.luismendes070.emptyviewsactivitydemo

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
// import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // private lateinit binding: ActivityMainBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)
        val button6 = findViewById<Button>(R.id.button6)
        val button7 = findViewById<Button>(R.id.button7)
        val button8 = findViewById<Button>(R.id.button8)
        val button9 = findViewById<Button>(R.id.button9)
        val buttons = arrayOf(button1, button2, button3, button4, button5, button6, button7, button8, button9)

        buttons.forEachIndexed { index, button ->
            button.setOnClickListener {
                // Handle button click here
                // Example: Toast.makeText(this, "Button $index clicked", Toast.LENGTH_SHORT).show()
            }
        }

    } // end function onCreate
}