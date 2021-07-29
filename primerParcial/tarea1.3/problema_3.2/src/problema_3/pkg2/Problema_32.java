
package problema_3.pkg2;
import java.util.Scanner;
public class Problema_32 {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        String cadena;
        int va=0,ve=0,vi=0,vo=0,vu=0;
        System.out.println("Escriba un texto");
        cadena = dato.nextLine();
        cadena=cadena.toLowerCase();
        char arreglo[] = cadena.toCharArray();
        for (int i=0;i<cadena.length();i++)
        {
            if(arreglo[i]== 'a' )
                va=va+1;
            if(arreglo[i]== 'e' )
                ve++;
            if(arreglo[i]== 'i' )
                vi++;
            if(arreglo[i]== 'o' )
                vo++;
            if(arreglo[i]== 'u' )
                vu++;
            
        }
        System.out.println("VOCALES CANTIDAD");
        System.out.println("A=   "+va);
        System.out.println("E=   "+ve);
        System.out.println("I=   "+vi);
        System.out.println("O=   "+vo);
        System.out.println("U=   "+vu);
        
        }
    }
    

