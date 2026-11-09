
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author shaie
 */
public class Practica42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el dinero total que se pagará por el encargo: ");
        double dineroTotal = scanner.nextDouble();
        
        System.out.print("Introduce el número de participantes de la cuadrilla: ");
        int numParticipantes = scanner.nextInt();
        
        double totalHoras = 0;
        
        // Bucle para pedir las horas de cada participante
        for (int i = 1; i <= numParticipantes; i++) {
            System.out.print("Introduce las horas trabajadas por el participante " + i + ": ");
            double horas = scanner.nextDouble();
            totalHoras += horas;
        }
        
        // Cálculo del precio por hora
        if (totalHoras > 0) {
            double precioPorHora = dineroTotal / totalHoras;
            
            System.out.println(" \nRESULTADO ");
            System.out.println("Total de horas invertidas: " + totalHoras);
            System.out.println("El precio de cada hora trabajada es: " + precioPorHora + " €");
        } else {
            System.out.println("El total de horas debe ser mayor a cero.");
        }
        
    }
}
