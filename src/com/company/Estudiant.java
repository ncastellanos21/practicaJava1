package com.company;

import java.util.ArrayList;
import java.util.List;

public class Estudiant extends Persona{
    //Si aqui no fico res, ja té tot el que te la classe persona - EXTENDS PERSONA

        List<Double> notas = new ArrayList<>();
        private double nota;
        private double media;
        public Estudiant() {}

        public void posarNota(double nota) throws Exception {
                this.notas.add(nota);
                if (nota>=0 && nota<=10) {
                        this.nota = nota;
                } else {
                        throw new Exception("LA NOTA NO POT SER NEGATIVA NI SUPERIOR A 10.");
                }

                for (int i=0; i<this.notas.size(); i++) {
                        media = media + this.notas.get(i);
                }

                media = media / this.notas.size();


        }

        public String obtenirDades() throws Exception {
        //Vull que em digui el mateix que persona + la nota
                return super.obtenirDades() + " [Alumne que te una nota de:  " + this.notas + media +"]";
        }

        }
