
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
public class Practica43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();
        
        int numeroSecreto = rnd.nextInt(99) + 1;
        int intento;
        int intentos = 0;
        
        System.out.println(" JUEGO: ADIVINA EL NÚMERO SECRETO (1 al 99) ");
        
        do {
            System.out.print("Introduce tu número: ");
            intento = scanner.nextInt();
            intentos++;
            
            if (intento < numeroSecreto) {
                System.out.println("El número secreto es mayor");
            } else if (intento > numeroSecreto) {
                System.out.println("El número secreto es menor");
            } else {
                System.out.println("¡Enhorabuena! Has acertado");
                System.out.println("Número de intentos que has necesitado: " + intentos);
            }
        } while (intento != numeroSecreto);
        
    }
}
