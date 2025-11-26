/*
 Este programa genera el resultado de
 4 elevado a la potencia 3
 Donde número = 4 y potencia = 3

 Agregar los cambios necesarios para que tanto número y potencia 
 sean ingresados por teclado por el usuario.
 */
package ejemplos02;
/**
 *
 * @author reroes
 */
import java.util.Scanner;

public class Ejemplo05 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;
        int potencia;
        int resultado;

        System.out.println("Ingrese el número base:");
        numero = entrada.nextInt();

        System.out.println("Ingrese la potencia:");
        potencia = entrada.nextInt();

        resultado = 1;

        int contador = 0;

        do {
            resultado = resultado * numero;
            contador = contador + 1;
        } while (contador < potencia);

        System.out.printf("El resultado es: %d\n", resultado);
    }
}

    

