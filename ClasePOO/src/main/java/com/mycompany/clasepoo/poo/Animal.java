package com.mycompany.clasepoo.poo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC2-AULA307
 */
public class Animal {

    /*ATRIBUTOS*/
    private String nombre;

    private int edad;

    private String raza;

    private String color;

    /*CONSTRUCTOR*/
    public Animal(String nombre, int edad, String raza, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.color = color;
    }

    /*METODOS*/
    public void comer() {
        System.out.println("Estoy comiendo");
    }

    public void caminar() {
        System.out.println("Estoy caminando");
    }

    public void correr() {
        System.out.println("Estoy corriendo");
    }

}
