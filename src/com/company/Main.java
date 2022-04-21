package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Persona p1 = new Persona(); //instacia de persona
        Persona p2 = new Persona();
        Estudiant e1 = new Estudiant();

        p1.canviarNom("Naomy");
        String dades = p1.obtenirDades();
        System.out.println(dades);

        p1.canviarNom("Nelly");
        dades = p1.obtenirDades();
        System.out.println(dades);
        
        Estudiant e =new Estudiant();
        e.posarNota(7.5);
        e.canviarNom("Lara");
        dades = e.obtenirDades();
        System.out.println(dades);

        Professor pr = new Professor();
        pr.canviarSou(1500);
        pr.canviarNom("Pere");
        dades = pr.obtenirDades();
        System.out.println(dades);

        ProfessorSubstitut ps = new ProfessorSubstitut();
        ps.assignarSubstitucio("12/12/22",
                "12/12/23");
        ps.canviarNom("Luis");
        ps.canviarSou(1100);
        dades = ps.obtenirDades();
        System.out.println(dades);
    }
}
