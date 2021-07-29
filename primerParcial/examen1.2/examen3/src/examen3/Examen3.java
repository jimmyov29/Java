/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen3;
import java.util.Scanner;
public class Examen3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dato= new Scanner(System.in);
        String cadena;
        System.out.println("escriba una cadena de texto");
        cadena= dato.nextLine();
        char arreglo[]= cadena.toCharArray();
        for(int i=cadena.length()-1;i>=0 ;i--)
        {
            System.out.print(arreglo[i]);
        }
        
         
        
    }
    
}
