/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3_clase;

import java.util.Scanner;

/**
 *
 * @author BOG-A308-E-007
 */
public class Taller3_Clase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double Numero;
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingresar un numero: ");
        Numero = sc.nextDouble();
        
        if(Numero > 0){
            System.out.println("El numero es positivo");
        }else{
            System.out.println("El numero es Negativo");
        }
    }
    
}
