
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author shaie
 */
public class Practica38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println(" RELOJ MUNDIAL ");
        System.out.println("digame el numero de horas que desea calcular: ");
        double Horas = sc.nextDouble();
        
        int dias = (int) (Horas / 24);
        
        double horasRestantes = Horas % 24;
        int horas = (int) horasRestantes;
        
        double minutosRestantes = (horasRestantes - horas) * 60;
        int minutos = (int) minutosRestantes;
        
        double segundosRestantes = (minutosRestantes - minutos) * 60;
        int segundos = (int) Math.round(segundosRestantes);
        
        System.out.println(" \nRESULTADO ");
        System.out.println(dias + " días " + horas + " horas " + minutos + " minutos " + segundos + " segundos");
        
    }
}
