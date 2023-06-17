
package com.mycompany.clasepoo.Herencia;

/**
 *
 * @author PC2-AULA307
 */
public class Vehiculo {
    
   private String matricula;
   
   private int modelo;

    public Vehiculo(String matricula, int modelo) {
        this.matricula = matricula;
        this.modelo = modelo;
    }
   
   

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }  
    
    public int velocidadMaxima(){
        return 80;
    }
}
