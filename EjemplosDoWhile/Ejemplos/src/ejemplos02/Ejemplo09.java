/*
 Revise la solución presentada y modifique de tal forma
 que se pueda tener el siguiente reporte

Listado de Notas
Calificación 10 (Muy buena) del estudiante rené
Calificación 4 (Buena) del estudiante rolando

Promedio de calificaciones: 8,50

---
Si la nota es mayor o igual a 5 es un nota "Muy buena", caso contrario es buena
 */
package ejemplos02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo09 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String cadenaFinal;
        int nota;
        int salida;
        String nombre;
        String evaluacion;  // <-- agregado para Muy buena / Buena
        double promedio;
        int suma = 0;
        int contador_calificaciones = 0;
        boolean bandera = true;

        cadenaFinal = "Listado de Notas\n";

        do {

            System.out.println("Ingrese nombre del estudiante:");
            nombre = entrada.nextLine();

            System.out.println("Ingrese la nota del estudiante:");
            nota = entrada.nextInt();

            // Determinar si es Muy buena o Buena
            if (nota >= 5) {
                evaluacion = "Muy buena";
            } else {
                evaluacion = "Buena";
            }

            // Sumar para promedio
            suma = suma + nota;
            contador_calificaciones++;

            // Agregar línea al reporte
            cadenaFinal = String.format("%sCalificación %d (%s) "
                    + "del estudiante %s\n",
                    cadenaFinal,
                    nota,
                    evaluacion,
                    nombre);

            System.out.println("Ingrese (-111) si desea salir; "
                    + "otro número para continuar:");
            salida = entrada.nextInt();
            entrada.nextLine(); // limpiar buffer

            if (salida == -111) {
                bandera = false;
            }

        } while (bandera);

        // Calcular promedio
        promedio = (double) suma / contador_calificaciones;

        cadenaFinal = String.format("%s\nPromedio de calificaciones: %.2f",
                cadenaFinal,
                promedio);

        System.out.printf("%s\n", cadenaFinal);
    }
}
