
package problema_3.pkg4;

import java.util.Scanner;
public class Problema_34 {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        System.out.println("ingrese su nombre");
        String cadena = dato.nextLine();
        cadena= cadena.trim().toUpperCase();
        System.out.print("Sus iniciales son: ");
        System.out.print(cadena.charAt(0));
        char arreglo[]= cadena.toCharArray();
        for ( int i=0; i<arreglo.length;i++)
        {
       if(arreglo[i]==' ' )
                System.out.print(arreglo[i+1]);
            
        }
        System.out.println(" ");
        

    }
    
}
