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
public class atividade3 {

    public static void main(String args[]) {
        double nota1;
        double nota2; 
        double nota3;
        double media;
        

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor  da 1ª nota");
        nota1 = sc.nextDouble();
        System.out.println("Digite o valor  da 2ª nota");
        nota2 = sc.nextDouble();
        System.out.println("Digite o valor  da 3ª nota");
        nota3 = sc.nextDouble();

        if  ((nota1>nota2)&&(nota1>nota3)) {
            System.out.println("Sua maior nota é:"+nota1);
            
        }
        else if ((nota2>nota1)&&(nota2> nota3)){
            System.out.println("Sua maior nota é:"+nota2);
            
        }
        else if ((nota3>nota1)&& (nota3>nota2)){
             System.out.println("Sua maior nota é:"+nota3);
        }
        
        media=(nota1+nota2+nota3)/3;        
       
        System.out.println("A média é: " + media);
    }

}
