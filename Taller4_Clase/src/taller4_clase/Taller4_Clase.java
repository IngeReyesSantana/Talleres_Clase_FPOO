/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller4_clase;

import java.util.Scanner;

/**
 *
 * @author BOG-A308-E-007
 */
public class Taller4_Clase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double Base, Altura;
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingresar altura del rectangulo: ");
        Altura = sc.nextDouble();
        System.out.println("Ingresar base del rectangulo: ");
        Base = sc.nextDouble();
        double Area = Base*Altura;
        System.out.println("El area del rectangulo es: "+Area);
        if(Area > 20){
            System.out.println("El rectangulo es muy grande");
        }
    }
    
}
