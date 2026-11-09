
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author shaie
 */
public class Practica24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Scanner cin = new Scanner(System.in);
        System.out.println("Introduce tu idioma favorito: ");
        char idioma = cin.next().charAt(0);
        
        switch(idioma){
            case 'c': System.out.println("Buenos días");
            break;
            case 'i': System.out.println("Good morning");
            break;
            case 'f': System.out.println("Bonjour");
            break;
            default: System.out.println("no entiendo esa idioma");
            }
        
    }
}
