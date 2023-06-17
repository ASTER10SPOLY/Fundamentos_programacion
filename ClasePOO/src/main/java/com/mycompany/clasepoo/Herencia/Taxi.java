
package com.mycompany.clasepoo.Herencia;

/**
 *
 * @author PC2-AULA307
 */
public class Taxi extends Vehiculo{
    
    private int numeroLicencia;

    public Taxi(String matricula, int modelo) {
        super(matricula, modelo);
    }
    
    

    public int getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia(int numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    @Override
    public int velocidadMaxima() {
        return 120;
    }
    
    
    
}
