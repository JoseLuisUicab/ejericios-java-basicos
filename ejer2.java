package ejercicio1;

import java.util.Scanner;
//Se desea capturar los nombres de 10 personas que compitieron en un concurso
//se capturan en el orden ascendente del primer lugar al décimo.
//Pregunte al usuario si desea ver el nombre de la persona que ocupo el N lugar 
//terminara el programa cuando el usuario dese salir.
public class Ejercicio2{

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int pos=0;
        char op;
        String guardar="";
        String comp[] = new String[10]; 
        
        for (int i = 0; i < comp.length; i++) {
            System.out.print("Nombre competidor: ["+(i+1)+"]: ");
            comp[i]=p.nextLine();
            
        }
        for (int i = 0; i < comp.length; i++) {
            System.out.println("COmpetidores registrados: ["+(i+1)+"]: "+comp[i]);
            
        }
        
        do {
            System.out.println("deseas ver el nombre de la persona que ocupo el N lugar?");
            pos= p.nextInt();
            
            for (int i = 0; i < comp.length; i++) {
                guardar = comp[pos-1];
                                //10
                                //comp[pos-1]="ana";
            }
            System.out.println("particpante: "+guardar+" su posicion es: "+pos);
            System.out.println("deseas salir (S/n)");
            op = p.next().charAt(0);
            
        } while (op=='n' || op=='N');
        
        
    }
}
