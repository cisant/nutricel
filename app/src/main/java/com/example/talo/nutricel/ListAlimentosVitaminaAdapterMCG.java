package com.example.talo.nutricel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ListAlimentosVitaminaAdapterMCG extends ArrayAdapter<AlimentosVitamina> {

    private Context context;
    private List<AlimentosVitamina> alimentos = null;

    public ListAlimentosVitaminaAdapterMCG(Context context, List<AlimentosVitamina> alimentos) {
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

        TextView textViewPorcao = (TextView)view.findViewById(R.id.text_view_porcao);
        String textoPorcao = "Porção: "+ String.valueOf(ali.getPorcao()) + " gramas" ;
        textViewPorcao.setText(textoPorcao);

        TextView textViewVitamina = (TextView)view.findViewById(R.id.text_view_vitamina);
        String textoVitamina = "Nutriente: " + String.valueOf(ali.getVitamina());
        textViewVitamina.setText(textoVitamina);

        TextView textViewQuantidade = (TextView)view.findViewById(R.id.text_view_quantidade);
        String textoQuantidade = "Quantidade: " + String.valueOf(ali.getQuantidade()) + " mcg";
        textViewQuantidade.setText(textoQuantidade);

        return view;
    }
}