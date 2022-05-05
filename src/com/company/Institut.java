package com.company;

import java.time.Period;
import java.util.ArrayList;
import  java.util.List;

public class Institut {
    private String name;
    List<Persona> personas = new ArrayList<>();
    private String afegirProfe;
    private String afegirEstudiant;
    public void InsName(String nom1) {
        this.name = name;
    }
    public void afegirProfe(Professor profe ){
        this.personas.add(profe);

    }
    public void afegirEstudiant(Estudiant estudiant){
        this.personas.add(estudiant);
    }
    public void imprimirInformacio() throws  Exception {
        System.out.println(" El Institut " + this.name);
        for (Persona p : personas) {
            System.out.println(p.obtenirDades());
        }
    }

}
