/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.proyectomatriz;

import java.util.Scanner;

public class ProyectoMatriz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese tamaño de matriz: ");
        int n = sc.nextInt();

        String[][] matrix;
        
        int opcion;
        
        do {
            System.out.println("\nMenú");
            System.out.println("1. Llenar matriz con un solo caracter o numero");
            System.out.println("2. Llenar matriz con diferentes caracteres o numero");
            System.out.println("3. Cambiar tamaño de matriz"); 
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            
            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.print("\nIngrese el caracter: ");
                String charToFill = sc.next();
                matrix = Metodos.llenarMatrizUniCaracter(n, charToFill);
                Metodos.imprimirMatrizA(matrix, n);

                Metodos.imprimirMatrizB(matrix, n);
            } else if (opcion == 2) {
                matrix = Metodos.llenarMatrizMultiCaracter(n);
                Metodos.imprimirMatrizA(matrix, n);

                Metodos.imprimirMatrizB(matrix, n);
            }else if(opcion == 3) {
                System.out.print("\nIngrese nuevo tamaño: ");
                n = sc.nextInt(); 
            }
            
        } while(opcion != 4);
    }
}
