package taller1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author yosef
 */
public class Metodos {

    Random rnd = new Random();

    public void Interfaz() {
        Metodos metodos = new Metodos();
        Scanner scan = new Scanner(System.in);

        int x, y; //Tamaños de la matriz 

        System.out.println("Ingrese el tamaño de la matriz: ");

        x = scan.nextInt();
        y = scan.nextInt();
        int menu;

        int Mat[][] = new int[x][y];

        Mat = metodos.Llenar(Mat, x, y);

        System.out.println("La matriz generada es: ");
        metodos.Imprimir(Mat, x, y);
        System.out.println("   MENU");
        System.out.println("1. Derecha");
        System.out.println("2. Izquierda");
        System.out.println("3. Salir");
        System.out.println("Seleccione la opcion");
        menu = scan.nextInt();

        switch (menu) {
            case 1:
                System.out.println("1. 90°");
                System.out.println("2. 180°");
                System.out.println("3. Salir");
                menu = scan.nextInt();
                switch (menu) {
                    case 1:
                        metodos.Derecha(Mat, x, y);
                        break;
                    case 2:
                        metodos.Derecha(Mat, x, y);
                        metodos.Giro180(Mat, x, y);
                        break;
                }
                break;
            case 2:
                System.out.println("1. 90°");
                System.out.println("2. 180°");
                System.out.println("3. Salir");
                menu = scan.nextInt();
                switch (menu) {
                    case 1:
                        metodos.Izquierda(Mat, x, y);
                        break;
                    case 2:
                        metodos.Izquierda(Mat, x, y);
                        metodos.Giro180(Mat, x, y);
                        break;
                }
                break;
            case 3:
                System.out.println("Gracias");
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }

    public int[][] Llenar(int Mat[][], int x, int y) {
        int i, j;

        for (i = 0; i < x; i++) {
            for (j = 0; j < y; j++) {
                Mat[i][j] = rnd.nextInt(8) + 1;
            }
        }
        return Mat;
    }

    public void Imprimir(int Mat[][], int x, int y) {
        int i, j;

        for (i = 0; i < x; i++) {
            for (j = 0; j < y; j++) {
                System.out.print("|" + Mat[i][j] + "|");
            }
            System.out.println("");
        }
    }

    public void Derecha(int MatrizPrincipal[][], int y, int x) {
        Metodos metodos = new Metodos();
        int Mat[][] = new int[x][y];
        int i, j;
        int aux1 = 0;
        int aux2 = 0;
        
        System.out.println("\nGiro a la Derecha:");

        for (j = 0; j < x; j++) {
            aux2 = 0;
            for (i = y - 1; i >= 0; i--) {
                Mat[aux1][aux2] = MatrizPrincipal[i][j];
                aux2++;
            }
            aux1++;
        }
        metodos.Imprimir(Mat, x, y);
    }

    public void Izquierda(int MatrizPrincipal[][], int y, int x) {
        Metodos metodos = new Metodos();
        int Mat[][] = new int[x][y];
        int i, j;
        int aux1 = 0;
        int aux2 = 0;

        System.out.println("\nGiro a la Izquierda:");
        
        for (j = x-1; j >=0 ; j--) {
            aux2 = 0;
            for (i = 0; i < y; i++) {
                Mat[aux1][aux2] = MatrizPrincipal[i][j];
                aux2++;
            }
            aux1++;
        }
        metodos.Imprimir(Mat, x, y);
    }

    public void Giro180(int MatrizPrincipal[][], int x, int y) {
        Metodos metodos = new Metodos();
        int Mat[][] = new int[x][y];
        int aux1 = x - 1;
        int aux2 = y - 1;
        int i, j;

        System.out.println("\nGiro en 180 Grados: ");
        
        for (i = 0; i < x; i++) {
            aux2 = y - 1;
            for (j = 0; j < y; j++) {
                Mat[i][j] = MatrizPrincipal[aux1][aux2];
                aux2--;
            }
            aux1--;
        }
        metodos.Imprimir(Mat, x, y);
    }

}
