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
public class atividade4 {

    public static void main(String[] args) throws IOException {
        int c1;
        int c2;
        int c3;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro Algoritmo ");
        c1 = sc.nextInt();
        System.out.println("Digite o segundo Algoritmo");
        c2 = sc.nextInt();
        System.out.println("Digite o terceiro Algoritmo");
        c3 = sc.nextInt();

        System.out.println("Acrecente 'C ' para crescente ou 'D' para descrecente:");
        char cod = (char) System.in.read();

        if (cod == 'c') {
            if ((c1 >= c2) && (c2 >= c3) && (c1 >= c3)) {
                System.out.println("A ordem crescente é" + c3 + '-' + c2 + '-' + c1);

            } else if ((c1 >= c3) && (c3 >= c2) && (c1 >= c2)) {
                System.out.println("A ordem crescente é: " + c2 + '-' + c3 + '-' + c1);

            } else if ((c3 >= c1) && (c3 >= c2) && (c2 >= c1)) {
                System.out.println("A ordem crescente é: " + c2 + '-' + c1 + '-' + c3);

            } else if ((c3 >= c2) && (c3 >= c1) && (c2 >= c1)) {
                System.out.println("A ordem crescente é: " + c1 + '-' + c2 + '-' + c3);
                
            } else if ((c2 >= c1) && (c2 >= c3) && (c3 > c1)) {
                System.out.println("A ordem crescente é: " + c3 + '-' + c1 + '-' + c2);

            } else if ((c2 >= c1) && (c2 >= c3) && (c1 >= c3)) {
                System.out.println("A ordem crescente é: " + c1 + '-' + c3 + '-' + c2);

            }
             if (cod == 'd') {
            if ((c1 >= c2) && (c2 >= c3) && (c1 >= c3)) {
                System.out.println("A ordem crescente é" + c1 + '-' + c2 + '-' + c3);

            } else if ((c1 >= c3) && (c3 >= c2) && (c1 >= c2)) {
                System.out.println("A ordem crescente é: " +  c1+ '-' + c3 + '-' + c2);

            } else if ((c3 >= c1) && (c3 >= c2) && (c2 >= c1)) {
                System.out.println("A ordem crescente é: " + c3 + '-' + c2 + '-' + c1);

            } else if ((c3 >= c2) && (c3 >= c1) && (c2 >= c1)) {
                System.out.println("A ordem crescente é: " + c3 + '-' + c1 + '-' + c2);
                
            } else if ((c2 >= c1) && (c2 >= c3) && (c3 > c1)) {
                System.out.println("A ordem crescente é: " + c2 + '-' +c1 + '-' + c3);

            } else if ((c2 >= c1) && (c2 >= c3) && (c1 >= c3)) {
                System.out.println("A ordem crescente é: " + c2 + '-' + c3 + '-' + c1);
        }
             }
        }
    }
}

        


