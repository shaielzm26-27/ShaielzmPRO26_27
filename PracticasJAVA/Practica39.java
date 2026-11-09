
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author shaie
 */
public class Practica39 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int numero;
        
        do {
            System.out.println("Introduce un numero entre el 10 y el 99: ");
            numero = sc.nextInt();
            
            if(numero < 10 || numero > 99){
                System.out.println("Numero no valido. Intentalo de nuevo");//[cite: 6]
            }
        }while(numero < 10 || numero >99);
        
        int unidad = numero % 10;
        int decena = numero / 10;
        int invertido = (unidad * 10) + decena;
        
        System.out.println("El número invertido es: " + invertido);
        
    }
}
