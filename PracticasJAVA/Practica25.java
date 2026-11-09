
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author shaie
 */
public class Practica25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Scanner cin = new Scanner(System.in);
        System.out.println("Introduce una letra: ");
        char letra = cin.next().charAt(0);
        
        switch(letra){
            case 'a','e','i','o','u': System.out.println("Es una vocal");
            break;
            default: System.out.println("No es una vocal");
            }
        
    }
}
