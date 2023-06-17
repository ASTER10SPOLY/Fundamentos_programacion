package com.mycompany.clasepoo;

//import com.mycompany.clasepoo.poo.Animal;
import com.mycompany.clasepoo.Herencia.Autobus;
import com.mycompany.clasepoo.Herencia.Taxi;
import com.mycompany.clasepoo.Herencia.Vehiculo;

/**
 *
 * @author PC2-AULA307
 */
public class ClasePOO {

    public static void main(String[] args) {

        /*Animal perro = new Animal("Blu", 10, "Labrador", "Dorado");
        
        perro.caminar();
         */
        Vehiculo vehiculo = new Vehiculo("ODN2012", 2023);

       
        vehiculo.setMatricula("ODN2012");
        vehiculo.setModelo(2023);
        System.out.println(vehiculo.getModelo());
        System.out.println(vehiculo.getMatricula());
        
        Taxi taxi = new Taxi("ODN2020", 2023);
        
        System.out.println("Velocidad del taxi " + taxi.velocidadMaxima());
        System.out.println(taxi.getMatricula());
        System.out.println(taxi.getModelo());
        
        
        Autobus bus = new Autobus(1, "ODN2030", 2023);
        
        System.out.println("Velocidad del bus " + bus.velocidadMaxima());
        System.out.println(bus.getModelo());
        System.out.println(bus.getNumeroPlazas());
        System.out.println(bus.getMatricula());
        
    }
}
