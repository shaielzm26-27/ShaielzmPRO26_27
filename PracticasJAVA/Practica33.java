
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author shaie
 */
public class Practica33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Scanner scanner = new Scanner(System.in);
        final int PIN_CORRECTO = 1234;
        
        System.out.println("--- ELIJA LA VERSIÓN DEL BUCLE ---");
        System.out.println("1. Usando while");
        System.out.println("2. Usando do-while");
        System.out.println("3. Usando for");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();
        
        switch (opcion) {
            case 1:
                {
                    int intentos = 3;
                    boolean acertado = false;
                    
                    while (intentos > 0 && !acertado) {
                        System.out.print("Introduce el PIN: ");
                        int pinIngresado = scanner.nextInt();
                        
                        if (pinIngresado == PIN_CORRECTO) {
                            System.out.println("El código es correcto. Bienvenido");
                            acertado = true;
                        } else {
                            intentos--;
                            if (intentos > 0) {
                                System.out.println("Incorrecto. Te quedan " + intentos + " intentos.");
                            } else {
                                System.out.println("Agotaste tus 3 intentos. El programa termina.");
                            }
                        }
                    }
                }
                break;
                
            case 2:
                {
                    int intentos = 3;
                    boolean acertado = false;
                    
                    do {
                        System.out.print("Introduce el PIN: ");
                        int pinIngresado = scanner.nextInt();
                        
                        if (pinIngresado == PIN_CORRECTO) {
                            System.out.println("El código es correcto. Bienvenido");
                            acertado = true;
                            break;
                        } else {
                            intentos--;
                            if (intentos > 0) {
                                System.out.println("Incorrecto. Te quedan " + intentos + " intentos.");
                            } else {
                                System.out.println("Agotaste tus 3 intentos. El programa termina.");
                            }
                        }
                    } while (intentos > 0);
                }
                break;
                
                
            case 3:
                {
                    boolean acertado = false;
                    
                    for (int i = 3; i > 0; i--) {
                        System.out.print("Introduce el PIN: ");
                        int pinIngresado = scanner.nextInt();
                        
                        if (pinIngresado == PIN_CORRECTO) {
                            System.out.println("El código es correcto. Bienvenido");
                            acertado = true;
                            break;
                        } else {
                            int restantes = i - 1;
                            if (restantes > 0) {
                                System.out.println("Incorrecto. Te quedan " + restantes + " intentos.");
                            } else {
                                System.out.println("Agotaste tus 3 intentos. El programa termina.");
                            }
                        }
                    }
                }
                break;
                
            default:
                System.out.println("Opción no válida.");
        }
        
    }
}
