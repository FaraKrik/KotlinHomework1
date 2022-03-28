package com.example.kotlinnew

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener

class SecondActivity() : AppCompatActivity(), SomeInterface {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val textChangeListener = object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                TODO("Not yet implemented")
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                TODO("Not yet implemented")
            }

            override fun afterTextChanged(s: Editable?) {
                TODO("Not yet implemented")
            }

            }
        val editText = EditText(this)
        editText.addTextChangedListener {
            it.toString()
        }
        editText.addTextChangedListener(textChangeListener)

    }


    companion object {
        val datakey = "ageKey"

        fun start(age: Int, context: Context) {
            val intent = Intent()
            intent.putExtra(datakey, age)
            context.startActivity(intent)
        }
    }

    override val initialData = 20

    override fun execute() {
        sayhello()
    }

    override fun calculate(): Int {
        KotlinSingleton.someFiled
        return 64
    }

}
