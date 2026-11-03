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
public class JavaClassPRO02 {


    public static void main(String[] args) {
        //El usuario nos da un numero
        //vamos a convertir ese numero de una letra
        //se espera que el numero sea entre 1 y 255 (no lo comprobamos)
        //y mostramos la letra que corresponde en ascii
        
        /*
        char c = (char)num;
        */
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("dame un numero");
        int num = sc.nextInt();
        
        char c = (char)num;
        
        System.out.println("la letra en ascii es: " + c);
       
    }
}
