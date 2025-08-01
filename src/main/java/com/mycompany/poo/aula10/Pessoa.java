package com.mycompany.poo.aula10;

public class Pessoa {
    /**
     * Modificadores de Acesso
     * 
     * Quando trabalhamos com o conceito de POO, utilizamos modificadores de acesso,
     * para dar segurança para nossas classes.
     * 
     * Utilizamos elas como prefixo para:
     * -Classes
     * -Interface
     * -Atributos
     * -Métodos
     */

    public String nome; // Publico, é visivel em quarquer classe.
    protected int idade; // Protegido, é visivel somente em classes filhas (Herança)
    private double salario; // Privado, é visivel somente dentro da propria classe.
    double altura; // friendly ou Publico, apesar de não estar explicitado, ele também é visível.

    public void exibirDados() {
        System.out.println("--- Dados da pessoa ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura (m): " + altura);
    }
}
