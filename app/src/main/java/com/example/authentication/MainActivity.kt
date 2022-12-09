package com.example.authentication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val email=email.text.toString()
            val password=password.text.toString()

            FirebaseAuth.getInstance()
            .createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener{ rame->
                if(rame.isSuccessful) {
                    Toast.makeText(this, "წარმატებით შეიქმნა! ", Toast.LENGTH_SHORT).show()

                } else {
                    Toast.makeText(this, "ERROR!!!!!!", Toast.LENGTH_SHORT).show()
                }
            }
            }


    }
}