
package cadena0903dos;
import java.util.Scanner;
public class Cadena0903dos {
    public static void main(String[] args) {
        //el uso de Split: devuelve unn arreglo de String, cadad elemento del arreglo
        //es una subcadena la cual es fragmentada a partir de la cadena original
        //cuando se ecnuentra cada una de las coincindencias de la cadena token
        //ejemplo: imprimir por separado las pabrass de una cadena de texto una por linea
        //tambien imprimir cuantas palabras tiene dicha cadena
        String cadena = "Hola soy una cadena de texto";
        String arreglo[]= cadena.split(" "); //observe que la cadena TOKEN estan espacio
        for (int i=0; i<arreglo.length; i++)
        {
            System.out.println("****"+arreglo[i]+"****");
        }
        System.out.println("la cadena tiene "+arreglo.length+" palabras");
        
        // otro ejemplo: usasr token con la palabra unah
        String str="123unah456unah789unah0";
        String arr[]= str.split("unah");
        for( int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i] );
        }
    }
    
}
