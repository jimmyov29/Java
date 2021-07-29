/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jimmy;
import java.util.Scanner;
public class Jimmy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //declaracion de cadena de texto
    String variable1;
    String variable2 = "Hola soy Jimmy";
    String a = "Jimmy";
    String b ="Ingenieria en Sistemas";
    String c = "Mi nombre es "+a+" estudio "+b;
    //imprimir cadena
        System.out.println(c);
        int x=12;
        float y =13.3f;
        double z= 3.1516;
        String cadenax= String.valueOf(x); //convertir de entero a cadena
        String cadenay= String.valueOf(y);//convertir de entero a cadena
        String cadenaz= String.valueOf(z);//convertir de entero a cadena
        
        //String cadenaalgo =x no puede asingar un int pura a una cadena
        String cadenalgo2 =cadenax;
        
        //cadena a numero
        String r = "5.456";  String q = "2";
        
        
        //Conversiones
        int r1;  float r2;  double r3;
        //r1 no puedo colocar un string dentro de un int
        
        r1 = Integer.parseInt(r); //convertir String a Int
        System.out.println(r1);
        
        r2= Float.parseFloat(r); //convertir String a float
        System.out.println(r2);
        
        r3 =Double.parseDouble(r); //convertir String a Double
        System.out.println(r3);
        
        //Captura de cadenad de texto
        Scanner s = new Scanner(System.in);
        String n1,n2; //para fins de experimento los numeros los pondremos en string
        
        System.out.println("Digitar el primer numero");
        n1= s.nextLine();// con ese comando se captura los datos con String
        System.out.println("Digitar el segundo numero");
        n2= s.nextLine();
        
        //mostrar la suma
        System.out.println("la suma de "+n1+" y de "+n2+" es igual a "+((Integer.parseInt(n1))+(Integer.parseInt(n2))));
        
    
        
    }
    
}
