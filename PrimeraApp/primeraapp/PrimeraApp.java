/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primeraapp;

import java.util.Scanner;
/**       
 *
 * @author alumno
 */
public class PrimeraApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el lado 1");
        
        int lado1 = sc.nextInt();
        
        System.out.println("Dame el lado 2");
        int lado2 =  sc.nextInt();
        
        
        System.out.println("El area del rectangulo es:");
        int resultado = lado1*lado2;
        System.out.println(resultado);
    }
    
}
