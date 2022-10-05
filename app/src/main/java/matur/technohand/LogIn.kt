package matur.technohand

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LogIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)
        supportActionBar?.hide()
        val buttonSingUp = findViewById<Button>(R.id.sing_up_button)
        buttonSingUp.setOnClickListener {
            val intent = Intent(this, SingUp::class.java)
            startActivity(intent)
        }

    }
}