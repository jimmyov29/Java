/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

import java.util.Scanner;

public class Examen2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dato= new Scanner(System.in);
        System.out.println("escriba una frase cualquiera");
        String cadena = dato.nextLine();
        char arreglo[] = cadena.toCharArray();
        for (int i=0;i<arreglo.length ;i++)
        {
            if(arreglo[i]==' ')
            arreglo [i]='*';
        }
        
        cadena = String.valueOf(arreglo);
        System.out.println("la cadena alterada es: "+cadena);
    }
    
}
