
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author shaie
 */
public class Practica40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número entero entre 0 y 999: ");
        int numero = scanner.nextInt();
        
        if (numero >= 0 && numero <= 9) {
            System.out.println("El número tiene 1 cifra.");
        } else if (numero >= 10 && numero <= 99) {
            System.out.println("El número tiene 2 cifras.");
        } else if (numero >= 100 && numero <= 999) {
            System.out.println("El número tiene 3 cifras.");
        } else {
            System.out.println("El número está fuera del rango permitido (0 a 999)");
        }
        
    }
}
