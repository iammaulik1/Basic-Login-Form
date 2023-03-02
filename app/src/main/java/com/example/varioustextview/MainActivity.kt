package com.example.varioustextview

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var username = findViewById<EditText>(R.id.username)
        var password = findViewById<EditText>(R.id.Password)
        var loginButton = findViewById<Button>(R.id.loginButton)


        loginButton.setOnClickListener {

            if (username.text.isEmpty() || password.text.isEmpty()){
                Toast.makeText(this,"Please Enter Required Values",Toast.LENGTH_SHORT).show()

            }

            else {
                val user_name = username.text
                val Password = password.text
                Toast.makeText(
                    this@MainActivity,
                    "$user_name have been logged in",
                    Toast.LENGTH_LONG
                )
                    .show()
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }
        }


    }
}