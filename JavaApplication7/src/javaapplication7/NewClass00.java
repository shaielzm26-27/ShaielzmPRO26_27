/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class NewClass00 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // el usuario introduce dos números nosotros le devolvemos la multiplicación la suma y la resta
        
        Scanner scanner = new Scanner(System.in);
        
        // Solicitamos el primer número
        System.out.print("Introduce el primer numero: ");
        double num1 = scanner.nextDouble();
        
        // Solicitamos el segundo número
        System.out.print("Introduce el segundo numero: ");
        double num2 = scanner.nextDouble();
        
        // Realizamos las operaciones
        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        
        // Mostramos los resultados por pantalla
        System.out.println("Suma: " + num1 + " + " + num2 + " = " + suma);
        System.out.println("Resta: " + num1 + " - " + num2 + " = " + resta);
        System.out.println("Multiplicacion: " + num1 + " * " + num2 + " = " + multiplicacion);
        
    }
}

    

