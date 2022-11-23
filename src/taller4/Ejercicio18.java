package taller4;

import java.util.Scanner;

public class Ejercicio18 {
/*
Realizar un algoritmo que calcule el salario a pagar de un empleado según los siguientes
parámetros:
• Si gana menos de 700.000, descuento de pensión =-2%, descuento de salud =-4% y
más Aux. de transporte= +11%.
• Si gana entre 741.000 y 999.999, descuento de pensión =-4%, descuento de salud =-
6% y más Aux. de transporte= +9%.
• Si gana más 1.000.000 y menos 1.800.00, descuento por pensión es -6%, descuento de
seguro de vida 5%, descuento de salud =-6% y más Aux. de transporte= +9%.
• Si gana más de 1.800.000 y menos de 2.500.00, descuento por pensión es -6%,
descuento de seguro de vida 5%, descuento de salud =-8% y más Aux. de transporte=
+8%.
• Si gana más de 2.500.000, descuento por pensión es -8%, descuento de seguro de vida
6%, descuento de salud =-10% y más Aux. de transporte= +9%.
*/
   
    public static void main(String[] args) {
        /*
        DS: salario con descuentos
        DE: salario
        */
        double salario;
       
        Scanner read = new Scanner (System.in);
        
        System.out.println("Introduzca la su salario");
        salario = read.nextDouble();
        if(salario<700000){
             salario=(salario*(-0.02))-(salario*0.04)+(salario*0.11)+salario;  
        }else{
        if(salario>740999 && salario<1000000){
            salario=(salario*(-0.02))-(salario*0.04)+(salario*0.11)+salario;
          }
        else{
              if(salario>1000000 && salario<1800000){
                  salario=(salario*(-0.04))-(salario*0.06)+(salario*0.09)+salario;
               }    
        else{
        if(salario>1800000 && salario<2500000){
            salario=(salario*(-0.06))+(salario*0.05)-(salario*0.06)+(salario*0.09)+salario;
          }           
        else{
        if(salario>2500000){
            salario=(salario*(-0.08))+(salario*0.06)-(salario*0.10)+(salario*0.09)+salario;
        }
        }
        }
        }  
    } 
        System.out.println("su salario con descuento es:"+salario);
    }
    
}