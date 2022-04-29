package com.company;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        Institut ins = new Institut();
        ins.InsName("La Guineueta");

        Professor p1 = new Professor();
        p1.canviarSou(1.532);
        p1.canviarNom("Marc");
        p1.assignarDni("123445F");
        ins.afegirProfe(p1);

        ProfessorSubstitut ps = new ProfessorSubstitut();
        ps.canviarNom("Laura");
        ps.canviarSou(1.222);
        ps.assignarDni("43545245Y");
        ps.assignarSubstitucio("2022/12/22",
                "2023/12/23");
        ins.afegirProfe(ps);

        Estudiant e= new Estudiant();
        e.canviarNom("Joan");
        e.assignarDni("131231A");
        e.posarNota(7.5);
        ins.afegirEstudiant(e);

        ins.imprimirInformacio();
    }
}