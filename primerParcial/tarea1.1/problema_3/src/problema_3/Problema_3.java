/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_3;

import java.util.Scanner;
public class Problema_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, num3, suma, prom, mult, mayor=0, menor=0;
    Scanner dato = new Scanner(System.in);
        System.out.println("Escriba el primer numero entero positvo");
        num1 = dato.nextInt();
        System.out.println("Escriba el segundo numero entero positivo");
        num2 = dato.nextInt();
        System.out.println("Escriba el tercer numero entero postivo");
        num3 = dato.nextInt();
        mult= num1*num2*num3;
        suma=num1+num2+num3;
        prom=(num1+num2+num3)/3;
        for (int i=0;i==num1 || i==num2 || i==num3; i=i+1 )
        if(num1<num2 && num1<num3)
            menor = num1;
        
        if (num2<num1 && num2<num3)
            menor = num2;
        
        if (num3<num1 && num3<num2)
            menor = num3;
         
        if(num1>num2 && num1>num3)
            mayor = num1;
        
        if (num2>num1 && num2>num3)
            mayor = num2;
        
        if (num3>num1 && num3>num2)
            mayor = num3;
                    
        
        
        System.out.println("la suma es "+suma);
        System.out.println("la multiplicacion es "+mult);
        System.out.println("el promedio es "+prom);
        System.out.println("el menor es "+menor);
        System.out.println("el mayor es "+mayor);
        
        
    }
    
}
