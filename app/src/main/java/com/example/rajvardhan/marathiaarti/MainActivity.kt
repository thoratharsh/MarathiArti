package com.example.rajvardhan.marathiaarti

import android.content.Intent
import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.startapp.sdk.adsbase.StartAppSDK
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val mediaResourceMap = mapOf(GodNames.GANPATI to R.raw.ganaptiarti,
        GodNames.SHANKAR to R.raw.shankararti,
        GodNames.DATTA to R.raw.dattaarti,
        GodNames.VITTHAL to R.raw.vitthalarti,
        GodNames.DEVI to R.raw.deviarti,
        GodNames.HANUMAN to R.raw.artihanuman,
        GodNames.DNYANESHWAR to R.raw.dnyanarti,
        GodNames.TUKARAM to R.raw.tukaramarti,
        GodNames.GHALINLOTANGAN to R.raw.ghalinlotangan
        )

    var mediaPlayingFor: GodNames = GodNames.NONE
    var mediaPlayer = MediaPlayer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //StartAppSDK.setTestAdsEnabled(BuildConfig.DEBUG);
        setContentView(R.layout.activity_main)
        mediaPlayer = MediaPlayer.create(this, R.raw.ganaptiarti)

        layGanapati.setOnClickListener{view ->
            openArtiDetailedView()
            Status.selectedName = GodNames.GANPATI.name
        }

        playGanapati.setOnClickListener {
            playAndPauseMediaFor(GodNames.GANPATI, playGanapati)
        }

        layShankar.setOnClickListener { view ->
            openArtiDetailedView()
            Status.selectedName = GodNames.SHANKAR.name
        }
        playShankar.setOnClickListener {
            playAndPauseMediaFor(GodNames.SHANKAR, playShankar)
        }

        layGuruDatta.setOnClickListener { view ->
            openArtiDetailedView()
            Status.selectedName = GodNames.DATTA.name
        }
        playDurudatta.setOnClickListener {
            playAndPauseMediaFor(GodNames.DATTA, playDurudatta)
        }

        layVitthal.setOnClickListener { view ->
            openArtiDetailedView()
            Status.selectedName = GodNames.VITTHAL.name
        }
        playVitthal.setOnClickListener {
            playAndPauseMediaFor(GodNames.VITTHAL, playVitthal)
        }

        layDevi.setOnClickListener { view ->
            openArtiDetailedView()
            Status.selectedName = GodNames.DEVI.name
        }
        playDevi.setOnClickListener {
            playAndPauseMediaFor(GodNames.DEVI, playDevi)
        }

        layHanuman.setOnClickListener { view ->
            openArtiDetailedView()
            Status.selectedName = GodNames.HANUMAN.name
        }
        playHanuman.setOnClickListener {
            playAndPauseMediaFor(GodNames.HANUMAN, playHanuman)
        }

        layDnyaneshwar.setOnClickListener {view ->
            openArtiDetailedView()
            Status.selectedName = GodNames.DNYANESHWAR.name
        }
        playDnyaneshwar.setOnClickListener {
            playAndPauseMediaFor(GodNames.DNYANESHWAR, playDnyaneshwar)
        }

        layGhalinLotangan.setOnClickListener {view ->
            openArtiDetailedView()
            Status.selectedName = GodNames.GHALINLOTANGAN.name
        }
        playGhalinLotangan.setOnClickListener {
            playAndPauseMediaFor(GodNames.GHALINLOTANGAN, playGhalinLotangan)
        }

        layTukaram.setOnClickListener { view ->
            openArtiDetailedView()
            Status.selectedName = GodNames.TUKARAM.name
        }
        playTukaram.setOnClickListener {
            playAndPauseMediaFor(GodNames.TUKARAM, playTukaram)
        }

    }

    fun playAndPauseMediaFor(godName: GodNames, playButton: ImageView){
        val playButtonMap = mapOf(GodNames.GANPATI to playGanapati,
            GodNames.SHANKAR to playShankar,
            GodNames.DATTA to playDurudatta,
            GodNames.VITTHAL to playVitthal,
            GodNames.DEVI to playDevi,
            GodNames.HANUMAN to playHanuman,
            GodNames.DNYANESHWAR to playDnyaneshwar,
            GodNames.TUKARAM to playTukaram,
            GodNames.GHALINLOTANGAN to playGhalinLotangan
        )

        if (mediaPlayingFor == godName){
            mediaPlayer.stop()
            playButton.setImageResource(R.drawable.play)
            mediaPlayingFor = GodNames.NONE
            playButtonMap.values.forEach {button ->
                button.setImageResource(R.drawable.play)
            }
        } else {
            mediaPlayer.stop()
            mediaPlayer = MediaPlayer.create(this, mediaResourceMap[godName]!!)
            mediaPlayer.start()
            playButton.setImageResource(R.drawable.pause)
            mediaPlayingFor = godName
            playButtonMap.values.filter { it != playButton }.forEach {button ->
                button.setImageResource(R.drawable.play)
            }
        }
    }

    fun openArtiDetailedView(){
        val intent = Intent(this, ArtiDetailedViewActivity::class.java)
        startActivity(intent)
    }
}
