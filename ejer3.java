package ejercicio1;

import java.util.Scanner;

/**
 * /**
 * Realice un programa que permita al usuario elegir la dimensión o el tamaño
 * del vector, luego ingresar esa cantidad de números en un vector. El programa
 * deberá imprimir la cantidad de múltiplos de 5 que contiene ese vector. Y en
 * otro vector invertir el orden de los números e imprimirlo. Por ejemplo, en el
 * caso de ingresar los números 10 11 23 8 3, deberá imprimir que existe 1
 * múltiplo de 5 y el orden invertido seria 3 8 23 11 10.
 *
 * @author joseluis
 */
public class ejer3 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int n = 0, multiplos = 0;

        System.out.println("cuantos datos: ");
        n = p.nextInt();
        int vec[] = new int[n];

        for (int i = 0; i < vec.length; i++) {
            System.out.print(+(i + 1) + ".-ingrese los numeros: ");
            vec[i] = p.nextInt();
            if (vec[i] % 5 == 0) {
                multiplos++;
            }

        }
        System.out.println("multiplos de 5 que hay en ese vector: "+multiplos);
        
        for (int i = vec.length-1; i>=0 ; i--) {
            System.out.println("orden ivertido: "+vec[i]);
            
        }

    }

}
