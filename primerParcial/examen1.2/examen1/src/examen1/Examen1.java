/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

import java.util.Scanner;
public class Examen1 {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        String cadena;
        int cont=1;
        
        System.out.println("Escriba una cadena");
        cadena = dato.nextLine();
        char arreglo[]= cadena.toCharArray();
        cadena=cadena.trim();
        
        
        for (int i=0;i< cadena.length();i++)
        {
            if (arreglo[i] == ' ')
                cont=cont+1;
        }
        System.out.println("La cantidad de palabras son: "+cont);
        
    }
    
}
