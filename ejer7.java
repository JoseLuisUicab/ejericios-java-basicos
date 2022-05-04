package ejercicio1;
import java.util.Scanner;
/*
 * @author jose luis 
 * Dado un vector V de N números enteros, cambie cada elemento menor que 10 por
0 y cada elemento mayor que 20 por 1. Encuentre cuántos elementos quedaron sin
cambiar.
 */
public class ejer7 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int n =0,cont=0;
        System.out.println("cantidad de datos: ");
        n=p.nextInt();
        int num[]= new int[n];
        
        for (int i = 0; i < num.length; i++) {
            System.out.print("ingrese numeros: ");
            num[i]=p.nextInt();
            if (num[i]<10) {
                num[i] = 0;
            }else if(num[i]>20){
                num[i]=1;
            }else{
                cont++;
            }
            
        }
        System.out.println("numeros ingresados");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+",");
            
        }
        System.out.println();
        System.out.print("elementos sin cambiar: "+cont);
        
    }
    
}
