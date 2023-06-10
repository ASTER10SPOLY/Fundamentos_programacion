
package com.mycompany.aplicacionconsola.matematicas;


public class Calculadora {
    
    /*
    ATRIBUTOS
    */
    
    private double operacion1;
    private double operacion2;
    
    /*
    CONSTRUCTOR
    */

    public Calculadora(double operacion1, double operacion2) {
        this.operacion1 = operacion1;
        this.operacion2 = operacion2;
    }
    
    /*
    METODOS
    */
    
    public double getSuma(){
        return this.operacion1 + this.operacion2;
    }
    
    public double getResta(){
        return operacion1 - operacion2;
    }
    
    public void getDivision(){
     
        try {
            double resultado = operacion1 / operacion2;
            System.out.println("El resultado de la division es" + resultado);
        } catch (Exception e) {
            System.err.println("No se puede dividir por 0");
            System.err.println(e.getMessage());
        }
       
    }
}
