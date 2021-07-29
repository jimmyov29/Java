//arreglos bidimensionales
package jimmy;
public class Jimmy {

    public static void main(String[] args) {
    //arreglos bidimensionales
//formas de declarar: forma #1
//arreglo de enteros de 3 filas x 5 columnas sin llenar datos
    int arri[][] = new int[3][5];
    //arreglo de float de 5 filas x 2 columnas sin llenar datos
    float arrf[][]= new float[5][2];
    
    //forma numero #2
    //arreglo de enteros de 4 filas x 3 columnas con datos pre-establecidos
    int arri2[][]= {
        {1, 10, 100},
        {2, 20, 200},
        {3, 30, 300}
    };
    //arreglo de double de 2 filas x 2 columnas con datos prellenados
    double tablaz[][]= {
        {3, 4.5},
        {8.9, 10.10}
    };
    
    //reemplazo de valores en un arreglo existente
    arri2[2][0]=777; //fila 2, columna 3
    
    //imprimir un arreglo bidimensional (recorrer el arreglo) mediante un for anidado
    for ( int i=0; i<arri2.length;i++)    //for para recorrer las filas (arreglo principal)
    { 
        for(int j=0;j<arri2[i].length; j++)//<-ojo con el j++
        {
            System.out.print(arri2[i][j]+"\t"); //imprimir cada posicion i,j en el arreglo
        }
        //salto o cambio de fila
        System.out.println("");
    }
        System.out.println("****************");
        System.out.println(tablaz[1][1]);
        System.out.println(arri2[2][2]); //asi se escriben los valores
    
    }
}
