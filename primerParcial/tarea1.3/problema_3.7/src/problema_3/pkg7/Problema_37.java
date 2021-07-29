/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_3.pkg7;

import java.util.Scanner;
public class Problema_37 {

    
    public static void main(String[] args) {
        Scanner dato= new Scanner(System.in);
        int num;
        System.out.println("Escriba una cadena de texto");
        String cadena = dato.nextLine();
        System.out.println("Ingresar texto a incrustar");
        String texto = dato.nextLine();
        System.out.println("Ingresar posicion donde desea colocar el texto");
        num= dato.nextInt();
        dato.nextLine();
        char arreglo[]= cadena.toCharArray();
        char textarray[]= texto.toCharArray();
        for(int i=0;i<arreglo.length;i++)
        {
        if(arreglo[i] == num)
        {
        for(int j=0;j<textarray.length;j++)
                System.out.print(textarray[j]);
        }
        else
                System.out.print(arreglo[i]);
        }
        System.out.println("");
        
        
        
        
    }
    
}
