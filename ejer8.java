package ejercicio1;

import java.util.Scanner;

/*introducir tu nombre y indicar si la primera letra de tu nombre es vocal o consonante
indicar si tu nombre es mayor a tu apellido o tu apellido es mayor que tu 
nombre o ambos son de igual longitud
autor: jose luis */
public class ejer8 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        String nombre[] = new String[1];
        String ape[] = new String[1];

        int nom = 0, ap = 0;
        for (int i = 0; i < nombre.length; i++) {
            System.out.println("TU nombre: ");
            nombre[i] = p.nextLine();
            nom = nombre[i].length();
            System.out.println("TU apellido: ");
            ape[i] = p.nextLine();
            ap = ape[i].length();

            if (nom < ap) {
                System.out.println("tu Nmbre: " + nombre[i] + " tiene menor longitud que tu apellido: " + ape[i]);
            } else if (nom == ap) {
                System.out.println("Tu nombre: " + nombre[i] + " tiene igual longitud a tu apellido: " + ape[i]);
            } else if (nom > ap) {
                System.out.println("Tu nombre: " + nombre[i] + " tiene mayor longtud que  tu apellido: " + ape[i]);

            }
            if (nombre[i].charAt(0)=='a' ||nombre[i].charAt(0)=='e' || nombre[i].charAt(0)=='i'
                    ||nombre[i].charAt(0)=='o' || nombre[i].charAt(0)=='u') {
                                System.out.println("la primera letra de tu nombre es vocal: "+nombre[i].charAt(0));

            }else{
                System.out.println("la primera letra de tu nombre es consonante: "+nombre[i].charAt(0));
            }

        }

    }

}
