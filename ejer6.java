package ejercicio1;

import java.util.Scanner;

/**
 * @author jose luis 
 * En sistema computacional se requiere crear una máscara de
 * ceros y uno para una secuencia de números de tal forma que se asigne un 0
 * para los valores positivos y el 1 para los negativos. Por ejemplo: La
 * secuencia: 1, -3, -5, 8, 9, -6, -43, -8 tendría la siguiente máscara:
 * 01100111.
 */
public class ejer6 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        
        int binario[] = new int[8];
        for (int i = 0; i < binario.length; i++) {
            System.out.print("igrese serie de numeros: ");
            binario[i]=p.nextInt();
            if (binario[i]>0) {
                binario[i]=0;
            }else{
                binario[i]=1;
            }
            
        }
        System.out.print("MASCARA: ");
        for (int i = 0; i < binario.length; i++) {
            System.out.print(binario[i]);
            
        }
        
    }

}
