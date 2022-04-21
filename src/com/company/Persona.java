package com.company;

public class Persona {
    //Atributs (sempre privats)
    private String nom;
    private String dni;

    //funcions (poden ser publiques o privades)
    public Persona() {
        //constructora
        //System.out.println("Hola");
    }

    public void canviarNom(String nom) {
        this.nom = nom;
    }

    public void assignarDni(String dni) {
        this.dni = dni;
    }

    public String obtenirDades() {
        return "Persona que es diu " + this.nom
                + "con dni " + this.dni;
    }
}
