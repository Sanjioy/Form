package com.stingach.dm.form

import android.os.Bundle
import android.widget.RadioButton
import android.widget.EditText
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val radioButton = findViewById<RadioButton>(R.id.radioButton)
        val editText = findViewById<EditText>(R.id.tv11)
        val bebe = findViewById<TextView>(R.id.tv10)

        radioButton.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                editText.visibility = View.VISIBLE
                bebe.visibility = View.VISIBLE
            } else {
                editText.visibility = View.GONE
                bebe.visibility = View.GONE
            }
        }
    }
}
