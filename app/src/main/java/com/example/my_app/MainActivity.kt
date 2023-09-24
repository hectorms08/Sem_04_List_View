package com.example.my_app

import android.annotation.SuppressLint
import android.icu.text.Transliterator.Position
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var arrSO = arrayOf("Android","IOS","Firefox","Amazon world","Blacberry","Nokia","Windows Phone")

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val lsvSistemasOperativos: ListView = findViewById<View>(R.id.lsvSO) as ListView
        val adaptador: Any? = ArrayAdapter<Any>(
            this,
            android.R.layout.simple_list_item_1, arrSO
        )
        lsvSistemasOperativos.adapter = adaptador as ListAdapter
        lsvSistemasOperativos.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(
                applicationContext,
                "position: $position",
                Toast.LENGTH_LONG
            ).show()
// Hector Mendoza
        }
    }
}