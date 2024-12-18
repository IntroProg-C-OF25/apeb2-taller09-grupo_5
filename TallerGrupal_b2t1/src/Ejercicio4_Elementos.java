/**
 * Dado el arreglo; determinar cuantos elementos están arriba de la media aritmética y cuantos están por debajo de la medía aritmética.
 * int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
 * @author sebas
 */
public class Ejercicio4_Elementos {
    public static void main(String[] args) {
        int porEncima = 0;
        int porDebajo = 0;
        
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        double suma = 0;
        for (int num : arreglo) {
            suma += num;
        }
        double media = suma / arreglo.length;
       

        for (int num : arreglo) {
            if (num > media) {
                porEncima++;
            } else if (num < media) {
                porDebajo++;
            }
        }
        System.out.println("Media aritmética: " + media);
        System.out.println("Elementos por encima de la media: " + porEncima);
        System.out.println("Elementos por debajo de la media: " + porDebajo);
    }
}
/***
 * run:
Media aritmética: 9.538461538461538
Elementos por encima de la media: 8
Elementos por debajo de la media: 5
BUILD SUCCESSFUL (total time: 0 seconds)
 */


