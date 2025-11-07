package com.mycompany.poo.aula13.veiculos;

public class CarroAutomatico implements Veiculo{

    @Override
    public void seguirEmFrente() {
        System.out.println("colocar em D e acelerar");
    }

    @Override
    public void estacionar() {
        System.out.println("manobrar o veiculo na vaga, colocar em p e opuxar o freio de mão");
    }

    @Override
    public void re() {
        System.out.println("colocar em ré");
    }

}
