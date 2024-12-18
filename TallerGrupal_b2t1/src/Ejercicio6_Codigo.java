
import java.util.Scanner;

/**
 * Analice el siguiente código Scanner entrada = new Scanner(System.in);
 * String[] estudiantes = {"Kimberly", "Hogan", "Teresa", "Luis", "Mark",
 * "Jennifer", "Alcides"}; String inicial; boolean bandera = true;
 * while(bandera){ System.out.println("Ingrese una letra"); inicial =
 * entrada.nextLine(); } Modifique el ciclo repetitivo para que salga del mismo,
 * cuando el usuario ingrese por teclado una letra que coincida con la primera
 * letra de los "nombres" contenidos en del arreglo estudiantes. Debe usar un
 * ciclo repetitivo para recorrer el arreglo estudiantes, y no quemar de forma
 * constante dichas iniciales, imagine que estudiantes podría contener millón de
 * nombres, por lo que fijar iniciales, es ineficiente.
 *
 * @author sebas
 */
public class Ejercicio6_Codigo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] estudiantes = {"Kimberly", "Hogan", "Teresa", "Luis", "Mark", "Jennifer", "Alcides"};
        String inicial;
        boolean bandera = true;
        while (bandera) {
            System.out.println("Ingrese una letra:");
            inicial = entrada.nextLine().toUpperCase();
            for (String estudiante : estudiantes) {
                if (estudiante.toUpperCase().startsWith(inicial)) {
                    bandera = false;
                    break;
                }
            }
            if (bandera) {
                System.out.println("La letra no coincide con las iniciales de ningún estudiante. Intente de nuevo.");
            } else {
                System.out.println("¡Coincidencia encontrada! Saliste del ciclo.");
            }
        }
    }
}
