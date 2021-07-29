/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_3.pkg8;
import java.util.Scanner;
public class Problema_38 {

    public static void main(String[] args) {
        //Escribir dos cadenas cualquiera y se imprimiran cuantas vocales tiene cada, seguido de como son las cadenas al reves
        //y por ultimo cuals es mas grande
        int vocales1=0, vocales2=0, mayor=0;
        Scanner dato= new Scanner(System.in);
        System.out.println("Escriba la primer cadena ");
        String cadena1= dato.nextLine();
        System.out.println("Escriba la segunda cadena");
        String cadena2= dato.nextLine();
        cadena1= cadena1.trim().toLowerCase();
        cadena2= cadena2.trim().toLowerCase();
        System.out.println("");
        char arreglo1[]= cadena1.toCharArray();
        char arreglo2[]= cadena2.toCharArray();
        for(int j=0;j<arreglo1.length;j++)
        {
        if(arreglo1[j]=='a'||arreglo1[j]=='e'||arreglo1[j]=='i'||arreglo1[j]=='o'||arreglo1[j]=='u')
          vocales1=vocales1+1;
        }
        System.out.println("la primer cadena tiene "+vocales1+" vocales");
        
        for(int j=0;j<arreglo2.length;j++)
        {
        if(arreglo2[j]=='a'||arreglo2[j]=='e'||arreglo2[j]=='i'||arreglo2[j]=='o'||arreglo2[j]=='u')
          vocales2=vocales2+1;
        }
        System.out.println("la segunda cadena tiene "+vocales2+" vocales");
        System.out.println("");
        System.out.println("tambien se mostraremos la cadena mayor en mayuscula y la menor en minuscula");
        if(cadena1.length()>cadena2.length()){
            System.out.println("y por lo visto la primer cadena es mayor asi que");
            System.out.println(cadena1.trim().toUpperCase());
            System.out.println(cadena2.trim().toLowerCase());
        
        }
        if(cadena1.length()==cadena2.length()){
            System.out.println("y por lo visto ambas cadenas tienen la misma longitud asi que ambas en mayuscula");
            System.out.println(cadena1.trim().toUpperCase());
            System.out.println(cadena2.trim().toUpperCase());
            
        }
        if(cadena1.length()<cadena2.length()){
            System.out.println("y por lo visto la segunda cadena es mayor");
            System.out.println(cadena2.trim().toUpperCase());
            System.out.println(cadena1.trim().toLowerCase());
        
        }
        System.out.println("");
        System.out.println("por pura curiosidad mostraremos ambas cadena al reves");
        System.out.print("La primer cadena al reves seria: ");
        for(int j=arreglo1.length-1;j>=0;j--)
        {
            System.out.print(arreglo1[j]);
        }
        System.out.println("");
        System.out.print("La segunda cadena al reves seria: ");
        for(int j=arreglo2.length-1;j>=0;j--)
        {
            System.out.print(arreglo2[j]);
        }
        System.out.println("");
       

    }
    
}
