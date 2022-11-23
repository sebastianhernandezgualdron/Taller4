package taller4;

import java.util.Scanner;

public class Ejercicio16 {
/*
Dada las horas trabajadas por un empleado determinar cuánto gana semanalmente y
mensualmente, si el trabajador debe trabajar mínimo 38h semanales y un máximo de 56h.
Se debe pedir la cantidad de horas trabajadas y verificar que esté dentro del rango
permitido, también se debe pedir el precio de la hora. Imprimir la cantidad de horas
trabajadas y el pago.
*/
   
    public static void main(String[] args) {
        /*
        DS: cantidad de horas y pago mensual y semanal
        DE: Numero de horas trabajadas
        */
        double horas;
        double preciohora;
        double pagosemana;
        double pagomes;
        pagomes = 0 ;
        pagosemana = 0;
        Scanner read = new Scanner (System.in);
        
        System.out.println("Introduzca la cantidad de horas trabajadas durante la semana");
        horas = read.nextDouble();
        System.out.println("Introduzca el precio por hora trabajada:");
        preciohora = read.nextDouble();
        if(horas>37 && horas<57){
            pagosemana=horas*preciohora;
            pagomes=pagosemana*4;
            System.out.println("La cantidad de horas trabajadas durante la semana son:"+ horas);
            System.out.println("La cantidad de horas trabajadas durante el mes son:"+ horas*4);
            System.out.println("el pago semanal es:"+ pagosemana);
            System.out.println("el pago mensual es:"+ pagomes);
            }else{
                    System.out.println("error");
        }
        
        
        
    }
    
}