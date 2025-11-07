package com.mycompany.poo.aula13.veiculos;

public class CarroManual implements Veiculo {

    @Override
    public void seguirEmFrente() {
        System.out.println("pisar na embreagem, colocar na 1ª marcha e acelerar");
    }

    @Override
    public void estacionar() {
        System.out.println("manobrar o veiculo na vaga, pisar na embreagem, colocar na 1ª marcha e puxar o freio de mão");
    }

    @Override
    public void re() {
        System.out.println("pisar na embreagem e colocar em marcha ré");
    }

}
