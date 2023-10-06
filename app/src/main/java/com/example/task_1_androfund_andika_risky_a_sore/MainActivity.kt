package com.example.task_1_androfund_andika_risky_a_sore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var button:Button
    private lateinit var dataUsername:EditText
    private lateinit var dataPassword:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.buttonLogin)
        dataUsername = findViewById(R.id.insertUsername)
        dataPassword = findViewById(R.id.insertPassword)

        button.setOnClickListener {
            handleButtonLogin()
        }
    }
    private fun handleButtonLogin(){
        val username = dataUsername.text.toString()
        val password = dataPassword.text.toString()

        val intent = Intent(this, MenuActivity::class.java)
        intent.putExtra("username", username)
        intent.putExtra("password", password)
        startActivity(intent)
    }

}