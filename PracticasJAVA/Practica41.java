
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author shaie
 */
public class Practica41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce una cadena de texto: ");
        String texto = scanner.nextLine();
        
        String textoInvertido = "";
        
        for (int i = texto.length() - 1; i >= 0; i--) {
            textoInvertido += texto.substring(i, i + 1);
        }
        
        System.out.println("El texto al revés es: " + textoInvertido);
        
    }
}
