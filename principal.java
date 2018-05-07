
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
