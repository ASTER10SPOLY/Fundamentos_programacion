
package com.mycompany.clasepoo.Herencia;

/**
 *
 * @author PC2-AULA307
 */
public class Autobus extends Vehiculo{
    
    private int numeroPlazas;

    public Autobus(int numeroPlazas, String matricula, int modelo) {
        super(matricula, modelo);
        this.numeroPlazas = numeroPlazas;
    }

    
    

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }
   
    
}
