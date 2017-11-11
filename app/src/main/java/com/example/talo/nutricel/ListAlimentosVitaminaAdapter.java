package com.example.talo.nutricel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Silvia on 11/11/2017.
 */

public class ListAlimentosVitaminaAdapter extends ArrayAdapter<AlimentosVitamina> {

    private Context context;
    private List<AlimentosVitamina> alimentos = null;

    public ListAlimentosVitaminaAdapter(Context context, List<AlimentosVitamina> alimentos) {
        super(context,0, alimentos);
        this.alimentos = alimentos;
        this.context = context;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        AlimentosVitamina ali = alimentos.get(position);

        if(view == null)
            view = LayoutInflater.from(context).inflate(R.layout.item_list_alimento_vitamina, null);

        ImageView imageViewAlimento = (ImageView) view.findViewById(R.id.image_view_alimento);
        imageViewAlimento.setImageResource(ali.getImagem());

        TextView textViewNomeAlimento = (TextView) view.findViewById(R.id.text_view_nome_alimento);
        textViewNomeAlimento.setText(ali.getNome());

        TextView textViewVitamina = (TextView)view.findViewById(R.id.text_view_vitamina);
        String textoVitamina = "Vitamina Presente: " + String.valueOf(ali.getVitamina());
        textViewVitamina.setText(textoVitamina);

        TextView textViewQuantidade = (TextView)view.findViewById(R.id.text_view_quantidade);
        String textoQuantidade = "Quantidade: " + String.valueOf(ali.getQuantidade()) + " mg";
        textViewQuantidade.setText(textoQuantidade);

        return view;
    }
}