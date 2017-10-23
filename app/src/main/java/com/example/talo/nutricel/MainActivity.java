package com.example.talo.nutricel;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

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
                .createFromResource(this, R.array.StringVitaminas, android.R.layout.simple_spinner_item);
        // Layout para escolhas.
        staticAdapter1
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Aplicando adapter ao spinner
        spinnerVitaminas.setAdapter(staticAdapter1);


        // Spinner Minerais
        Spinner spinnerMinerais = (Spinner) findViewById(R.id.minerais);
        // Criando Spinner Padrão com array de string.
        ArrayAdapter<CharSequence> staticAdapter2 = ArrayAdapter
                .createFromResource(this, R.array.StringMinerais, android.R.layout.simple_spinner_item);
        // Layout para escolhas.
        staticAdapter2
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Aplicando adapter ao spinner
        spinnerMinerais.setAdapter(staticAdapter2);


        // Spinner Vitaminas - Adicionando evento para seleção por ID.
        spinnerVitaminas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                // Pega nome pela posição
                vitamina = adapterView.getItemAtPosition(i).toString();

                // Imprime um Toast na tela com a vitamina selecionada
                Toast.makeText(MainActivity.this, "Vitamina Selecionada: " + vitamina, Toast.LENGTH_LONG).show();
                switch (i) {
                    case 0:
                        //setar intent para mostrar os alimentos de acordo com as vitaminas
                        break;
                    case 1:
                        //setar intent para mostrar os alimentos de acordo com as vitaminas
                        break;
                    case 2:
                        //setar intent para mostrar os alimentos de acordo com as vitaminas
                        break;
                    case 3:
                        //setar intent para mostrar os alimentos de acordo com as vitaminas
                        break;
                    case 4:
                        //setar intent para mostrar os alimentos de acordo com as vitaminas
                        break;
                    case 5:
                        //setar intent para mostrar os alimentos de acordo com as vitaminas
                        break;
                    case 6:
                        //setar intent para mostrar os alimentos de acordo com as vitaminas
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

                // Imprime um Toast na tela com o mineral escolhido
                Toast.makeText(MainActivity.this, "Mineral Selecionado: " + mineral, Toast.LENGTH_LONG).show();
                switch (i) {
                    case 0:
                        //setar intent para mostrar os alimentos de acordo com os minerais
                        break;
                    case 1:
                        //setar intent para mostrar os alimentos de acordo com os minerais
                        break;
                    case 2:
                        //setar intent para mostrar os alimentos de acordo com os minerais
                        break;
                    case 3:
                        //setar intent para mostrar os alimentos de acordo com os minerais
                        break;
                    case 4:
                        //setar intent para mostrar os alimentos de acordo com os minerais
                        break;
                    case 5:
                        //setar intent para mostrar os alimentos de acordo com os minerais
                        break;
                    case 6:
                        //setar intent para mostrar os alimentos de acordo com os minerais
                        break;
                }
            }
            public void onNothingSelected(AdapterView<?> adapterView) {
                return;
            }

        });
    }
}
