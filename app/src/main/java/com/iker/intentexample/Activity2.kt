package com.iker.intentexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Activity2 : AppCompatActivity() {

    lateinit var btn2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity2)

        btn2 = findViewById(R.id.button2)

        val intent = Intent(this, MainActivity::class.java)
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)

        btn2.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                startActivity(intent)
            }

        })

    }
}
