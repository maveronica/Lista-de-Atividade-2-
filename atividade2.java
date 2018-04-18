/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2;

import java.util.Scanner;

/**
 *
 * @author chave
 */
public class atividade2 {

    public static void main(String args[]) {
        float a, b, c = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ler lado 1");
        a = sc.nextFloat();
        System.out.println("Ler lado 2 ");
        b = sc.nextFloat();
        System.out.println("Ler lado 3");
        c = sc.nextFloat();

        if ((a == b) && (b == c)) {
            System.out.println("É um triângulo equilatero");
        }

        if ((a == b) && (b != c) || (b == c) && (c != a) || (a == c) && (c != a)) {
            System.out.println("É um triangulo isoceles");
        }

        if ((a != b) && (a != c) && (b != c) && (b != a) && (c != b) && (c != a)) {
            System.out.println(" É um triangulo escaleno ");
        }

    }

}
