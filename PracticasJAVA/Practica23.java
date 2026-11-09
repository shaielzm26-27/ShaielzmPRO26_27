
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author shaie
 */

    /**
     * @param args the command line arguments
     */

public class Practica23 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double a, b, c;
        double discriminante;
        double x1, x2;

        System.out.println("ECUACION DE SEGUNDO GRADO");
        System.out.println("Formula: ax^2 + bx + c = 0");

        System.out.print("Introduce el valor de a: ");
        a = teclado.nextDouble();

        System.out.print("Introduce el valor de b: ");
        b = teclado.nextDouble();

        System.out.print("Introduce el valor de c: ");
        c = teclado.nextDouble();

        if (a == 0) {

            System.out.println("El valor de a no puede ser 0");

        } else {

            discriminante = (b * b) - (4 * a * c);

            if (discriminante < 0) {

                System.out.println("No hay solucion real");

            } else if (discriminante == 0) {

                x1 = -b / (2 * a);

                System.out.println("Existe una unica solucion:");
                System.out.println("x = " + x1);

            } else {

                x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                x2 = (-b - Math.sqrt(discriminante)) / (2 * a);

                System.out.println("Las dos soluciones son:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);

            }
        }

    }
}
