
/** *
 * El primer ciclo paralelo C, cuenta con 28 estudiantes, de los cuales al finalizar el ciclo,
 * la Dirección de la carrera de Computación a solicitado las siguientes estadísticas en función a los promedios obtenidos del ciclo por estudiantes
 * (use 1 arreglo, no matrices, y para el promedio por estudiante, no ingrese el valor, si se debe autogenerar).
 * Promedio del ciclo, del paralelo C.
 * Listado de estudiantes con su nota por encima del promedio.
 * Listado de estudiantes con su nota por debajo del promedio.
 * Estudiante con la mejor calificación.
 * Estudiante con la calificación mas baja.
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        int numEstudiantes = 28, Mejor = 0, Peor = 0;
        double sumaPromedios = 0, promedioCiclo, promedio, mejorPromedio, peorPromedio;
        double[] promedios = new double[numEstudiantes];
        for (int i = 0; i < numEstudiantes; i++) {
            promedios[i] = Math.random() * 10;
        }
        for (int i = 0; i < promedios.length; i++) {
            promedio = promedios[i];
            sumaPromedios += promedio;
        }
        promedioCiclo = Math.round((sumaPromedios / numEstudiantes) * 100.0) / 100.0;
        mejorPromedio = promedios[0];
        peorPromedio = promedios[0];
        for (int i = 1; i < promedios.length; i++) {
            if (promedios[i] > mejorPromedio) {
                mejorPromedio = promedios[i];
                Mejor = i;
            }
            if (promedios[i] < peorPromedio) {
                peorPromedio = promedios[i];
                Peor = i;
            }
        }
        System.out.println("Promedio general del ciclo: " + promedioCiclo);
        System.out.println("\nEstudiantes con calificaciones por encima del promedio:");
        for (int i = 0; i < promedios.length; i++) {
            if (promedios[i] > promedioCiclo) {
                System.out.printf("Estudiante #%d - Promedio: %.2f%n" + (i + 1) + promedios[i]);
            }
        }
        System.out.println("\nEstudiantes con calificaciones por debajo del promedio:");
        for (int i = 0; i < promedios.length; i++) {
            if (promedios[i] < promedioCiclo) {
                System.out.printf("Estudiante #%d - Promedio: %.2f%n" + (i + 1) + promedios[i]);
            }
        }
        System.out.println("\nEstudiante con la mejor calificacion:");
        System.out.printf("Estudiante - Promedio: %.2f%n" + (Mejor + 1) + mejorPromedio);
        System.out.println("\nEstudiante con la calificacion más baja:");
        System.out.printf("Estudiante - Promedio: %.2f%n" + (Peor + 1) + peorPromedio);
    }
}
/**
 * *
 * Promedio general del ciclo: 5.17
 *
 * Estudiantes con calificaciones por encima del promedio: Estudiante #1 -
 * Promedio: 6,26 Estudiante #4 - Promedio: 9,35 Estudiante #8 - Promedio: 7,31
 * Estudiante #12 - Promedio: 8,83 Estudiante #16 - Promedio: 5,60 Estudiante
 * #17 - Promedio: 6,75 Estudiante #18 - Promedio: 9,57 Estudiante #19 -
 * Promedio: 8,42 Estudiante #20 - Promedio: 6,84 Estudiante #21 - Promedio:
 * 6,45 Estudiante #22 - Promedio: 7,67 Estudiante #25 - Promedio: 7,26
 * Estudiante #26 - Promedio: 6,26 Estudiante #28 - Promedio: 8,76
 *
 * Estudiantes con calificaciones por debajo del promedio: Estudiante #2 -
 * Promedio: 0,22 Estudiante #3 - Promedio: 0,37 Estudiante #5 - Promedio: 2,49
 * Estudiante #6 - Promedio: 1,25 Estudiante #7 - Promedio: 4,28 Estudiante #9 -
 * Promedio: 3,85 Estudiante #10 - Promedio: 1,20 Estudiante #11 - Promedio:
 * 2,63 Estudiante #13 - Promedio: 4,89 Estudiante #14 - Promedio: 2,69
 * Estudiante #15 - Promedio: 1,99 Estudiante #23 - Promedio: 4,43 Estudiante
 * #24 - Promedio: 4,78 Estudiante #27 - Promedio: 4,24
 *
 * Estudiante con la mejor calificación: Estudiante #18 - Promedio: 9,57
 *
 * Estudiante con la calificación más baja: Estudiante #2 - Promedio: 0,22
 */
