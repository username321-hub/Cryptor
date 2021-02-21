package com.example.cryptor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    lateinit var encryptButton: Button
    lateinit var sourceEditText: EditText
    lateinit var resultTextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        encryptButton = findViewById(R.id.encrypt)
        sourceEditText = findViewById(R.id.source)
        resultTextView = findViewById(R.id.result)
        var caesarEncryptor = CaesarEncryptor()
        encryptButton.setOnClickListener {
            resultTextView.setText(caesarEncryptor.encrypt(findViewById<EditText>(R.id.source).text.toString()))
            Toast.makeText(applicationContext, findViewById<EditText>(R.id.source).text, LENGTH_SHORT).show()
        }
    }
}