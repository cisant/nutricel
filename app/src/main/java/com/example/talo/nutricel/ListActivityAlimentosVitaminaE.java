package com.example.talo.nutricel;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ListActivityAlimentosVitaminaE extends ListActivity {

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

        alimentos2.add(criarAlimentoC("Abacate", "Vitamina E" ,3, R.drawable.abacate, 350));
        alimentos2.add(criarAlimentoC("Castanha", "Vitamina E" ,5, R.drawable.castanha, 70));
        alimentos2.add(criarAlimentoC("Amemdoim", "Vitamina E" ,5, R.drawable.amemdoim, 72));
        alimentos2.add(criarAlimentoC("Avelã", "Vitamina E" ,16, R.drawable.avela, 68));

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