    
/***
 *Dados los siguientes arreglos
 * double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
 * String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan", "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning", "Juan Vasquez"};
 * Genere los datos para el arreglo
 * String[] promediosCualitativos = new String[7];
 * Promedio Regular son todas las notas >=0 y <=5.9
 * Promedio Bueno son todas las notas >=6 y <=8.9
 * Promedio Sobresaliente son todas las notas >=9 y <=10 Finalmente presentar un
 * reporte como el que sigue: 
 * Kimberly Gonzalez promedio: 10,00 promedio cualitativo ? 
 * Mark Hogan promedio: 10,00 promedio cualitativo ? 
 * Teresa Martinez promedio: 9,10 promedio cualitativo ? 
 * Julia Johnson promedio: 7,00 promedio cualitativo ? 
 * Mark Cook promedio: 6,10 promedio cualitativo ?
 * Jennifer Manning promedio: 4,00 promedio cualitativo ? 
 * Juan Vasquez promedio: 8,00 promedio cualitativo ? 
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
        String[] estudiantes = {
            "Kimberly Gonzalez",
            "Mark Hogan",
            "Teresa Martinez",
            "Julia Johnson",
            "Mark Cook",
            "Jennifer Manning",
            "Juan Vasquez"
        };
        String[] promediosCualitativos = new String[7];
        for (int i = 0; i < promedios.length; i++) {
            if (promedios[i] >= 0 && promedios[i] <= 5.9) {
                promediosCualitativos[i] = "Regular";
            } else if (promedios[i] >= 6 && promedios[i] <= 8.9) {
                promediosCualitativos[i] = "Bueno";
            } else if (promedios[i] >= 9 && promedios[i] <= 10) {
                promediosCualitativos[i] = "Sobresaliente";
            }
        }
        System.out.println("Reporte de Estudiantes");
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.printf("%s promedio: %.2f promedio cualitativo: %s%n",
                    estudiantes[i], promedios[i], promediosCualitativos[i]);
        }
    }
}
/***
 * Reporte de Estudiantes:
 * Kimberly Gonzalez promedio: 10,00 promedio cualitativo: Sobresaliente
 * Mark Hogan promedio: 10,00 promedio cualitativo: Sobresaliente
 * Teresa Martinez promedio: 9,10 promedio cualitativo: Sobresaliente
 * Julia Johnson promedio: 7,00 promedio cualitativo: Bueno
 * Mark Cook promedio: 6,10 promedio cualitativo: Bueno
 * Jennifer Manning promedio: 4,00 promedio cualitativo: Regular
 * Juan Vasquez promedio: 8,00 promedio cualitativo: Bueno
 */
