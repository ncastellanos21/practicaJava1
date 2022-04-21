package com.company;

import java.util.ArrayList;

public class Institut {

    private String nom;
    private ArrayList<Persona> personas;

    public Institut() {}

    public void nomIES(String nom) {
        this.nom = nom;
    }

    public void afegirProfe(Professor professor) {
        this.personas.add(professor);
    }

    public void afegirEstudiant(Estudiant estudiant) {
        this.personas.add(estudiant);
    }

    public String imprimirInformacio() {
        return "Institut que es diu " + nom + ", el professor es: " +
                this.personas.add(professor) + " y els alumnes son: " + this.personas.add(estudiant);
    }

}
