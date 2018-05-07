
import java.util.Scanner;


/**
 *
 * @author Vero
 */
public class principal {
    public static void main(String[] args) {

        System.out.println("Escoje una opción");
        System.out.println("1 para convertir números a letras \n2 para convertir letras a números");
        Scanner scan = new Scanner(System.in);
        int ingreso = scan.nextInt();

        if (ingreso == 1) {
            logica respuesta=new logica(); 
            respuesta.numero();

        }
        if (ingreso == 2) {
            new logica().letra();

        }

    }
    
}
