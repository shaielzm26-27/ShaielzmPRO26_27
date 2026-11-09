
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author shaie
 */
public class Practica37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println(" CONTADOR DE BILLETES ");
        System.out.println("Digame la cantidad de billetes de 500: ");
        int Billetes_500 = sc.nextInt();
        
        System.out.println("Digame la cantidad de billetes de 200: ");
        int Billetes_200 = sc.nextInt();
        
        System.out.println("Digame la cantidad de billetes de 100: ");
        int Billetes_100 = sc.nextInt();
        
        System.out.println("Digame la cantidad de billetes de 50: ");
        int Billetes_50 = sc.nextInt();
        
        System.out.println("Digame la cantidad de billetes de 20: ");
        int Billetes_20 = sc.nextInt();
        
        System.out.println("Digame la cantidad de billetes de 10: ");
        int Billetes_10 = sc.nextInt();
        
        System.out.println("Digame la cantidad de billetes de 5: ");
        int Billetes_5 = sc.nextInt();
        
        int Resultado = (Billetes_500 * 500) + (Billetes_200 * 200) + (Billetes_100 * 100) + (Billetes_50 * 50) + (Billetes_20 * 20) + (Billetes_10 * 10) + (Billetes_5 * 5);
        System.out.println("Total de dinero por billetes: " + Resultado);
        
    }
}
