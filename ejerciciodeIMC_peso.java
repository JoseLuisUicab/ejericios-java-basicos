package ejercicio1;

import java.util.Scanner;

public class ejer9 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        String estado[] = new String[10];
        int ident[] = new int[10], obeso = 0, delgado = 0, normal = 0, mayor = 0, menor = 99999, pesoNor = 0, estarurapro = 0, PG = 0;
        String nombre[] = new String[10];
        int peso[] = new int[10], pronormal = 0, proGN = 0, proEG = 0;
        double estatura[] = new double[10];
        double IMC[] = new double[10];

        for (int i = 0; i < estatura.length; i++) {
            System.out.print("Indentificacion: ");
            ident[i] = p.nextInt();
            p.nextLine();
            System.out.print("Nombre: ");
            nombre[i] = p.nextLine();
            System.out.print("Peso: ");
            peso[i] = p.nextInt();
            PG += peso[i];
            System.out.print("Altura: ");
            estatura[i] = p.nextDouble();
            estarurapro += estatura[i];
            IMC[i] = (peso[i] / (estatura[i] * estatura[i]));

        }
        for (int i = 0; i < estado.length; i++) {
            if (peso[i] >= 50 && peso[i] <= 55) {
                estado[i] = "DELGADO";
                delgado++;
            } else if (peso[i] >= 56 && peso[i] <= 70) {
                estado[i] = "NORMAL";
                normal++;
                pesoNor += peso[i];

            } else if (peso[i] >= 75 && peso[i] <= 90) {
                estado[i] = "OBESO";
                obeso++;
            }

        }
        for (int i = 0; i < peso.length; i++) {
            if (peso[i] > mayor) {
                mayor = peso[i];

            } else if (peso[i] < menor) {
                menor = peso[i];
            }

        }
        pronormal = pesoNor / normal;
        proGN = PG / 10;
        proEG = estarurapro / 10;
        System.out.println("identificacion    |   Nombres   |  PESO   |   Estatura    |   IMC    |    Estado  |");
        for (int i = 0; i < estado.length; i++) {
            System.out.println(ident[i] + "        |" + nombre[i] + "        |" + peso[i] + "            |" + estatura[i] + "          |" + String.format("%.2f", IMC[i]) + "         |" + estado[i]);
        }
        System.out.println();
        System.out.println("PESO MAYOR  |" + mayor);
        System.out.println();
        System.out.println("PESO MENOR  | " + menor);
        System.out.println();
        System.out.println("Numero personas DELGADAS    |" + delgado);
        System.out.println();
        System.out.println("Numero personas OBESAS  |" + obeso);
        System.out.println();
        System.out.println("Numero personas PESO NORMAL |" + normal);
        System.out.println();
        System.out.println("promedio peso personas con peso normal |" + pronormal);
        System.out.println();
        System.out.println("promedio peso General |" + proGN);
        System.out.println();
        System.out.println("proedio estatra General |" + proEG);

    }

}
