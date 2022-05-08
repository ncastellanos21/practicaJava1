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

        Estudiant e1= new Estudiant();
        e1.canviarNom("Joan");
        e1.assignarDni("12345621A"); //Comentar para probar la funcion de DNI obligatori
        e1.posarNota(9.8);
        e1.posarNota(8.55);
        e1.posarNota(5.65);
        e1.posarNota(6.85);
        e1.posarNota(9.65);
        e1.posarNota(9.45);
        e1.posarNota(5.0);
        e1.posarNota(2.8);
        e1.posarNota(3.95);
        ins.afegirPersona(e1);

        Estudiant e2 = new Estudiant();
        e2.canviarNom("Maria");
        e2.assignarDni("34345621B"); //Comentar para probar la funcion de DNI obligatori
        e2.posarNota(9.8);
        e2.posarNota(8.55);
        e2.posarNota(8.65);
        e2.posarNota(9.85);
        e2.posarNota(9.65);
        e2.posarNota(9.45);
        e2.posarNota(8.0);
        e2.posarNota(7.8);
        e2.posarNota(8.95);
        ins.afegirPersona(e2);
        ins.imprimirInformacio();
    }
}