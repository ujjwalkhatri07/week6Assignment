package com.ujjwal.softuserassignment6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


private lateinit var username : EditText
private lateinit var password : EditText
private lateinit var login : Button
class Login : AppCompatActivity(), View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        username = findViewById(R.id.username)
        password = findViewById(R.id.password)
        login = findViewById(R.id.login)
        login.setOnClickListener(this)




    }

    override fun onClick(v: View?) {
        if (username.text.toString() == "softwarica") {
            if (password.text.toString() == "coventry"){
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
            else{
                Toast.makeText(this, "Invalid Username or Password", Toast.LENGTH_SHORT).show()}
        }
        else{
            Toast.makeText(this, "Invalid Username or Password", Toast.LENGTH_SHORT).show()
        }
    }
}