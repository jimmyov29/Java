/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_3.pkg6;
import java.util.Scanner;
public class Problema_36 {

    public static void main(String[] args) {
        Scanner dato= new Scanner(System.in);
        
        
        System.out.println("Escriba una cadena");
        String cadena =dato.nextLine();
        String arreglo[] = cadena.split(" ");
        
        for(int i=arreglo.length-1;i>=0;i--)
        {
            System.out.print(arreglo[i]+" " );
        
        }
    }
    
}
