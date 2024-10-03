/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject5;

import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class Mavenproject5 {

    public static void main(String[] args) {
     Scanner leia = new Scanner(System.in);
     int numero;
     System.out.println("digite um número");
     numero = leia.nextInt();
     for(int i=1;i <= 10;i++){
     int tabuada = numero * i;
     System.out.println(tabuada);
    }
     leia.close();
     }
}

