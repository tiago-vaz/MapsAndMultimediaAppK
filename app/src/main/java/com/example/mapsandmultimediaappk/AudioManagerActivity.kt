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
        cow!!.start()
    }

    fun soundCat(view: View){
        cat!!.start()
    }
}