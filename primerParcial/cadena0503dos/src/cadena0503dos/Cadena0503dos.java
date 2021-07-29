/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadena0503dos;

/**
 *
 * @author lab.unahvs
 */
public class Cadena0503dos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //uso de la funcion replace
        //reemplaza todas las coincidencia de una cadena b dentro
        //de una cadena A
        String a,b,c;
        a ="La manzana roja es igual de colorida que la fresa roja";
        b ="roja";
        c ="verde";
        //dentro de la cadena A reemplzara cadad coincidencia b por c
        //cuando encuentre b, lo cambiara por c (rojo por verde)
        a= a.replace(b,c);
        System.out.println(a);
        
    }
    
}
