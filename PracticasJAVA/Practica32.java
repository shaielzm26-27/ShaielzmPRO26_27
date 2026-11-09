
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author shaie
 */
public class Practica32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Scanner scanner = new Scanner(System.in);
        
        int num1, num2;
        
        do {
            System.out.print("Introduce el primer número entero positivo: ");
            num1 = scanner.nextInt();
            System.out.print("Introduce el segundo número entero positivo: ");
            num2 = scanner.nextInt();
            
            if (num1 <= 0 || num2 <= 0) {
                System.out.println("Error: Ambos números deben ser enteros positivos. Inténtalo de nuevo.");
            }
        } while (num1 <= 0 || num2 <= 0);
        
        int inicio = Math.min(num1, num2);
        int fin = Math.max(num1, num2);
        
        int suma = 0;
        
        System.out.print("La secuencia de números es: ");
        for (int i = inicio; i <= fin; i++) {
            suma += i;
            
            if (i == fin) {
                System.out.print(i);
            } else {
                System.out.print(i + ",");
            }
        }
        
        System.out.println();
        System.out.println("Y la suma de esos números es:");
        System.out.println(suma);
        
    }
}
