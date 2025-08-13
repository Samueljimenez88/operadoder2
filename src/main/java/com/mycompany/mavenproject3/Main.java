/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

import java.util.Scanner;

/**
 *
 * @author mondongo
 */
public class Main{
   public static void main(String[] args) {
        try (Scanner lector = new Scanner(System.in)) {
            System.out.print("Ingrese la nota 1: ");
            double nota1 = lector.nextDouble();
            
            System.out.print("Ingrese la nota 2: ");
            double nota2 = lector.nextDouble();
            
            System.out.print("Ingrese la nota 3: ");
            double nota3 = lector.nextDouble();
            
            double p1 = nota1 * 0.30;
            double p2 = nota2 * 0.30;
            double p3 = nota3 * 0.40;
            
            double nf = p1 + p2 + p3;
            
            System.out.println("\nNota final: " + nf);
            
            if (nf >= 1.0 && nf <= 1.9) {
                System.out.println("Desempeño: Deficiente");
            } else if (nf >= 2.0 && nf <= 2.9) {
                System.out.println("Desempeño: Insuficiente");
            } else if (nf >= 3.0 && nf <= 3.9) {
                System.out.println("Desempeño: Aceptable");
            } else if (nf >= 4.0 && nf <= 5.0) {
                System.out.println("Desempeño: Destacado");
            } else {
                System.out.println("Nota fuera de rango.");
            }
        }
    }
}


