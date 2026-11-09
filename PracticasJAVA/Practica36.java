
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author shaie
 */
public class Practica36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();
        
        int acumuladoTotalPuntos = 0;
        int numeroTiradas = 0;
        
        System.out.println(" JUEGO DE LANZAR 3 DADOS ");
        System.out.println("Pulsa Enter para lanzar los dados, o escribe 'f' / 'F' para finalizar.");
        
        while (true) {
            System.out.print("\nPresiona Enter para tirar (o 'f' para salir): ");
            String entrada = scanner.nextLine();
            
            // Verificamos si el usuario introdujo 'f' o 'F' para salir
            if (entrada.equalsIgnoreCase("f")) {
                break;
            }
            
            // Generar los 3 dados (de 1 a 6)
            int dado1 = rnd.nextInt(6) + 1;
            int dado2 = rnd.nextInt(6) + 1;
            int dado3 = rnd.nextInt(6) + 1;
            
            int acumuladoTirada = dado1 + dado2 + dado3;
            
            // Actualizamos los acumuladores globales
            acumuladoTotalPuntos += acumuladoTirada;
            numeroTiradas++;
            
            // Mostramos los resultados de la iteración actual
            System.out.println("Resultado de los dados: [" + dado1 + "] - [" + dado2 + "] - [" + dado3 + "]");
            System.out.println("Acumulado de esta tirada: " + acumuladoTirada);
        }
        
        // Mostrar resultados finales al pulsar 'f' o 'F'
        System.out.println(" \nRESUMEN FINAL ");
        System.out.println("Número total de tiradas realizadas: " + numeroTiradas);
        System.out.println("Acumulado total de puntos de todas las tiradas: " + acumuladoTotalPuntos);
        
    }
}
