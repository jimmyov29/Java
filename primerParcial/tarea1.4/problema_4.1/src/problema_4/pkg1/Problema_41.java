package problema_4.pkg1;
import java.util.Scanner;
public class Problema_41 {
    public static void main(String[] args) {
        Scanner dato= new Scanner(System.in);
        String correo;
        int novalido=0,arroba=0,contpunto=0;
        
        System.out.println("preferiblemente siga las indicaciones");
        System.out.println("1) solo puede contener una ARROBA"); 
        System.out.println("2) a la derecha de la arroba no puede usar mas de dos veces el punto");
        System.out.println("3) no puede llevar simbolos como # $");
        System.out.println("En caso de no seguir las instrucciones, no será aceptado");
        System.out.println("Digite su correo electronico nuevo");
        correo=dato.nextLine();
        char arreglo[]=correo.toCharArray();
        //codigo para descartar los caracteres no validos ni @@ o ningun arroba
        for(int i=0;i<correo.length();i++)
        {
            if(arreglo[i]=='#'||arreglo[i]=='$'||arreglo[i]=='&'){
                novalido++;}
            if(arreglo[i]=='@'){
                arroba++;}  
        }
        
        if(arroba==1)
        {      
            String[] cadena= correo.split("@",correo.length());
            //System.out.println("la primera parte es "+cadena[0]+" la otra es "+cadena[1]);
            char arreglo2[]=cadena[1].toCharArray();
            for(int j=0;j<arreglo2.length;j++)
                {
                    if(arreglo2[j]=='.')
                        contpunto++;
                }
        }
        else
            System.out.print("");
        
        if(novalido==0&& arroba==1 )
        {
        if(contpunto==2||contpunto==1)
            System.out.println("el correo es valido");
        if(contpunto==0||contpunto>2)
                System.out.println("el correo es invalido");
        }  
        else
            System.out.println("el correo es invalido");
           
}
}
            

