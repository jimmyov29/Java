
package cadena0503tres;
import java.util.Scanner;
public class Cadena0503tres {

    public static void main(String[] args) {
    //hacer un programa con una cadena de texto que tenga la siguiente oracion:
    //yo [Nombre], mayor de edad, con numero de identidad [identidad], me comprometo
    //a pasar la clase
    
    //el programa le preguntara su nombre e identidad y posteriormente lo
    //reemplazara la plabra [nombre] y la palabra [identidad] con los valores 
    //leidos respectivos
    
    Scanner dato= new Scanner(System.in);
    String a = dato.nextLine();
    String b,c;
        System.out.println("yo [nombre], mayor de edad, con numero de identidad [identidad], me comprometo a pasar la clase");
        System.out.println("digite su nombre");
        b=dato.nextLine();
        System.out.println("Digite su numero de identidad");
        c=dato.nextLine();
        
        //hacer los reemplazos respectivos
        //primero el nombre
        a=a.replace("[nombre]", b);
        a=a.replace("[identidad]", c);
        System.out.println(a);
                
    }
    
}
