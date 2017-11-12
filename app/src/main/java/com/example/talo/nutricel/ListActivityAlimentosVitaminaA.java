package com.example.talo.nutricel;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListActivityAlimentosVitaminaA extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_vitamina);

        List<AlimentosVitamina> list_ali = gerarAlimento();
        final ListAlimentosVitaminaAdapter alimentosVitaminaAdapter = new ListAlimentosVitaminaAdapter(this, list_ali);
        setListAdapter(alimentosVitaminaAdapter);

    }

    private List<AlimentosVitamina> gerarAlimento() {
        List<AlimentosVitamina> alimentos = new ArrayList<AlimentosVitamina>();
        alimentos.add(criarAlimento("Tomate", "Vitamina A" ,60, R.drawable.tomate,100));
        alimentos.add(criarAlimento("Mamão Formosa", "Vitamina A" ,148, R.drawable.mamao,100));
        alimentos.add(criarAlimento("Espinafre Cozido", "Vitamina A" ,621, R.drawable.espinafre,100));
        alimentos.add(criarAlimento("Manga", "Vitamina A" ,118, R.drawable.manga,100));
        alimentos.add(criarAlimento("Batata doce", "Vitamina A" ,298, R.drawable.batata,100));

        return alimentos;
    }

    private AlimentosVitamina criarAlimento(String nome, String vitamina, double quantidade, int image, int porcao) {
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