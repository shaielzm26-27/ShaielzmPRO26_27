
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author shaie
 */
public class Practica21 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.print("Introduce un numero entero: ");
        numero = teclado.nextInt();

        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("El numero es multiplo de 3 y de 5");
        } 
        else if (numero % 3 == 0) {
            System.out.println("El numero es multiplo de 3 pero no de 5");
        } 
        else if (numero % 5 == 0) {
            System.out.println("El numero no es multiplo de 3 pero si de 5");
        } 
        else {
            System.out.println("El numero no es multiplo de 3 ni de 5");
        }

    }
}
