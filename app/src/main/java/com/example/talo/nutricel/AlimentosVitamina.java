package com.example.talo.nutricel;

/**
 * Created by Silvia on 11/11/2017.
 */

public class AlimentosVitamina {
    private int imagem;
    private String nome;
    public String vitamina;
    private int quantidade;

    public AlimentosVitamina() {
    }

    public AlimentosVitamina(String nome, String vitamina, int quantidade, int imagem) {
        super();
        this.nome = nome;
        this.vitamina = vitamina;
        this.quantidade = quantidade;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getVitamina() {
        return vitamina;
    }

    public void setVitamina(String nome) {
        this.vitamina = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    @Override
    public String toString() {
        return nome;
    }
}