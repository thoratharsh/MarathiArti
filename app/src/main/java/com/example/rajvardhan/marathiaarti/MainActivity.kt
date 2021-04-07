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
        layGuruDatta.setOnClickListener { view ->
            openArtiDetailedView()
            Status.selectedName = GodNames.DATTA.name
        }
        layVitthal.setOnClickListener { view ->
            openArtiDetailedView()
            Status.selectedName = GodNames.VITTHAL.name
        }
        layDevi.setOnClickListener { view ->
            openArtiDetailedView()
            Status.selectedName = GodNames.DEVI.name
        }
        layDnyaneshwar.setOnClickListener {view ->
            openArtiDetailedView()
            Status.selectedName = GodNames.DNYANESHWAR.name
        }
        layGhalinLotangan.setOnClickListener {view ->
            openArtiDetailedView()
            Status.selectedName = GodNames.GHALINLOTANGAN.name
        }
        layTukaram.setOnClickListener { view ->
            openArtiDetailedView()
            Status.selectedName = GodNames.TUKARAM.name
        }
    }

    fun openArtiDetailedView(){
        val intent = Intent(this, ArtiDetailedViewActivity::class.java)
        startActivity(intent)
    }
}
