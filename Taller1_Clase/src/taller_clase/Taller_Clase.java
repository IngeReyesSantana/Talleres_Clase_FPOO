/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_clase;

/**
 *
 * @author BOG-A308-E-007
 */
public class Taller_Clase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double Alg = 2.8;
        double Qui = 3.2;
        double Soc = 3.8;
        
        System.out.println("La nota de Algebra es: ");
        System.out.println("La nota de Quimica es: ");
        System.out.println("La nota de Sociales es: ");
        
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
