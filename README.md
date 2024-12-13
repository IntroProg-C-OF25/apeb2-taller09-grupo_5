# Taller09

* Leer detenidamente cada problemática propuesta.
* Programa/codifíque con el lenguaje de alto nivel Java (IDE NetBeans), sus soluciones a cada uno de los problemas listados a continuación. 
* Para cada programa, genere una clase independiente pero dentro de un solo/único proyecto Java App. No olvide titular a cada clase, con el nombre representativo de la solución y con el número del problema de este listado. 
* Verificar que sus soluciones son correctas con las técnicas de compilación, ejecución y depurado de programas.
* Al final como parte de la codificación (en comentario /*** ), copiar y pegar los resultados obtenidos de la consola, evidenciando el funcionamiento de su solución. 

## Construcción de programas usando la estructura de control repetitiva for

### Ejercicio 1

Con el objetivo practicar el uso del ciclo repetitivo for, se propone que dado un límite, se presenten las siguientes figuras. Por ejemplo si el límite es 4: 

Figura 1:

```
*
**
***
****
```

Figura 2:

```
     *
    ***
   *****
  *******
```

Figura 3:

```
     *
    ***
   *****
  *******
   *****
    ***
     *
```

### Ejercicio 2

Escriba un programa que permita presentar la siguiente serie: 
```
1/2, 1/3, 2/5, 3/7, 5/11, 8/13, . . . fibonaccis / primos 
```

## Construcción de programas usando arreglos unidimensionales

### Ejercicio 3

Genera una aplicación que permita ingresar valores a un arreglo de cadenas. El arreglo almacena el número de elementos que el usuario lo disponga. Se puede plantear el escenario que se ingresen nombres de marcas de vehículos.

Por ejemplo, si el usuario decide ingresar 5 marcas; el arreglo solo debe permitir ingresar ese número elementos.

Considerar las siguientes excepciones, no se contabilizan dentro del número de elementos, marcas que empiecen con las letras
A, C, T.

### Ejercicio 4

Dado el arreglo; determinar cuantos elementos están arriba de la media aritmética y cuantos están por debajo de la medía aritmética.
```
int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
```

### Ejercicio 5

Dados los siguientes arreglos
```
double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan", "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning", "Juan Vasquez"};
```

Genere  los datos para el arreglo
```
String[] promediosCualitativos = new String[7];

```
* Promedio Regular son todas las notas >=0 y <=5.9
* Promedio Bueno son todas las notas >=6 y <=8.9
* Promedio Sobresaliente son todas las notas >=9 y <=10

Finalmente presentar un reporte como el que sigue:

```
Kimberly Gonzalez promedio: 10,00 promedio cualitativo ?
Mark Hogan promedio: 10,00 promedio cualitativo ?
Teresa Martinez promedio: 9,10 promedio cualitativo ?
Julia Johnson promedio: 7,00 promedio cualitativo ?
Mark Cook promedio: 6,10 promedio cualitativo ?
Jennifer Manning promedio: 4,00 promedio cualitativo ?
Juan Vasquez promedio: 8,00 promedio cualitativo ?
```
### Ejercicios 6

Analice el siguiente código
```
Scanner entrada = new Scanner(System.in);
String[] estudiantes = {"Kimberly", "Hogan", "Teresa", "Luis", "Mark", "Jennifer", "Alcides"};
String inicial;
boolean bandera = true;
while(bandera){
    System.out.println("Ingrese una letra");
    inicial = entrada.nextLine();
 }
```
Modifique el ciclo repetitivo para que salga del mismo, cuando el usuario ingrese por teclado una letra que coincida con la primera letra de los "nombres" contenidos en del arreglo **estudiantes**. Debe usar un ciclo repetitivo para recorrer el arreglo **estudiantes**, y no quemar de forma constante dichas iniciales, imagine que **estudiantes** podría contener millón de nombres, por lo que fijar iniciales, es ineficiente.


### Ejercicios 7

El primer ciclo paralelo C, cuenta con 28 estudiantes, de los cuales al finalizar el ciclo, la Dirección de la carrera de Computación a solicitado las siguientes estadísticas en función a los promedios obtenidos del ciclo por estudiantes (use 1 arreglo, no matrices, y para el promedio por estudiante, no ingrese el valor, si se debe autogenerar). 

- Promedio del ciclo, del paralelo C. 
- Listado de estudiantes con su nota por encima del promedio. 
- Listado de estudiantes con su nota por debajo del promedio. 
- Estudiante con la mejor calificación. 
- Estudiante con la calificación mas baja. 

