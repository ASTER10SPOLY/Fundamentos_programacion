/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aplicacionconsola;

import com.mycompany.aplicacionconsola.matematicas.Calculadora;
import java.util.Scanner;

/**
 *
 * @author PC2-AULA307
 */
public class AplicacionConsola {

    public static void main(String[] args) {
       Scanner leerPorTeclado = new Scanner(System.in);
       double numero1;
       double numero2;
       double resultado;
       int opcion;
       
       System.out.println("Hola soy una calculadora");
       System.out.println("Ingresa una opcion para calcular.");
       System.out.println("1. Suma 2. Resta 3. Division 4. Multiplicacion 5. Salir");
       
       opcion = leerPorTeclado.nextInt();
       //System.out.println(opcion);
       
       System.out.println("Ingrese numero 1");
       numero1 = leerPorTeclado.nextDouble();
       System.out.println("Ingrese numero 2");
       numero2 = leerPorTeclado.nextDouble();
        
       Calculadora calculadora = new Calculadora(numero1, numero2);
       
       if(opcion == 1){
       resultado = calculadora.getSuma();
       System.out.println("resultado =" + resultado);    
       }else if(opcion == 2){
       resultado = calculadora.getResta();
       System.out.println("resultado =" + resultado);
       }else if(opcion == 3 && numero2 != 0){
        calculadora.getDivision();
       System.out.println("resultado =");        
       }else if(opcion ==4){
       resultado = AplicacionConsola.getMultiplicacion(numero1, numero2); 
       System.out.println("resultado =" + resultado);     
       }else{
       System.out.println("Opcion no valida");
         
       }
                
    } 
    
    
        
        public static double getMultiplicacion(double valor1, double valor2){
        return valor1 * valor2;
    }
} 


