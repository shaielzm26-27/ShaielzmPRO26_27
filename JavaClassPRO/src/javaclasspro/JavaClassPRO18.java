/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaclasspro;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class JavaClassPRO18 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int salario = 18;
        double salarioSemanal;
        int horas;
        
        System.out.println("Horas trabajadas: ");
        horas = sc.nextInt();
        
        salarioSemanal = horas * salario / 7;
        
        System.out.println("El salario semanal ganado cada dia de la semana es: " + salarioSemanal);        
        System.out.println("El salario semanal acumulado por las horas de trabajo es: " + salario * horas);
    }
    
}
