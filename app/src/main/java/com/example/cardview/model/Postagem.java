package com.example.cardview.model;

public class Postagem {
    private String Nome;
    private String Descricao;
    private int Imagem;

    public Postagem() {
    }

    public Postagem(String nome, String descricao, int imagem) {
        Nome = nome;
        Descricao = descricao;
        Imagem = imagem;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public int getImagem() {
        return Imagem;
    }

    public void setImagem(int imagem) {
        Imagem = imagem;
    }
}
