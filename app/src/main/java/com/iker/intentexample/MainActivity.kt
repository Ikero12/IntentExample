package com.iker.intentexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import java.time.Instant

class MainActivity : AppCompatActivity() {

    lateinit var btn1:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1 = findViewById(R.id.button)
        val intent = Intent(this, Activity2::class.java)


        intent.putExtra("key","value")
        intent.putExtra("key2","value2")



        btn1.setOnClickListener{
            startActivity(intent)
        }


    }
}