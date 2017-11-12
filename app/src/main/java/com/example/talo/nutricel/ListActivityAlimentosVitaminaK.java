package com.example.talo.nutricel;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ListActivityAlimentosVitaminaK extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_vitamina);

        List<AlimentosVitamina> list_aliC = gerarAlimentoC();
        final ListAlimentosVitaminaAdapterMCG alimentosVitaminaAdapterC = new ListAlimentosVitaminaAdapterMCG(this, list_aliC);
        setListAdapter(alimentosVitaminaAdapterC);

    }

    private List<AlimentosVitamina> gerarAlimentoC() {
        List<AlimentosVitamina> alimentos2 = new ArrayList<AlimentosVitamina>();

        alimentos2.add(criarAlimentoC("Alface", "Vitamina K" ,118, R.drawable.alface, 56));
        alimentos2.add(criarAlimentoC("Cenoura", "Vitamina K" ,104, R.drawable.cenoura, 72));
        alimentos2.add(criarAlimentoC("Ovo Cozido", "Vitamina K" ,24, R.drawable.ovocozido, 50));
        alimentos2.add(criarAlimentoC("Couve Flor", "Vitamina K" ,150, R.drawable.couveflor, 50));

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