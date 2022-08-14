package com.example.mapsandmultimediaappk


import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import kotlinx.android.synthetic.main.activity_video_media_player.*

class VideoMediaPlayerActivity : AppCompatActivity() {
    private var uri: Uri? = null
    private var isConstinuously = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_media_player)
        val mediaController = MediaController(this)
        mediaController.setAnchorView(vv)
        val uriPath = "https://archive.org/download/WildlifeSampleVideo/Wildlife.mp4"
        uri = Uri.parse(uriPath)
        vv!!.setOnCompletionListener {
            if (isConstinuously) {
                vv!!.start()
            }
        }

        btnstop!!.setOnClickListener { vv!!.pause() }
        btnplay!!.setOnClickListener { vv!!.start() }
        btnonce!!.setOnClickListener {
            isConstinuously = false
            progrss!!.visibility = View.VISIBLE
            vv!!.setMediaController(mediaController)
            vv!!.setVideoURI(uri)
            vv!!.requestFocus()
            vv!!.start()
        }
        btnconti!!.setOnClickListener {
            isConstinuously = true
            progrss!!.visibility = View.VISIBLE
            vv!!.setMediaController(mediaController)
            vv!!.setVideoURI(uri)
            vv!!.requestFocus()
            vv!!.start()
        }
        vv!!.setOnPreparedListener { progrss!!.visibility = View.GONE }
    }
}