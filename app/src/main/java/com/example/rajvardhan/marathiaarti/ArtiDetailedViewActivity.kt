package com.example.rajvardhan.marathiaarti

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_arti_detailed_view.*

class ArtiDetailedViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_arti_detailed_view)
        when(Status.selectedName){
            GodNames.GANPATI.name -> fullArtiText.text="Ganpatichi arti\nasasasasas\nasasasasas\nasasasasasasa\nsasasasasasas\nsdfdf\nsaas\n";
            GodNames.SHANKAR.name -> fullArtiText.text="Shankrachi arti\nasasasasas\nasasasasasas\nasasasasasas\nsasasasasasa\nasasas"
        }
    }
}
