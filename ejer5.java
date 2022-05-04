package ejercicio1;

import java.util.Scanner;

/**
 * 15 usuarios votaran por algunos de los colores rojo, azul y verde registar el
 * voto de cada uno de ellos y al final decir cuantos votos obtuvo cada color
 *
 * @author joseluis
 */
public class ejer5 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int r = 0, a = 0, v = 0;
        String votos[] = new String[5];
        System.out.println("**menu de colores***");
        System.out.println(" rojo");
        System.out.println(" azul");
        System.out.println(" verde");

        for (int i = 0; i < votos.length; i++) {
            System.out.print(+(i + 1) + ".-ingrese color: ");
            votos[i] = p.nextLine();

            if ("rojo".equals(votos[i])) {
                r++;

            } else if ("azul".equals(votos[i])) {
                a++;
            } else {
                v++;
            }

        }
        System.out.println();
        System.out.print("cantidas de votos del color rojo: "+r);
        System.out.println();
        System.out.print("cantidas de votos del color azul: "+a);
        System.out.println();
        System.out.print("cantidas de votos del color verde: "+v);

    }

}
