package com.example.task_1_androfund_andika_risky_a_sore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu)

        // Mengambil data username dan password dari Intent
        val username = intent.getStringExtra("username")
        val password = intent.getStringExtra("password")

        // Menampilkan data username dan password di TextView
        val textUsername = findViewById<TextView>(R.id.textUsername)
        val textPassword = findViewById<TextView>(R.id.textPassword)

        textUsername.text = "Username: $username"
        textPassword.text = "Password: $password"

        // Menambahkan fragment ke dalam kontainer fragmentContainer
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        val fragment = Fragment1() // Gantilah dengan fragment yang sesuai
        fragmentTransaction.replace(R.id.fragmentContainer, fragment)
        fragmentTransaction.commit()
    }
}