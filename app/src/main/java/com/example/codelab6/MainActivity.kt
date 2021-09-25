package com.example.codelab6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username = findViewById<EditText>(R.id.email_input)
        val password = findViewById<EditText>(R.id.password_input)
        val loginbtn = findViewById<Button>(R.id.login_btn)

        loginbtn.setOnClickListener{
            if (username.text.toString().equals("admin") && password.text.toString().equals("admin")){
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            } else {
                val snackBar = Snackbar.make(it, "incorrect username or password",
                    Snackbar.LENGTH_SHORT).setAction("Action",null)
                snackBar.show()
            }
        }
    }
}