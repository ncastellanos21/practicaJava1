package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Persona p1 = new Persona(); //instacia de persona
        Estudiant e1 = new Estudiant();
        Institut i1 = new Institut();

        p1.canviarNom("Naomy");
        String dades = p1.obtenirDades();
        System.out.println(dades);

        p1.canviarNom("Nelly");
        dades = p1.obtenirDades();
        System.out.println(dades);

        i1.nomIES("Santa CLara");
        Professor profe = new Professor();
        i1.afegirProfe(profe);
        Estudiant estudiant = new Estudiant();
        i1.afegirEstudiant(estudiant);
        String imprimir = i1.imprimirInformacio();
        System.out.println(imprimir);
        
        Estudiant e = new Estudiant();
        e.posarNota(7.5);
        e.canviarNom("Lara");
        e.assignarDni(123456);
        dades = e.obtenirDades();
        System.out.println(dades);

        Professor pr = new Professor();
        pr.canviarSou(2500);
        pr.canviarNom("Pere");
        pr.assignarDni(235323);
        dades = pr.obtenirDades();
        System.out.println(dades);

        ProfessorSubstitut ps = new ProfessorSubstitut();
        ps.assignarSubstitucio("2022/12/22",
                "2023/12/23");
        ps.assignarDni(293463);
        ps.canviarNom("Luis");
        ps.canviarSou(1500);
        dades = ps.obtenirDades();
        System.out.println(dades);
    }
}
