
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author shaie
 */
public class Practica26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
                Scanner cin = new Scanner(System.in);
        System.out.println("Introduce un numero del 1 al 5: ");
        char dia = cin.next().charAt(0);
        
        switch(dia){
            case '1': System.out.println("Lunes, Sistemas Informaticos");
            break;
            case '2': System.out.println("Martes, Lenguaje de Marca");
            break;
            case '3': System.out.println("Miercoles, Base de Datos");
            break;
            case '4': System.out.println("Jueves, Ingles");
            break;
            case '5': System.out.println("Viernes, Lenguaje de Marca");
            break;
            default: System.out.println("no hay clases, es finde!!!");
            }
        
    }
}
