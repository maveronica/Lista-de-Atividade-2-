/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2;

import java.util.Scanner;

public class atividade1 {

    public static void main(String[] args) {
        int num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número");
        num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Número é par");

        } else {
            System.out.println("Número é impar");
        }
        if (num >= 0) {
            System.out.println("Número é positivo");
        } else {
            System.out.println("Número é negativo");
        }

    }
}
