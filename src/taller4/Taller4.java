package taller4;

import java.util.Scanner;

public class Taller4 {
/*
Realizar un programa que calcule el valor a pagar por algunos galones de gasolina si
sabemos que cada litro de gasolina vale 9.500. Imprimir la cantidad de galones, precio por
galón, cantidad de litros y precio a pagar.
*/
   
    public static void main(String[] args) {
        /*
        DS: Cantidad de galones, precio porgálon, cant de litros y precio a pagar
        DE: Cant galones
        */
        double galones;
        double litros;
        
        Scanner read = new Scanner (System.in);
        litros = 0;
        System.out.println("Introduzca la cantidad de galones:");
        galones = read.nextDouble();
        System.out.println("La cantidad de galones ingresada es:"+ galones);
        System.out.println("El precio por cada galon es de 36,100");
        litros=galones*3.8;
        System.out.println("la cantidad de litros es :" + litros);
        System.out.println("El precio total en galones es:" + galones*36100);
        System.out.println("El precio total en litros es: " + litros*9500);
        
       
        
    }
    
}