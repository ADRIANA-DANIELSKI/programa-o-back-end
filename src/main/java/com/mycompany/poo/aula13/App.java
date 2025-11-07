package com.mycompany.poo.aula13;

import com.mycompany.poo.aula13.animais.Animal;
import com.mycompany.poo.aula13.animais.Golfinho;
import com.mycompany.poo.aula13.animais.Leao;
import com.mycompany.poo.aula13.veiculos.CarroAutomatico;
import com.mycompany.poo.aula13.veiculos.CarroManual;

public class App {
    public static void main(String[] args) {
        Animal leao = new Leao("Mufasa", 2, 120);
        System.out.printf("%s é um animal da espécie Leão de %.1fm de altura, e pesa %.1fKg\n",
                leao.getNome(), leao.getAltura(), leao.getPeso());

                leao.emitirSom();
                leao.mover();

                Animal golfinho = new Golfinho();
                golfinho.setNome("Willy");
                golfinho.setAltura(1.97);
                golfinho.setPeso(80);
                golfinho.emitirSom();
                golfinho.mover("sul");

                System.out.println("---interfaces---");

                CarroManual manual= new CarroManual();
                manual.seguirEmFrente();
                manual.estacionar();

                CarroAutomatico automatico = new CarroAutomatico();
                automatico.seguirEmFrente();
                automatico.re();
                automatico.estacionar();
    }
}
