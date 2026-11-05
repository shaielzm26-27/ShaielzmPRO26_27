
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author shaie
 */
public class Practica13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número mayor que 5 ");
        int numero = sc.nextInt();
        
        boolean comparaCon5;
        comparaCon5 = numero > 5;
        System.out.println("Es " + comparaCon5 + " que el número sea mayor que 5");

        
    }
}
