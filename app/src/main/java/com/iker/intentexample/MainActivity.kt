package com.iker.intentexample

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.time.Instant

class MainActivity : AppCompatActivity() {

    lateinit var btn1:Button
    val RESULTADO_UNO=1
    val RESULTADO_DOS=2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1 = findViewById(R.id.button)
        val intent = Intent(this, Activity2::class.java)

        btn1.setOnClickListener{
            intent.putExtra("Proveedores",2)
            intent.putExtra("Clientes",3)

            startActivityForResult(intent,RESULTADO_UNO)
            startActivityForResult(intent,RESULTADO_DOS)
        }


    }

    @Deprecated("Deprecated in Java")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        val saludo = findViewById<TextView>(R.id.textView)
        if(resultCode != Activity.RESULT_OK) return
        when(requestCode) {
            RESULTADO_UNO -> {
                if (data != null) {
                    saludo.text = data.getStringExtra("Saludo")
                }; }
            RESULTADO_DOS ->{
                if (data != null) {
                    data.getStringExtra("Saludo2")?.let { Log.d("Mensaje:" , it) }
                };
            }
            // Other result codes
            else -> {}
        }
}}