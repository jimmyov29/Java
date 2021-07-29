/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porblema_2;

import java.util.Scanner;
public class Porblema_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner dato = new Scanner(System.in);
    int num1, num2;    
    System.out.println("Escriba el primer numero entero");
        num1 = dato.nextInt();
    System.out.println("Escriba el segundo numero entero");
        num2 = dato.nextInt();
        if (num1==num2)
            System.out.println("Estos numero son iguales");
        
        if (num1> num2)
            System.out.println(+num1+" es mas grande");
        if (num2> num1)
            System.out.println(+num2+" es mas grande");
        
    
    }
    
}
