package com.nnorte.minhaintentimplicita

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun enviarMensagem(view: View){

        val mensagem = ed_mensagem.text.toString()

        val intente = Intent()

        intente.action = Intent.ACTION_SEND

        intente.putExtra(Intent.EXTRA_TEXT,mensagem)

        intente.type = "text/plain"

       if(intente.resolveActivity(packageManager)!= null){
           startActivity(intente)
       }
    }
}
