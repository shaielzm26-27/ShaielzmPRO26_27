/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class NewClass01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Indique su edad: ");
        int edad = sc.nextInt();
        
        boolean suEdadEsMayorOIgualQue18 = edad >= 18;
        System.out.println("es adulto " + suEdadEsMayorOIgualQue18);
        
        boolean suEdadEsMenorQue18 = edad < 18;
        System.out.println("no es adulto " + suEdadEsMenorQue18);
        
        
        /*
        boolean dosIgualesAtres = 2 == 3;
        boolean otraComparacion = 2 == 2;
        System.out.println(dosIgualesAtres);
        System.out.println(otraComparacion);
        int a = 5;
        boolean comparacionDistintoDe = a != 5;
        System.out.println("es distinto de 5 ? " + comparacionDistintoDe);
        
        boolean esMayorQue4 = a > 4;
        System.out.println("es mayor que 4 " + a);
        
        boolean esAMenorOIgualQue7 = a <= 7;
        System.out.println("Es menor o igual a 7 ? " + esAMenorOIgualQue7);
        
        boolean esAMayorOIgualQue8 = a >= 8;
        System.out.println("Es a mayor o igual que 8 ? " + esAMayorOIgualQue8);
        */
        
    }
}
