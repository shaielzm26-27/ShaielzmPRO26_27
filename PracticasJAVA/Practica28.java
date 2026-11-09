
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author shaie
 */
public class Practica28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Scanner teclado = new Scanner(System.in);

        int numero;
        int sumaPositivos = 0;
        int sumaNegativos = 0;

        System.out.println("Introduce numeros enteros (0 para terminar)");

        do {

            System.out.print("Introduce un numero: ");
            numero = teclado.nextInt();

            if (numero > 0) {
                sumaPositivos = sumaPositivos + numero;
            } 
            else if (numero < 0) {
                sumaNegativos = sumaNegativos + numero;
            }

        } while (numero != 0);

        System.out.println("Suma de numeros positivos: " + sumaPositivos);
        System.out.println("Suma de numeros negativos: " + sumaNegativos);
        
    }
}
