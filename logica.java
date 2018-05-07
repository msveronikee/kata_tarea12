
import java.awt.List;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Vero
 */
public class logica {

    String[] UNIDADES = {"CERO", "UNO", "DOS ", "TRES ",
        "CUATRO ", "CINCO ", "SEIS ", "SIETE ", "OCHO ", "NUEVE ", "DIEZ "};
    String[] UNIDADES2 = {"ONCE ", "DOCE ", "TRECE ", "CATORCE ", "QUINCE ", "DIECISEIS",
        "DIECISIETE", "DIECIOCHO", "DIECINUEVE", "VEINTE"};

    String[] DECENAS = {"VEINTI", "TREINTA ", "CUARENTA ",
        "CINCUENTA ", "SESENTA ", "SETENTA ", "OCHENTA ", "NOVENTA ",
        "CIEN "};

    String[] LETRAS = {"UNO", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "SIETE", "OCHO", "NUEVE",
        "DIEZ", "ONCE", "DOCE", "TRECE", "CATORCE", "QUINCE", "DIECISEIS", "DIECISIETE", "DIECIOCHO", "DIECINUEVE",
        "VEINTE", "TREINTA", "CUARENTA", "CINCUENTA", "SESENTA", "SETENTA", "OCHENTA", "NOVENTA"};
    
    Integer[] UNI = {1, 2, 3, 4, 5, 6, 7, 8, 9,
        10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
        20, 30, 40, 50, 60, 70, 80, 90};
    java.util.List listaLetra = java.util.Arrays.asList(LETRAS);

    public void numero() {
        System.out.println("Ingrese el número del 0 al 99");
        Scanner scan2 = new Scanner(System.in);
        int num = scan2.nextInt();
        if (num >= 0 && num < 11) {
            System.out.print('\n' + UNIDADES[num]);
        } else if (num < 20) {
            System.out.print('\n' + UNIDADES2[num - 11]);
        } else if (num < 100) {
            int unid = num % 10;
            int dec = num / 10;
            if (unid == 0) {
                System.out.print('\n' + DECENAS[dec - 2]);
            } else {
                System.out.print('\n' + DECENAS[dec - 2]
                        + " y " + UNIDADES[unid]);
            }
        } else {
            System.out.print("El numero debe ser menor a 100");
        }

    }
    
    public void letra() {
        System.out.println("Ingrese número con letras del 0-99");
        Scanner scan2 = new Scanner(System.in);
        String num = scan2.nextLine();

        StringTokenizer st = new StringTokenizer(num);
        Integer numero = 0;

        while (st.hasMoreTokens()) {
            String t = st.nextToken();

            if (listaLetra.indexOf(t) > -1) {
                numero += UNI[listaLetra.indexOf(t)];
            }
        }

        System.out.println("Resultado : " + String.valueOf(numero));
    }

    

    
}
