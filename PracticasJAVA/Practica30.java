
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author shaie
 */
public class Practica30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Scanner teclado = new Scanner(System.in);

        int numero;
        String respuesta;

        do {

            // Generar un numero aleatorio entre 10 y 20
            numero = (int) (Math.random() * 11) + 10;

            // Mostrar el numero aleatorio
            System.out.println("Numero aleatorio: " + numero);

            // Preguntar al usuario si quiere continuar
            System.out.print("¿Quieres continuar? (SI/Cualquier otra letra): ");
            respuesta = teclado.nextLine();

        } while (respuesta.equalsIgnoreCase("SI"));

        System.out.println("Programa finalizado.");
        
    }
}
