package com.example.deneme4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textInputEditText:TextInputEditText = findViewById(R.id.textInputEdittext)
        val textInputEditpassword:TextInputEditText = findViewById(R.id.textInputEditpassword)
        val buttonLogin: MaterialButton = findViewById(R.id.buttonLogin)

        buttonLogin.setOnClickListener{
            Toast.makeText(this,"${textInputEditText.text} - ${textInputEditpassword.text}",Toast.LENGTH_LONG).show()

        }

    }
}