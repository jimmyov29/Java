
package problema_3.pkg3;
import java.util.Scanner;
public class Problema_33 {

    public static void main(String[] args) {
        Scanner dato= new Scanner(System.in);
        System.out.println("escriba una frase cualquiera");
        String cadena = dato.nextLine();
        char arreglo[] = cadena.toCharArray();
        for (int i=0;i<arreglo.length ;i++)
        {
            if(arreglo[i]==' ')
            arreglo [i]='*';
            
        }
        cadena = String.valueOf(arreglo);
        System.out.println("la cadena alterada es "+cadena);
            
    }
    
}
