package com.example.mapsandmultimediaappk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_animation.*

class AnimationActivity : AppCompatActivity() {

    //Array com os textos a serem exibidos na ListView
    internal var animations = arrayOf(
        "Fade In",
        "Fade Out",
        "Zoom In",
        "Zoom Out",
        "Blink",
        "Rotate",
        "Move",
        "Slide Up",
        "Slide Down",
        "Bounce"
    )

    //Criando um array referenciando os objetos xml das animações
    internal var animationIDs = intArrayOf(
        R.anim.fade_in,
        R.anim.fade_out,
        R.anim.zoom_in,
        R.anim.zoom_out,
        R.anim.blink,
        R.anim.rotate,
        R.anim.move,
        R.anim.slide_up,
        R.anim.slide_down,
        R.anim.bounce
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation)
        //Atribuindo ao List View o Array com a lista com o nome das animações
        lv.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, animations)
        lv.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            //Com base na posição recebida no clique, carrega a referência à posição equivalente
            //no array de animações para a execução da animação
            val animation = AnimationUtils.loadAnimation(
                this,
                animationIDs[position]
            )
            //Executa a animação do xml apontado
            tv.startAnimation(animation)
        }
    }
}