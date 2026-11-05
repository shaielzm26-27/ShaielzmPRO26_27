
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author shaie
 */
public class Practica16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame los metros del ancho");
        int y = sc.nextInt();
        
        System.out.println("Dame los metros de largo");
        int x = sc.nextInt();
        
        int resultado = x * y / 2;
        
        System.out.println("resultado del Área: " + resultado + "m2");
        System.out.println("resultado en centimetros cuadrados: " + resultado * 10000 + "cm2");
        
    }
}
