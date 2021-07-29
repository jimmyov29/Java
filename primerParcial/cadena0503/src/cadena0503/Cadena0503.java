
package cadena0503;

public class Cadena0503 {

    public static void main(String[] args) {
        //como reemplazar un chart dentro de una cadena
        String cadena= "Jimmy Oliva Ventura";
        //ejemplo reemplazar todos los espacios por guiones bajos
        //1 convertir la cadena en un arreglo de objetos char
        char arreglo[]= cadena.toCharArray();
        //ahora cada caracter de la cadena ocupa una posicion
        //dentro del arreglo de char
        //2 recorrer el arreglo y reemplazar los char deseados
        for (int i=0; i<arreglo.length;i++)
        {
        //si el i-esimo elemento del arreglo es un espacio en blanco
            if (arreglo[ i ] ==' ') 
            
            arreglo[i] = '_'; 
        //reemplazar el espacio por el guion bajo    
         }
        cadena= String.valueOf(arreglo);
        // 3 devolver el arreglo alterado de nuevo hacia la cadena
        System.out.println("la cadena de texto alterada es: "+cadena);
    }
    
}
