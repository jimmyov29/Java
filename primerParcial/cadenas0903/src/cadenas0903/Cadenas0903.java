
package cadenas0903;

import java.util.Scanner; 
public class Cadenas0903 {

    public static void main(String[] args) {
        Scanner dato= new Scanner(System.in);
        String cadena = "El veloz murcielago Hindu comia feliz kiwi y cardillo";
        System.out.println("subcadena de 0 hasta 7: "+cadena.substring(0,7)); //incluye desde el 0-6, el septimo no lo inlcuye
        System.out.println("subcadena desde 6 hasta el 13: "+cadena.substring(6,13)); //incluye desde el 6-13, el 13 no lo inlcuye
        //hacer un programa que capture una cadena de texxto que pregunte un
        // numero entero, imprimir la cadena de texto a partir de la posicion
        //dado por dicho numero entero, hasta llegar al ultimo carcatrter de la misma
        //si el numero entero proporcionado es mas grande que la cantidad de 
        //carcarteres de la cadena, mostrar un mensasje: posicion no extiste.
        //resolverlo con substring
        
        String cadena1;
        System.out.println("Escriba una cadena");
        cadena1= dato.nextLine();
        System.out.println("escriba una posicion de incio: ");
        int pos= dato.nextInt();
        System.out.println("La cadena a partir de dicha posicion es: ");
        
        if (pos>=cadena1.length())   
            
            System.out.println("Posicion no extiste");
            
        else
        System.out.println(cadena1.substring(pos,cadena1.length() ) );
        
        //hacer un programa que pregunte el numero de cedula con guiones
        //el programa debe imprimir el año de nacimiento de la persona
        
        String cedula;
        System.out.println("Digitar una cedula hondureña con guines: ");
        dato.nextLine();
        cedula = dato.nextLine();
        String anioNacimiento;
        anioNacimiento =cedula.substring(5,9); //puede almacenar la subcadena en una nueva cadena
        System.out.println("año de nacimiento "+anioNacimiento);
        
   }
    
}
