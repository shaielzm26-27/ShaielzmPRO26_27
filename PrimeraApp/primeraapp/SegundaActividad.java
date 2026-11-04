/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primeraapp;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class SegundaActividad {
    public static void main(String[] args) {
        //area del triangulo
        
        int base = 2;
        int altura = 3;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame la base");
        
        base = sc.nextInt();
        
        System.out.println("Dame la altura");
        altura =  sc.nextInt();
        
        
        System.out.println("El area del rectangulo es:");
        int resultado = (base*altura)/2;
        System.out.println(resultado);
    }
}
