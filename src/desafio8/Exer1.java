/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio8;

import java.text.DecimalFormat;

/**
 *
 * @author Lucas
 */
public class Exer1 {
    public static void main(String[] args) {
        double contChico, contZe, anos;
        contChico = 1.50;
        contZe = 1.10;
        anos = 0;
        DecimalFormat f = new DecimalFormat("0.00");
        while (contChico >= contZe) {
            System.out.println("Zé terminou em " + f.format(contZe));
            System.out.println("Chico terminou em " + f.format(contChico));
            contChico = contChico + 0.02;
            contZe = contZe + 0.03;
            anos++;

        }

        System.out.println("zé levou " + anos + " anos para ser"
                + " maior que Chico");

        System.out.println("Zé terminou em " + f.format(contZe));
        System.out.println("Chico terminou em " + f.format(contChico));
    }

}
