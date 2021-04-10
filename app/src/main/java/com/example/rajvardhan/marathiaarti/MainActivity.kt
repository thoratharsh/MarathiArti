package com.example.rajvardhan.marathiaarti

import android.content.Intent
import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val mediaResourceMap = mapOf(GodNames.GANPATI to R.raw.ganaptiarti,
        GodNames.SHANKAR to R.raw.shankararti,
        GodNames.DATTA to R.raw.dattaarti,
        GodNames.VITTHAL to R.raw.vitthalarti,
        GodNames.DEVI to R.raw.deviarti,
        GodNames.DNYANESHWAR to R.raw.dnyanarti,
        GodNames.TUKARAM to R.raw.tukaramarti,
        GodNames.EKNATH to R.raw.eknatharti,
        GodNames.GHALINLOTANGAN to R.raw.ghalinlotangan
        )

    val mediaPlayingFor: GodNames? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var mediaPlayer = MediaPlayer.create(this, R.raw.ganaptiarti)

        layGanapati.setOnClickListener{view ->
            openArtiDetailedView()
            Status.selectedName = GodNames.GANPATI.name
        }

        playGanapati.setOnClickListener {
            if (mediaPlayer.isPlaying){
                mediaPlayer.stop()
                playGanapati.setImageResource(R.drawable.play)
            } else {
                mediaPlayer = MediaPlayer.create(this, R.raw.ganaptiarti)
                mediaPlayer.start()
                playGanapati.setImageResource(R.drawable.pause)
            }
        }

        layShankar.setOnClickListener { view ->
            openArtiDetailedView()
            Status.selectedName = GodNames.SHANKAR.name
        }
        playShankar.setOnClickListener {
            if (mediaPlayer.isPlaying){
                mediaPlayer.stop()
                playShankar.setImageResource(R.drawable.play)
            } else {
                mediaPlayer = MediaPlayer.create(this, R.raw.shankararti)
                mediaPlayer.start()
                playShankar.setImageResource(R.drawable.pause)
            }
        }

        layGuruDatta.setOnClickListener { view ->
            openArtiDetailedView()
            Status.selectedName = GodNames.DATTA.name
        }
        playDurudatta.setOnClickListener {
            if (mediaPlayer.isPlaying){
                mediaPlayer.stop()
                playDurudatta.setImageResource(R.drawable.play)
            } else {
                mediaPlayer = MediaPlayer.create(this, R.raw.dattaarti)
                mediaPlayer.start()
                playDurudatta.setImageResource(R.drawable.pause)
            }
        }


        layVitthal.setOnClickListener { view ->
            openArtiDetailedView()
            Status.selectedName = GodNames.VITTHAL.name
        }
        playVitthal.setOnClickListener {
            if (mediaPlayer.isPlaying){
                mediaPlayer.stop()
                playVitthal.setImageResource(R.drawable.play)
            } else {
                mediaPlayer = MediaPlayer.create(this, R.raw.vitthalarti)
                mediaPlayer.start()
                playVitthal.setImageResource(R.drawable.pause)
            }
        }

        layDevi.setOnClickListener { view ->
            openArtiDetailedView()
            Status.selectedName = GodNames.DEVI.name
        }
        playDevi.setOnClickListener {
            if (mediaPlayer.isPlaying){
                mediaPlayer.stop()
                playDevi.setImageResource(R.drawable.play)
            } else {
                mediaPlayer = MediaPlayer.create(this, R.raw.deviarti)
                mediaPlayer.start()
                playDevi.setImageResource(R.drawable.pause)
            }
        }

        layDnyaneshwar.setOnClickListener {view ->
            openArtiDetailedView()
            Status.selectedName = GodNames.DNYANESHWAR.name
        }
        playDnyaneshwar.setOnClickListener {
            if (mediaPlayer.isPlaying){
                mediaPlayer.stop()
                playDnyaneshwar.setImageResource(R.drawable.play)
            } else {
                mediaPlayer = MediaPlayer.create(this, R.raw.dnyanarti)
                mediaPlayer.start()
                playDnyaneshwar.setImageResource(R.drawable.pause)
            }
        }

        layGhalinLotangan.setOnClickListener {view ->
            openArtiDetailedView()
            Status.selectedName = GodNames.GHALINLOTANGAN.name
        }
        playGhalinLotangan.setOnClickListener {
            if (mediaPlayer.isPlaying){
                mediaPlayer.stop()
                playGhalinLotangan.setImageResource(R.drawable.play)
            } else {
                mediaPlayer = MediaPlayer.create(this, R.raw.ghalinlotangan)
                mediaPlayer.start()
                playGhalinLotangan.setImageResource(R.drawable.pause)
            }
        }

        layTukaram.setOnClickListener { view ->
            openArtiDetailedView()
            Status.selectedName = GodNames.TUKARAM.name
        }
        playTukaram.setOnClickListener {
            if (mediaPlayer.isPlaying){
                mediaPlayer.stop()
                playTukaram.setImageResource(R.drawable.play)
            } else {
                mediaPlayer = MediaPlayer.create(this, R.raw.tukaramarti)
                mediaPlayer.start()
                playTukaram.setImageResource(R.drawable.pause)
            }
        }

        layEknath.setOnClickListener { view ->
            openArtiDetailedView()
            Status.selectedName = GodNames.EKNATH.name
        }
        playEknath.setOnClickListener {
            if (mediaPlayer.isPlaying){
                mediaPlayer.stop()
                playEknath.setImageResource(R.drawable.play)
            } else {
                mediaPlayer = MediaPlayer.create(this, R.raw.eknatharti)
                mediaPlayer.start()
                playEknath.setImageResource(R.drawable.pause)
            }
        }
    }

    fun openArtiDetailedView(){
        val intent = Intent(this, ArtiDetailedViewActivity::class.java)
        startActivity(intent)
    }
}
