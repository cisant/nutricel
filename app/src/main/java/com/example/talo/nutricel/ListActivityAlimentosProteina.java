package com.example.talo.nutricel;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ListActivityAlimentosProteina extends ListActivity {

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
        alimentos.add(criarAlimento("Carne de Frango", "Proteina" ,32.8, R.drawable.frango,100));
        alimentos.add(criarAlimento("Feijão", "Proteina" ,6.6, R.drawable.feijao,100));
        alimentos.add(criarAlimento("Carne de Vaca", "Proteina" ,26.4, R.drawable.vaca,100));
        alimentos.add(criarAlimento("Soja", "Proteina",12.5, R.drawable.soja,100));

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