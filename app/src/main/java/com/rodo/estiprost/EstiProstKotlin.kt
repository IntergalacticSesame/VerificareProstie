package com.rodo.estiprost

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class EstiProstKotlin : AppCompatActivity() {

    private var nivelProstie = 69
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)

        val prostie0: Button = findViewById(R.id.prostie0)
        val prostie1: Button = findViewById(R.id.prostie1)
        val verificare : Button = findViewById(R.id.verificare)
        val nivelProstieText : TextView = findViewById(R.id.nivelProstie)

        prostie0.setOnClickListener{
            nivelProstie = 0
            nivelProstieText.text = nivelProstie.toString()
        }
        prostie1.setOnClickListener{
            nivelProstie = 1
            nivelProstieText.text = nivelProstie.toString()
        }

        verificare.setOnClickListener{
            when (nivelProstie) {
                1 -> {
                    Toast.makeText(this, R.string.esti_prost, Toast.LENGTH_SHORT).show()
                }
                0 -> {
                    Toast.makeText(this, R.string.tot_prost_esti, Toast.LENGTH_SHORT).show()
                }
                else -> {
                    Toast.makeText(this, R.string.selecteaza_ceva, Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}