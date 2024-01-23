/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectomatriz;

import java.util.Scanner;

public class Metodos {

    public static String[][] llenarMatrizMultiCaracter(int n) {

        Scanner sc = new Scanner(System.in);

        String[][] matriz = new String[n][n];

        System.out.println("Ingrese caracteres: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Matriz [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.next();
            }
        }
        return matriz;
    }

    public static String[][] llenarMatrizUniCaracter(int n, String caracter) {
        String[][] matrix = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = caracter;
            }
        }
        return matrix;
    }

    public static void imprimirMatrizA(String[][] matriz, int n) {

        System.out.println("\nMatriz a)");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void imprimirMatrizB(String[][] matriz, int n) {

        System.out.println("\nMatriz B)");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

