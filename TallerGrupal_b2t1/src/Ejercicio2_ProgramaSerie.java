
import java.util.ArrayList;

/**
 * Escriba un programa que permita presentar la siguiente serie:
 * 1/2, 1/3, 2/5, 3/7, 5/11, 8/13, . . . fibonaccis / primos 
 * @author sebas
 */
public class Ejercicio2_ProgramaSerie {
     public static ArrayList<Integer> generarFibonacci(int n) {
        ArrayList<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(1); 
        fibonacci.add(1); 
        for (int i = 2; i < n; i++) {
            int siguiente = fibonacci.get(i - 1) + fibonacci.get(i - 2);
            fibonacci.add(siguiente);
        }
        return fibonacci;
    }
    public static ArrayList<Integer> generarPrimos(int n) {
        ArrayList<Integer> primos = new ArrayList<>();
        int numero = 2; 
        while (primos.size() < n) {
            if (esPrimo(numero)) {
                primos.add(numero);
            }
            numero++;
        }
        return primos;
    }
    public static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int cantidad = 10; 
        ArrayList<Integer> fibonaccis = generarFibonacci(cantidad);
        ArrayList<Integer> primos = generarPrimos(cantidad);
        ArrayList<String> serie = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            serie.add(fibonaccis.get(i) + "/" + primos.get(i));
        }
        System.out.println("Serie generada:");
        System.out.println(String.join(", ", serie));
    }
}
/***
 * run:
Serie generada:
1/2, 1/3, 2/5, 3/7, 5/11, 8/13, 13/17, 21/19, 34/23, 55/29
BUILD SUCCESSFUL (total time: 0 seconds)
 */