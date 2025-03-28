package com.mycompany;

public class Aula01Variaveis {
    public static void main(String[] args) {
        //Variavel longica

        //Tipo primitivo
        boolean valorLogicoPrimitivo= true;
        //exibe valor
        System.out.println(valorLogicoPrimitivo);

        //Tipo abstrato
        Boolean valorLogicoAbstrato = false;
        System.out.println("o valor da variavel ValorLogicoAbstrato é: " + valorLogicoAbstrato);
        // Variáveis inteiras

        // Tipo primitivo 

        int valorInteiro = 10; // 32 bits
        long valorInteiroLongo = 10L; // 64 bits

        // Tipo abstrato
        Integer valorInteiroAbs = 20;
        Long valorLongoAbs = 20l;

        System.out.println("O valor de valorInteiro é: "+ valorInteiro +", e o valor de valorInteiroLongo é:" + valorInteiroLongo);

        //Variaveis decimais

        //Tipo primitivo
        float numeroFloat = 10.5f; // 32bits
        double numeroDouble = 10.5; // 64 bits

        //Tipo abstrato
        Float numeroFloatAbs = 10.5f;
        Double numeroDoubleAbs = 10.5;

        System.out.println("O valor de é  numeroFloat : "+ numeroFloat +", e o valor de numeroDouble é:" + numeroDouble);
    }
}
