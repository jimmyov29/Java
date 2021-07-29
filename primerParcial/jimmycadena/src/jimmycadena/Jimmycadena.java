/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jimmycadena;
import java.util.Scanner;
public class Jimmycadena {

    public static void main(String[] args) {
       Scanner dato = new Scanner(System.in);
        System.out.println("Digite una cadena de texto");
        String cadena1= dato.nextLine();
        
        System.out.println("la cadena en Minuscula es: "+cadena1.toLowerCase());
        System.out.println("la cadena en Mayuscula es: "+cadena1.toUpperCase());
        System.out.println("la cadena es: "+cadena1);
        // para cambiar la cadena definitivamente es:
        cadena1= cadena1.toUpperCase();
        System.out.println("la cadena ahora es: "+cadena1);
        

    }
    
}
