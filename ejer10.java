package ejercicio1;

import java.util.Scanner;

/**
 * Desarrollar un programa que pida números pares mientras el usuario indique
 * que quiere seguir introduciendo números. Para indicar que quiere seguir
 * escribiendo números, el usuario deberá contestar Si a la pregunta. Contar
 * cuantos números pares se ha ingresado. 
 * Escriba un número par: 4 ¿Quiere
 * escribir otro número par? (Si/No): S 
 * Escriba un número par: 8 ¿Quiere
 * escribir otro número par? (Si/No): s 
 * Escriba un número par: 7 7 no es un
 * número par. Inténtelo de nuevo: 6 
 * ¿Quiere escribir otro número par? (Si/No):
 * N Ha escrito 3 números pares.
 *
 */
public class ejer10 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int num=0,cont=0;
        char op ;
        
        
        do {
            System.out.print("Escriba un número par");
        num = p.nextInt();
        
        if(num%2==0){
            cont++;
        }else{
            System.out.println("el numero "+num+" no es par. inetente de nuevo ");
            num = p.nextInt();
            cont++;
   
        } 
            System.out.println("¿Quiere escribir otro número par? (Si/No):");
            op = p.next().charAt(0);
        
        } while (op=='s');
        System.out.println("has escrito "+cont+" números pares.");
        
    }

}
