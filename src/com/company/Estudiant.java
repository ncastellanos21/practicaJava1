package com.company;

public class Estudiant extends Persona{
    //Si aqui no fico res, ja té tot el que te la classe persona - EXTENDS PERSONA

        private double nota;
        public Estudiant() {}

        public void posarNota(double nota) throws Exception {
                if (nota>=0 && nota<=10) {
                        this.nota = nota;
                } else {
                        throw new Exception("LA NOTA NO POT SER NEGATIVA NI SUPERIOR A 10.");
                }
        }

        public void afegirNota()

        public String obtenirDades() throws Exception {
        //Vull que em digui el mateix que persona + la nota
                return super.obtenirDades() + " [Alumne que te una nota de:  " + this.nota + "]";
        }

        }
