package com.mycompany.poo.recuperacao01;

public class App {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao Sistema de Eventos Esportivos da Escola!");
        System.out.println("--------------------------------------------------\n");

        // 1. Criar um objeto do tipo Futebol
        Futebol futebol = new Futebol();
        
        // Chamar os métodos
        futebol.exibirInformacoes();
        futebol.iniciarPartida();

        System.out.println();

        // 2. Criar um objeto do tipo Basquete
        Basquete basquete = new Basquete();
        
        // Chamar os métodos
        basquete.exibirInformacoes();
        basquete.iniciarPartida();
    }
}