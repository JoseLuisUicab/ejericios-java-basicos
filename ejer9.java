package ejercicio1;

import java.util.Scanner;

/**
 * @author hola me pueden ayudar con este ejercicio por favor Indique cuantos
 * caracteres tiene el nombre ALEJANDRA.
 */
public class ejer9 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in); 
        
        String nombre = "ALEJANDRA";
        int cont=0;
        
        cont = nombre.length();
        
        System.out.println("el nombre "+nombre+" tiene : "+cont+" caracteres");
        
        
    }

}
