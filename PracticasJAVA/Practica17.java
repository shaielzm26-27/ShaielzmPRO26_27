
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author shaie
 */
public class Practica17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el precio del producto");
        double Producto = sc.nextDouble();
        
        double IGIC = Producto * 1.07;
        System.out.println("El precio del producto con un IGIC de 7% es: " + IGIC);
        
    }
}
