/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadena0403;
import java.util.Scanner;
public class Cadena0403 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        
        System.out.println("digite una cadena");
     String cadena = dato.nextLine();
     
     for( int i=0 ; i<cadena.length();i++ )
     {
        System.out.print(cadena.charAt(i)+"***");
     }
             System.out.println("");
        int op=0;     
        System.out.println("1) convertir una cadena a mayusculas");
        System.out.println("2) contar los caracteres de una cadena");
        System.out.println("3) Salir");
        op=dato.nextInt();
        
        if (op==1)
        {
            System.out.println("Ingrese una cadena");
            dato.nextLine();//con este comando desbuggeamos el crash que ocurre al no leer la cadena
            String cadena1 = dato.nextLine();
            System.out.println("la cadena en mayuscula es: "+cadena1.toUpperCase());
        }
        if(op==2)
        {
            System.out.println("digite una cadena");
            dato.nextLine();//con este comando desbuggeamos el crash que ocurre al no leer la cadena
            String cadena1= dato.nextLine();
            System.out.println("el numero de digitos es: "+cadena1.trim().length());
        }
        
        
    }
    
}
