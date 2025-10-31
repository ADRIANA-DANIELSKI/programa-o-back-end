package com.mycompany.poo.recuperacao01;

public class Basquete extends Esporte {

    // Construtor chama o construtor da classe pai (Esporte)
    public Basquete() {
        super("Basquete", 5); // 5 jogadores por equipe
    }

    // Implementação do método abstrato
    public void iniciarPartida() {
        System.out.println(" Início da Partida de Basquete:");
        System.out.println("   -> A bola é jogada para o alto, começa o 'tip-off' e o jogo de basquete!");
    }
}