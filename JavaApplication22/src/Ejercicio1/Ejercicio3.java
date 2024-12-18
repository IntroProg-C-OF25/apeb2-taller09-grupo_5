
/***
 * Genera una aplicación que permita ingresar valores a un arreglo de cadenas. El arreglo almacena el número de elementos que el usuario lo disponga.
 * Se puede plantear el escenario que se ingresen nombres de marcas de vehículos.
 * Por ejemplo, si el usuario decide ingresar 5 marcas; el arreglo solo debe permitir ingresar ese número elementos.
 * Considerar las siguientes excepciones, no se contabilizan dentro del número de elementos, marcas que empiecen con las letras A, C, T.
 */
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int n;
        System.out.print("¿Cuantas marcas deseas ingresar?: ");
        n = tcl.nextInt();
        tcl.nextLine();
        String[] marcas = new String[n];
        int contador = 0;
        int c = 0;
        System.out.println("Ingresa las marcas de vehiculos (las que comienzan con A, C o T no se contarán):");
        while (contador < n) {
            System.out.print("Marca #" + (c + 1) + ": ");
            String marca = tcl.nextLine();
            c++;
            String primeraLetra = marca.substring(0, 1).toUpperCase();
            if (!primeraLetra.equals("A") && !primeraLetra.equals("C") && !primeraLetra.equals("T")) {
                marcas[contador] = marca;
                contador++;
            } else {
                System.out.println("La marca \"" + marca + "\" no se cuenta.");
            }
        }
        System.out.println("\nMarcas de vehiculos validas ingresadas:");
        for (int i = 0; i < n; i++) {
            System.out.println("Marca #" + (i + 1) + ": " + marcas[i]);
        }
    }
}
/***
 * ¿Cuántas marcas deseas ingresar?: 3
Ingresa las marcas de vehículos (las que comienzan con A, C o T no se contarán):
Marca #1: Audi
La marca "Audi" no se cuenta.
Marca #2: Ferrari
Marca #3: Buggatti
Marca #4: Toyota
La marca "Toyota" no se cuenta.
Marca #5: Camaro
La marca "Camaro" no se cuenta.
Marca #6: Lamborghini
Marcas de vehículos válidas ingresadas:
Marca #1: Ferrari
Marca #2: Buggatti
Marca #3: Lamborghini
 */