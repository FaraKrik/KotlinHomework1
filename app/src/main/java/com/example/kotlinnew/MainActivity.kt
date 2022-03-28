package com.example.kotlinnew

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val person = Person(firstName = "Vasya", lastName = "Ivanov", age = 32)
        person.lastName


        SecondActivity.start(33, context = this)

        val textView = findViewById<TextView>(R.id.textView)
        textView.setOnClickListener {
            Toast.makeText(this, (it as TextView).text, Toast.LENGTH_LONG).show()
        }

    }
}