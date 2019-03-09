package br.com.ricardobadan.configuracaopersonagem

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tela_dados.*

class TelaDadosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_dados)

        tvNomePersonagem.text = intent.extras.getString("apelido")
    }
}
