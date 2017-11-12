package com.example.talo.nutricel;

public class AlimentosVitamina {
    private int imagem;
    private String nome;
    public String vitamina;
    private double quantidade;
    private int porcao;

    public AlimentosVitamina() {
    }

    public AlimentosVitamina(String nome, String vitamina, double quantidade, int imagem, int porcao) {
        super();
        this.nome = nome;
        this.vitamina = vitamina;
        this.quantidade = quantidade;
        this.porcao = porcao;
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

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public int getPorcao() {
        return porcao;
    }

    public void setPorcao(int porcao) {
        this.porcao = porcao;
    }

    @Override
    public String toString() {
        return nome;
    }
}