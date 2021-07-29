/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jimmy;
import java.util.Random;
public class Jimmy {
    public static void main(String[] args) {
        int numero=0;
        Random azar = new Random(); 
        int arreglo[][]= new int [7][6];
        for (int i=0; i<arreglo.length;i++)
        {
        for (int j=0; j<arreglo[i].length;j++ ){
            arreglo[i][j] = azar.nextInt(75-4+1)+4;
            if(arreglo[i][j]%10==0)
                System.out.print("X");
            else
        System.out.print(arreglo[i][j]);
            System.out.print("\t"); //linea del tabulador
        }
        System.out.println(""); //linea nueva
        }
        
    }
    
}
