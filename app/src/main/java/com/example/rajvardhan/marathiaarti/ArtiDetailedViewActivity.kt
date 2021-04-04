package com.example.rajvardhan.marathiaarti

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_arti_detailed_view.*

class ArtiDetailedViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_arti_detailed_view)
        when(Status.selectedName){
            GodNames.GANPATI.name -> fullArtiText.text = getText(R.string.ganapati_arti) ;
            GodNames.SHANKAR.name -> fullArtiText.text = getText(R.string.shankar_arti);
        }
    }
}
