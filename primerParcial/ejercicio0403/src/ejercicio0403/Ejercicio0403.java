/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio0403;

public class Ejercicio0403 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String a = "Pera", b= "pera", c= "pera";
     //comparar dos cadenas
     if (a.equals(b)== true)
     {
         System.out.println("a y b son iguales");
     }
     else
            System.out.println("a y  b no son iguales");
     if(a.equals(c)== true)
         {
         System.out.println("a y c son iguales");
     }
     else
            System.out.println("a y  c no son iguales");
     
     if(b.equals(c)== true)
         {
         System.out.println("b y c son iguales");
     }
     else
            System.out.println("b y  c no son iguales");
     if(a.equalsIgnoreCase(b)== true)
         {
         System.out.println("a y b son iguales");
     }
     else
            System.out.println("a y  b no son iguales");
     
    }
    
}
