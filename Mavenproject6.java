/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject6;

import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class Mavenproject6 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero;
        System.out.println("Digite um número");
        numero = leia.nextInt();
        for(int i = 1;i <=numero;i++){
        int quadrado = i * i;
        System.out.println(quadrado);
        }
        leia.close();
    }
}
