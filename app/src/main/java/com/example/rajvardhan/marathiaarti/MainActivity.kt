package com.example.rajvardhan.marathiaarti

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        layGanapati.setOnClickListener{view ->
            openArtiDetailedView()
            Status.selectedName = GodNames.GANPATI.name
        }
        layShankar.setOnClickListener { view ->
            openArtiDetailedView()
            Status.selectedName = GodNames.SHANKAR.name
        }
    }

    fun openArtiDetailedView(){
        val intent = Intent(this, ArtiDetailedViewActivity::class.java)
        startActivity(intent)
    }
}
