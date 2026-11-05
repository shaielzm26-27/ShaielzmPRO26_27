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
public class JavaClassPRO19 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Indica los grados Farenheit que se conviertan en Centigrados: ");
        int Farenhait = sc.nextInt();
        //double F = Farenhait;
        double C = (Farenhait-32) * 5/9;
        
        System.out.println(Farenhait + "ºF equivale a " + C +"ºC");
        
    }
}
