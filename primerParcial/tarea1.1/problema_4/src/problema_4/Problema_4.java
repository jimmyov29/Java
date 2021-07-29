/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_4;

import java.util.Scanner;
public class Problema_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner dato = new Scanner(System.in);
    int n1,n2,n3,n4,n5,mayor=0,menor=0;
    
        System.out.println("Escriba el primer numero");
        n1 = dato.nextInt(); 
        System.out.println("Escriba el segundo numero");
        n2 = dato.nextInt();
        System.out.println("Escriba el tercer numero");
        n3 = dato.nextInt();
        System.out.println("Escriba el cuarto numero");
        n4 = dato.nextInt();
        System.out.println("Escriba el quinto numero");
        n5 = dato.nextInt();
        if (n1<n2 && n1<n3 && n1<n4 && n1<n5)
            menor = n1;
        if (n2<n1 && n2<n3 && n2<n4 && n2<n5)
            menor = n2;
        if (n3<n1 && n3<n2 && n3<n4 && n3<n5)
            menor = n3;
        if (n4<n1 && n4<n3 && n4<n2 && n4<n5)
            menor = n4;
        if (n5<n1 && n5<n2 && n5<n3 && n5<n4)
            menor = n5;
        
        if (n1>n2 && n1>n3 && n1>n4 && n1>n5)
            mayor = n1;
        if (n2>n1 && n2>n3 && n2>n4 && n2>n5)
            mayor = n2;
        if (n3>n1 && n3>n2 && n3>n4 && n3>n5)
            mayor = n3;
        if (n4>n1 && n4>n3 && n4>n2 && n4>n5)
            mayor = n4;
        if (n5>n1 && n5>n2 && n5>n3 && n5>n4)
            mayor = n5;
        System.out.println("el numero mayor es "+mayor);
        System.out.println("el numero menor es "+menor);
    }
    
}
