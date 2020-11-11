package com.example.intenciones_angls

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_agregar_producto.*

class AgregarProducto : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agregar_producto)
        val  btnagregar=findViewById<Button>(R.id.BtnAgregar)
        val btnsalir=this.BtnSalir
        btnagregar.setOnClickListener {
            Toast.makeText(this@AgregarProducto, "Se Presiono", Toast.LENGTH_SHORT).show()
        }
        btnsalir.setOnClickListener {
            finish()
        }
    }
}