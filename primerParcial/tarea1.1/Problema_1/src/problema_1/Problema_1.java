package problema_1;
import java.util.Scanner;
public class Problema_1 {
    public static void main(String[] args) {
        int num1, num2,suma,resta,div,mult;
       Scanner dato = new Scanner(System.in);
        
       
       System.out.println("Escriba el primer numero entero");
        num1 = dato.nextInt();
        System.out.println("Escriba el segundo numero entero");
        num2 = dato.nextInt();
        suma= num1+num2;
        resta= num1-num2;
        div = num1/num2;
        mult = num1*num2;
        System.out.println("el resultado de la suma es "+suma);
        System.out.println("el resultado de la multiplicacion es "+mult);
        System.out.println("el resultado de la resta es "+resta);
        System.out.println("el resultado de la division es "+div);
       
    }
    
}
