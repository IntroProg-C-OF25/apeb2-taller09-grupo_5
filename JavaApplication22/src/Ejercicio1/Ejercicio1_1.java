/***
 * Con el objetivo de practicar el uso del ciclo repetitivo para, se propone que dado un límite, se presentan las siguientes figuras. Por ejemplo, si el límite es 4:
*/
import java.util.Scanner;

public class Ejercicio1_1 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int lim;
        System.out.print("Ingrese el limite de la figura: ");
        lim = tcl.nextInt();
        System.out.println("Figura 1: ");
        for (int i = 0; i <= lim; i++) {
            for (int j = 0; j <= (i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Figura 2:");
        System.out.println("");
        for (int i = 1; i <= lim; i++) {
            for (int j = 1; j <= (lim - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Figura 3: ");
        System.out.println("");
        //Parte de arriba
        for (int i = 1; i <= lim; i++) {
            for (int j = 1; j <= (lim - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        //Parte de abajo
        for (int i = lim - 1; i >= 1; i--) {

            for (int j = 1; j <= (lim - i); j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("");
    }
}

/***
 * run:
Ingrese el limite de la figura: 4
Figura 1: 

* 
* * 
* * * 
* * * * 

Figura 2:

   *
  ***
 *****
*******

Figura 3: 

   *
  ***
 *****
*******
 *****
  ***
   *

BUILD SUCCESSFUL (total time: 3 seconds)
 */