/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author chave
 */
public class atividade5 {

    public static void main(String[] args) throws IOException {
        double n1, n2, n3, soma, media, multip;

        Scanner sc = new Scanner(System.in);

        System.out.println("digite o 1º número");
        n1 = sc.nextDouble();
        System.out.println("digite o 2º número");
        n2 = sc.nextDouble();
        System.out.println("digite o 3º número ");
        n3 = sc.nextDouble();

        System.out.println("Acrecente 'S' para soma, 'D'  para multiplicação ou 'M' para média :");
        char cod = (char) System.in.read();

        if (cod == 's') {
            soma = n1 + n2 + n3;
            System.out.println("A soma dos numeros é:" + soma);
        }
        if (cod == 'd') {
            multip = (n1 * n2) * n3;
            System.out.println("A multiplicação dos numeros é:" + multip);
        }
        if (cod == 'm') {
            media = (n1 + n2 + n3) / 3;
            System.out.println("A média dos numeros é:" + media);

        }

    }
}
