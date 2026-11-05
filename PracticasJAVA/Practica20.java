
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author shaie
 */
public class Practica20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int numero = sc.nextInt();
        
        if (numero %2==0){
            System.out.println("El numero es par");
    }else{
            System.out.println("El numero es impar");
        }
        
    }
}
