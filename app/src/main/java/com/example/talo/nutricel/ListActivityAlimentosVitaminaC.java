package com.example.talo.nutricel;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ListActivityAlimentosVitaminaC extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_vitamina);

        List<AlimentosVitamina> list_aliC = gerarAlimentoC();
        final ListAlimentosVitaminaAdapter alimentosVitaminaAdapterC = new ListAlimentosVitaminaAdapter(this, list_aliC);
        setListAdapter(alimentosVitaminaAdapterC);

    }

    private List<AlimentosVitamina> gerarAlimentoC() {
        List<AlimentosVitamina> alimentos2 = new ArrayList<AlimentosVitamina>();
        alimentos2.add(criarAlimentoC("Manga", "Vitamina C" ,57, R.drawable.manga, 207));
        alimentos2.add(criarAlimentoC("Goiaba", "Vitamina C" ,73, R.drawable.goiaba,100));
        alimentos2.add(criarAlimentoC("Laranja", "Vitamina C" ,51, R.drawable.laranja,96));
        alimentos2.add(criarAlimentoC("Kiwi", "Vitamina C" ,74, R.drawable.kiwi, 76));
        alimentos2.add(criarAlimentoC("Brócolis", "Vitamina C" ,37, R.drawable.brocolis, 92));

        return alimentos2;
    }

    private AlimentosVitamina criarAlimentoC(String nome, String vitamina, double quantidade, int image, int porcao) {
        AlimentosVitamina aliC = new AlimentosVitamina(nome, vitamina, quantidade, image, porcao);
        return aliC;
    }

    @Override
    public void onBackPressed(){ //Botão BACK padrão do android
        startActivity(new Intent(this, MainActivity.class)); //O efeito ao ser pressionado do botão (no caso abre a activity)
        finishAffinity(); //Método para matar a activity e não deixa-lá indexada na pilhagem
        return;
    }
}