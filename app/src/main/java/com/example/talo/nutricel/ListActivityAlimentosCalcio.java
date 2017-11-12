package com.example.talo.nutricel;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ListActivityAlimentosCalcio extends ListActivity {

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
        alimentos.add(criarAlimento("Castanha do Pará", "Calcio" ,123, R.drawable.castanhapara,70));
        alimentos.add(criarAlimento("Feijão de Soja", "Calcio" ,119, R.drawable.feijaosoja,86));
        alimentos.add(criarAlimento("Quiabo", "Calcio" ,50, R.drawable.quiabo,92));
        alimentos.add(criarAlimento("Ameixas Secas", "Calcio" ,43, R.drawable.ameixaseca,85));
        alimentos.add(criarAlimento("Espinafre", "Calcio" ,140, R.drawable.espinafre,95));

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