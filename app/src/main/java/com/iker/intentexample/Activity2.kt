package com.iker.intentexample

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class Activity2 : AppCompatActivity() {

    lateinit var btn2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity2)
        btn2 = findViewById(R.id.button2)

        val intent = getIntent()
        //intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)

        val valor = intent.getIntExtra("Proveedores",0)
        val nroClientes = findViewById<TextView>(R.id.textView2)

        nroClientes.text = valor.toString()

        //Botón para cambiar a primera actividad
       /* btn2.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {

                startActivity(intent)
            }

        })*/


        intent.putExtra("Saludo","Hola")
        intent.putExtra("Saludo2","Chau")
        //debug
        Log.d("CORRECTO: ","Actualizado Intent")

        // Configuro el result para que la Main lo tenga disponible
        // Posibles resultados:
        //    Activity.RESULT_OK
        //    Activity.RESULT_CANCELED
        setResult(Activity.RESULT_OK, intent)

        //debug
        Log.d("CORRECTO: ","Actualizado Resultado")
        //Cierro la activity
        finish()
    }
}
