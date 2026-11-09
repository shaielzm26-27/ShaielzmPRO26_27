
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author shaie
 */
public class Practica22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
                Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.print("Introduce un numero: ");
        numero = teclado.nextInt();

        if (numero < 0) {
            System.out.println("El numero es menor de 0");
        } 
        else if (numero == 0) {
            System.out.println("El numero es igual a 0");
        } 
        else if (numero > 0 && numero < 10) {
            System.out.println("El numero es mayor a 0 y menor a 10");
        } 
        else if (numero == 10){
            System.out.println("El numero es igual a 10");
        }
        else if (numero > 10 && numero < 20){
            System.out.println("El numero es mayor que 10 y menor de 20");
        }
        else if (numero >= 20){
            System.out.println("El numero es mayor o igual que 20");
        }
    }
}
