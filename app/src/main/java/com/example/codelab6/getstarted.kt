package com.example.codelab6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class getstarted : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_getstarted)

        val textView = findViewById<TextView>(R.id.helloUser_txt)
        val intent = getIntent()
        val msg = intent.getStringExtra("name")
        textView.setText("Hello "+msg +"!" )
    }
}