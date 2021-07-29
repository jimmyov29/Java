
package jercicio.de.upper.y.lower.pkgcase;


public class JercicioDeUpperYLowerCase {

    public static void main(String[] args) {

       String cadena = "Jimmy Oliva";
       //obtenre un caracter que esta en determinada posicion 
        System.out.println("El caracter en la posicion #7 es "+cadena.charAt(7));
        System.out.println("El caracter en la posicion #0 es "+cadena.charAt(0));
        System.out.println("El caracter en la ultima posicion  es "+cadena.charAt(cadena.length()-1));
        //ponemos el .trim() para encontrar elcaracrter con charAt
        System.out.println("El caracter en la ultima posicion sin relleno es "+cadena.trim().charAt(cadena.trim().length()-1));
        

//recorrer una cadena caracter por carcter
        for (int i=0; i<cadena.length();i++)
        {
            System.out.println( cadena.charAt(i) );
            
        }
        System.out.println("*******************************");
        //recorrer una cadena caracter por caracter sin relleno
        for (int i=0; i<cadena.trim().length();i++)
        {
            System.out.println( cadena.trim().charAt(i) );
            
        }
    
    }
    
}
