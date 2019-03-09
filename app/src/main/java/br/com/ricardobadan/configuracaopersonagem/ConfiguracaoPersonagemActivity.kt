package br.com.ricardobadan.configuracaopersonagem

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_configuracao_personagem.*

class ConfiguracaoPersonagemActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_configuracao_personagem)

        btJogar.setOnClickListener{
            jogar()
        }
    }

    fun jogar(){
        val proximaTela = Intent (this, TelaDadosActivity::class.java)
        proximaTela.putExtra("apelido", etApelido.text.toString())
        proximaTela.putExtra("classe", spClasses.selectedItem.toString())
        proximaTela.putExtra("sexo", getSexo())
        startActivity(proximaTela)
        finish()
    }

    fun getSexo() : String{
        val sexoSelecionado = if(rgSexo.checkedRadioButtonId == R.id.rbFeminino){
            rbFeminino.text.toString()
        }
        else{
            rbMasculino.text.toString()
        }
        return sexoSelecionado
    }
}
