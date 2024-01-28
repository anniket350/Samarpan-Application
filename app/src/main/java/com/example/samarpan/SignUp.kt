package com.example.samarpan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class SignUp : AppCompatActivity() {

    private lateinit var edtName: EditText
    private lateinit var edtEmail: EditText
    private lateinit var edtPassword: EditText
    private lateinit var btnSignup: Button
    private lateinit var  mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup)

        mAuth = FirebaseAuth.getInstance()
        edtName = findViewById(R.id.editTextText)
        edtEmail =findViewById(R.id.editTextTextEmailAddress)
        edtPassword= findViewById(R.id.editTextTextPassword)
        btnSignup = findViewById(R.id.button2)

        btnSignup.setOnClickListener{
            val email = edtEmail.text.toString()
            val password = edtPassword.text.toString()

            login(email, password);
        }

    }
    private fun login(email: String, password: String){
        mAuth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    val intent = Intent(this@SignUp, HomeActivity::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(this@SignUp, "Password must contains at least 6 letters", Toast.LENGTH_SHORT).show()

                }
            }

    }
}