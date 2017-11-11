package com.example.talo.nutricel;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListActivityAlimentosVitamina extends ListActivity {

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
        alimentos.add(criarAlimento("Tomate", "A" ,60, R.drawable.tomate));
        alimentos.add(criarAlimento("Mamão", "A" ,148, R.drawable.mamao));
        alimentos.add(criarAlimento("Mamão", "A" ,148, R.drawable.mamao));
        alimentos.add(criarAlimento("Mamão", "A" ,148, R.drawable.mamao));
        alimentos.add(criarAlimento("Mamão", "A" ,148, R.drawable.mamao));

        return alimentos;
    }

    private AlimentosVitamina criarAlimento(String nome, String vitamina, int quantidade, int image) {
        AlimentosVitamina ali = new AlimentosVitamina(nome, vitamina, quantidade, image);
        return ali;
    }

    @Override
    public void onBackPressed(){ //Botão BACK padrão do android
        startActivity(new Intent(this, MainActivity.class)); //O efeito ao ser pressionado do botão (no caso abre a activity)
        finishAffinity(); //Método para matar a activity e não deixa-lá indexada na pilhagem
        return;
    }
}