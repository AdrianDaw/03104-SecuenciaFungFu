/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.main;

/**
 *
 * @author Adrián Pérez Rodríguez - adrianp899@gmail.com
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Constantes
        final double dineroInicial = 2.00;
        final double precioPelicula = 1.30;
        final double precioPalomita = 0.90;
        final double partePalomitas;
        final double gastoTotalPersona;
        final double restante;
        
        // Operaciones
        partePalomitas = precioPalomita / 2;
        
        gastoTotalPersona = precioPelicula + partePalomitas;
        
        restante = dineroInicial - gastoTotalPersona;
        
        
        // Cabecera
        System.out.println("Secuencia de Kung-Fu");
        System.out.println("====================");
               
        // Salida consola
        System.out.printf("Dinero inicial......: %1.2f € %n", dineroInicial);
        System.out.println("---");
        System.out.printf("Precio pelicula.....: %1.2f € %n", precioPelicula);
        System.out.printf("Parte palomitas.....: %1.2f € %n", partePalomitas);
        System.out.println("---");
        System.out.printf("Gastos por persona..: %1.2f € %n", gastoTotalPersona);       
        System.out.println("---");
        System.out.printf("Dinero restante.....: %1.2f € %n", restante);       
    }
}
    
