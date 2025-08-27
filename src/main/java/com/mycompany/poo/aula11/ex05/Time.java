package com.mycompany.poo.aula11.ex05;

public class Time {

    private String nome;
    private String abreviacao;
    private int torcida;
    private String estado;
    private String cidade;

    // Declaramos sempre após a declaração dos atributos

    // Método acessor, sempre começa com get
    public String getNome() {
        return nome;
    }

    // Método modificador, sempre começa com set
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAbreviacao() {
        return abreviacao;
    }

    public void setAbreviacao(String abreviacao) {
        this.abreviacao = abreviacao;
    }

    public int getTorcida() {
        return torcida;
    }

    public void setTorcida(int torcida) {
        this.torcida = torcida;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

}