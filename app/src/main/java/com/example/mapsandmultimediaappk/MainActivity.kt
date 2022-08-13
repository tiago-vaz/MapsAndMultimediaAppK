package com.example.mapsandmultimediaappk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

//    fun acessarAnimacao(view: View) {
//        val intent = Intent(this, AnimacaoActivity::class.java)
//        startActivity(intent)
//    }

    fun acessaRecuperacaoFotos(view: View) {
        val intent = Intent(this, RecuperaFotosActivity::class.java)
        startActivity(intent)
    }

    fun abrirWebView(view: View) {
        val intent = Intent(this, WebViewActivity::class.java)
        startActivity(intent)
    }

    fun abrirAudioManager(view: View) {
        val intent = Intent(this, AudioManagerActivity::class.java)
        startActivity(intent)
    }
}