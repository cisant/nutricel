package com.example.talo.nutricel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends Activity {
    private String vitamina;
    private String mineral;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Spinner Vitaminas
        Spinner spinnerVitaminas = (Spinner) findViewById(R.id.vitaminas);
        // Criando Spinner Padrão com array de string.
        ArrayAdapter<CharSequence> staticAdapter1 = ArrayAdapter
                .createFromResource(this, R.array.StringVitaminas, R.layout.spinner_item);
        // Layout para escolhas.
        staticAdapter1
                .setDropDownViewResource(R.layout.spinner_dropdown_item);
        // Aplicando adapter ao spinner
        spinnerVitaminas.setAdapter(staticAdapter1);

        // Spinner Minerais
        Spinner spinnerMinerais = (Spinner) findViewById(R.id.minerais);
        // Criando Spinner Padrão com array de string.
        ArrayAdapter<CharSequence> staticAdapter2 = ArrayAdapter
                .createFromResource(this, R.array.StringMinerais, R.layout.spinner_item);
        // Layout para escolhas.
        staticAdapter2
                .setDropDownViewResource(R.layout.spinner_dropdown_item);
        // Aplicando adapter ao spinner
        spinnerMinerais.setAdapter(staticAdapter2);


        // Spinner Vitaminas - Adicionando evento para seleção por ID.
        spinnerVitaminas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                // Pega nome pela posição
                vitamina = adapterView.getItemAtPosition(i).toString();

                switch (i) {
                    case 0:
                        //setar intent para mostrar os alimentos de acordo com a vitamina selecionada
                        break;
                    case 1:
                        //setar intent para mostrar os alimentos de acordo com a vitamina selecionada
                        Intent intentA = new Intent(MainActivity.this, ListActivityAlimentosVitaminaA.class);
                        startActivity(intentA);
                        MainActivity.this.finish();
                        break;
                    case 2:
                        //setar intent para mostrar os alimentos de acordo com a vitamina selecionada
                        Intent intentC = new Intent(MainActivity.this, ListActivityAlimentosVitaminaC.class);
                        startActivity(intentC);
                        MainActivity.this.finish();
                        break;
                    case 3:
                        //setar intent para mostrar os alimentos de acordo com a vitamina selecionada
                        Intent intentD = new Intent(MainActivity.this, ListActivityAlimentosVitaminaD.class);
                        startActivity(intentD);
                        MainActivity.this.finish();
                        break;
                    case 4:
                        //setar intent para mostrar os alimentos de acordo com a vitamina selecionada
                        Intent intentE = new Intent(MainActivity.this, ListActivityAlimentosVitaminaE.class);
                        startActivity(intentE);
                        MainActivity.this.finish();
                        break;
                    case 5:
                        //setar intent para mostrar os alimentos de acordo com a vitamina selecionada
                        Intent intentK = new Intent(MainActivity.this, ListActivityAlimentosVitaminaK.class);
                        startActivity(intentK);
                        MainActivity.this.finish();
                        break;
                    case 6:
                        //setar intent para mostrar os alimentos de acordo com a vitamina selecionada
                        Intent intentB = new Intent(MainActivity.this, ListActivityAlimentosComplexoB.class);
                        startActivity(intentB);
                        MainActivity.this.finish();
                        break;
                }
            }
            public void onNothingSelected(AdapterView<?> adapterView) {
                return;
            }

        });

        // Spinner Minerais - Adicionando evento para seleção por ID.
        spinnerMinerais.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                // Pega nome pela posição
                mineral = adapterView.getItemAtPosition(i).toString();

                switch (i) {
                    case 0:
                        //setar intent para mostrar os alimentos de acordo com os minerais
                        break;
                    case 1:
                        //setar intent para mostrar os alimentos de acordo com os minerais
                        Intent intentCalcio = new Intent(MainActivity.this, ListActivityAlimentosCalcio.class);
                        startActivity(intentCalcio);
                        MainActivity.this.finish();
                        break;
                    case 2:
                        //setar intent para mostrar os alimentos de acordo com os minerais
                        Intent intentFerro = new Intent(MainActivity.this, ListActivityAlimentosFerro.class);
                        startActivity(intentFerro);
                        MainActivity.this.finish();
                        break;
                    case 3:
                        //setar intent para mostrar os alimentos de acordo com os minerais
                        Intent intentProteina = new Intent(MainActivity.this, ListActivityAlimentosProteina.class);
                        startActivity(intentProteina);
                        MainActivity.this.finish();
                        break;
                }
            }
            public void onNothingSelected(AdapterView<?> adapterView) {
                return;
            }

        });
    }
}
