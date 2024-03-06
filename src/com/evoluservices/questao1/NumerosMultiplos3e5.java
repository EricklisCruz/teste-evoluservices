package com.evoluservices.questao1;

public class NumerosMultiplos3e5 {

    private final String tico = "Tico";
    private final String teco = "Teco";
    private final String ticoTeco = "TicoTeco";

    public NumerosMultiplos3e5() {
    }

    public void ticoTeco() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(getNumero(i));
        }
    }

    public String getNumero(int number) {

        if (number % 3 == 0 && number % 5 == 0) {
            return ticoTeco;
        } else if (number % 3 == 0) {
            return tico;
        } else if (number % 5 == 0) {
            return teco;
        } else {
            return String.valueOf(number);
        }
    }
}
