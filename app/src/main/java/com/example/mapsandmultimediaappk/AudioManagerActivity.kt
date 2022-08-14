package com.example.mapsandmultimediaappk

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class AudioManagerActivity : AppCompatActivity() {
    var cow: MediaPlayer? = null
    var cat: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_audio_manager)
        cow = MediaPlayer.create(this,R.raw.cow)
        cat = MediaPlayer.create(this,R.raw.cat_meow)
    }

    fun soundCow(view: View){
        //Foi adicionado esse tratamento para verificar se o media player do gato ou da vaca estavam tocando
        // caso estivessem algum deles, o player é interrompido, e é feito essa chamada do .prepare()
        // caso contrario qualquer chamada subsequente ao .start() não funcionará, devido ao uso do .stop()
        if (cat!!.isPlaying()){
            cat!!.stop()
            cat!!.prepare()
        }
        if (cow!!.isPlaying()){
            cow!!.stop()
            cow!!.prepare()
        }
        cow!!.start()
    }

    fun soundCat(view: View){
        //Foi adicionado esse tratamento para verificar se o media player do gato ou da vaca estavam tocando
        // caso estivessem algum deles, o player é interrompido, e é feito essa chamada do .prepare()
        // caso contrario qualquer chamada subsequente ao .start() não funcionará, devido ao uso do .stop()
        if (cat!!.isPlaying()){
            cat!!.stop()
            cat!!.prepare()
        }
        if (cow!!.isPlaying()){
            cow!!.stop()
            cow!!.prepare()
        }
        cat!!.start()
    }
}