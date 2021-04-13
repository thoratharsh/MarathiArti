package com.example.rajvardhan.marathiaarti

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.startapp.sdk.adsbase.StartAppSDK
import kotlinx.android.synthetic.main.activity_arti_detailed_view.*

class ArtiDetailedViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //StartAppSDK.setTestAdsEnabled(BuildConfig.DEBUG);
        setContentView(R.layout.activity_arti_detailed_view)
        when(Status.selectedName){
            GodNames.GANPATI.name -> fullArtiText.text = getText(R.string.ganapati_arti) ;
            GodNames.SHANKAR.name -> fullArtiText.text = getText(R.string.shankar_arti);
            GodNames.DATTA.name -> fullArtiText.text = getText(R.string.gurudatta_arti);
            GodNames.VITTHAL.name -> fullArtiText.text = getText(R.string.vitthal_arti);
            GodNames.DEVI.name -> fullArtiText.text = getText(R.string.devichi_arti);
            GodNames.DNYANESHWAR.name -> fullArtiText.text = getText(R.string.dnyanesharanchi_arti);
            GodNames.GHALINLOTANGAN.name -> fullArtiText.text = getText(R.string.ghalinLotangan);
            GodNames.TUKARAM.name -> fullArtiText.text = getText(R.string.artiTukaram);
            GodNames.HANUMAN.name -> fullArtiText.text = getText(R.string.artiHanuman);
        }
    }
}
