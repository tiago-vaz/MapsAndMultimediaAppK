package com.example.mapsandmultimediaappk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class RecuperaFotosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recupera_fotos)

        var equipes = arrayOf("Leão","Pinguim","Urso","Girafa","Tigre","Rato")

        //TODO: Refatorar (e aprenderer) para parar de usar esse findViewById
        val textView1 = findViewById<TextView>(R.id.textView1)
        val textView2 = findViewById<TextView>(R.id.textView2)
        val textView3 = findViewById<TextView>(R.id.textView3)
        val textView4 = findViewById<TextView>(R.id.textView4)
        val textView5 = findViewById<TextView>(R.id.textView5)
        val textView6 = findViewById<TextView>(R.id.textView6)

        val imageView1 = findViewById<ImageView>(R.id.imageView1)
        val imageView2 = findViewById<ImageView>(R.id.imageView2)
        val imageView3 = findViewById<ImageView>(R.id.imageView3)
        val imageView4 = findViewById<ImageView>(R.id.imageView4)
        val imageView5 = findViewById<ImageView>(R.id.imageView5)
        val imageView6 = findViewById<ImageView>(R.id.imageView6)


        textView1.setText(equipes[0])
        textView2.setText(equipes[1])
        textView3.setText(equipes[2])
        textView4.setText(equipes[3])
        textView5.setText(equipes[4])
        textView6.setText(equipes[5])

        var i1 = "https://images2.alphacoders.com/259/259300.jpg"
        var i2 = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSBYJjKBtoZvMM2-HiNM2EEKY0TxY6wejpOyQ&usqp=CAU"
        var i3 = "https://p.kindpng.com/picc/s/5-56237_polar-bear-png-we-bare-bears-png-pack.png"
        var i4 = "https://i.pinimg.com/736x/f8/dd/2a/f8dd2ab4601be9d6f1c833b2c00dd709--a-giraffe-eye-makeup.jpg"
        var i5 = "https://orelhasdevidro.files.wordpress.com/2016/02/tigrao.jpg"
        var i6 = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSaCSXnrx3XmBOEX0fzM_73r2qEfXNWarWKg5ytq7xwJSVWfFRwwCA3QqiGt_w6y5TEpfs&usqp=CAU"

        Glide.with(this).load(i1).into(imageView1!!)
        Glide.with(this).load(i2).into(imageView2!!)
        Glide.with(this).load(i3).into(imageView3!!)
        Glide.with(this).load(i4).into(imageView4!!)
        Glide.with(this).load(i5).into(imageView5!!)
        Glide.with(this).load(i6).into(imageView6!!)



    }
}