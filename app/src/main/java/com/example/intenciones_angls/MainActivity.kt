package com.example.intenciones_angls

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //primer boton
        val btn1=this.btn_ventana_1
        //tercer boton
        val btn3=this.btnGoogle
        // cuarto boton
        val btn4=this.btnSalir
        //primer Boton
        val btn2=this.btn_ventana2
btn1.setOnClickListener {
    Log.e("intencionesApp","se presiono")
    //intencion explicita(llama un recurso de la propia aplicacion)
    val intencion1 = Intent(this,ListProducts::class.java)
    startActivity(intencion1)
}
        btn2.setOnClickListener {
            Log.e("intencionesApp","se presiono")
            //intencion explicita(llama un recurso de la propia aplicacion)
            val intencion2 = Intent(this,AgregarProducto::class.java)
            startActivity(intencion2)
        }
        btn3.setOnClickListener {
            val aGoogle= Intent(android.content.Intent.ACTION_VIEW)
            //intencion implicita (recurso adicional)
            aGoogle.data= Uri.parse("https://luiscobian.com.mx")
            startActivity(aGoogle)
        }
        btn4.setOnClickListener {
            finish()
        }
    }
}