package com.company;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        Institut ins = new Institut();
        ins.InsName("La Guineueta");

        Professor p1 = new Professor();
        //p1.canviarSou(15000);
        p1.canviarSou(1500);
        p1.canviarNom("Marc");
        p1.assignarDni("123445F");
        ins.afegirPersona(p1);

        ProfessorSubstitut ps = new ProfessorSubstitut();
        ps.canviarNom("Laura");
        ps.canviarSou(1800);
        ps.assignarDni("65892367A");
        //ps.assignarDni("65892367A");
        Date dataInici = new Date(2021, 01, 25);
        Date dataFi = new Date(2023, 06, 22);
        ps.assignarSubstitucio(dataInici, dataFi);
        ins.afegirPersona(ps);

        Estudiant e= new Estudiant();
        e.canviarNom("Joan");
        e.assignarDni("12345621A"); //Comentar para probar la funcion de DNI obligatori
        e.posarNota(7.5);
        e.posarNota(4.7);
        e.posarNota(9.2);
        e.posarNota(6.3);
        ins.afegirPersona(e);

        ins.imprimirInformacio();
    }
}