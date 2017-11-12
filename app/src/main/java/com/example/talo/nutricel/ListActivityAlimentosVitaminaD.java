package com.example.talo.nutricel;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ListActivityAlimentosVitaminaD extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_vitamina);

        List<AlimentosVitamina> list_aliC = gerarAlimentoC();
        final ListAlimentosVitaminaAdapterUI alimentosVitaminaAdapterC = new ListAlimentosVitaminaAdapterUI(this, list_aliC);
        setListAdapter(alimentosVitaminaAdapterC);

    }

    private List<AlimentosVitamina> gerarAlimentoC() {
        List<AlimentosVitamina> alimentos2 = new ArrayList<AlimentosVitamina>();
        alimentos2.add(criarAlimentoC("Ostras", "Vitamina D" ,81, R.drawable.ostras, 100));
        alimentos2.add(criarAlimentoC("Sardinha", "Vitamina D" ,650, R.drawable.sardinha, 100));
        alimentos2.add(criarAlimentoC("Figado", "Vitamina D" ,42, R.drawable.figado, 100));
        alimentos2.add(criarAlimentoC("Ovo Cozido", "Vitamina D" ,37, R.drawable.ovocozido, 100));


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