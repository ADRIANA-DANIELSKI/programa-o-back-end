package com.mycompany.poo.recuperacao01;

public class Futebol extends Esporte {

    // Construtor chama o construtor da classe pai (Esporte)
    public Futebol() {
        super("Futebol", 11); // 11 jogadores por equipe
    }

    // Implementação do método abstrato
    public void iniciarPartida() {
        System.out.println(" Início da Partida de Futebol:");
        System.out.println("   -> O juiz apita e a bola começa a rolar!");
    }
}