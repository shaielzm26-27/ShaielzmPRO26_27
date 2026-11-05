
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author shaie
 */
public class Practica15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce una linea de texto: ");

        String texto = teclado.nextLine();

        System.out.println("Has escrito: " + texto);
    }
        
}

