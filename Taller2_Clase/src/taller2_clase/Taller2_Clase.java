/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2_clase;

import java.util.Scanner;

/**
 *
 * @author BOG-A308-E-007
 */
public class Taller2_Clase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double Alg;
        double Qui;
        double Soc;
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ingresar nota de Algebra: ");
        Alg = sc.nextDouble();
        System.out.println("Ingresar nota de Quimica: ");
        Qui = sc.nextDouble();
        System.out.println("Ingresar nota de Sociales: ");
        Soc = sc.nextDouble();
        
        double Not = Alg+Qui+Soc;
        double Pro = Not/3;
        
        System.out.println("El promedio de sus notas es : "+Pro);
        
        if(Pro>=3){
            System.out.println("El estudiante aprobo el Semestre");
        }else{
            System.out.println("El estudiante No aprobo el Semestre");
        }
    }
    
}
