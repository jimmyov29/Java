/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_5;

import java.util.Scanner;
public class Problema_5 {
    public static void main(String[] args) {
      Scanner dato = new Scanner(System.in);
      int par,impar, numero=0;
        System.out.println("Escriba dos numero diferentes");
        numero = dato.nextInt();
      if (numero%2==0)
          System.out.println("es par");
      else 
          System.out.println("es impar");
        
    }
    
}
