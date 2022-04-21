package com.company;

public class Estudiant extends Persona{
    //Si aqui no fico res, ja té tot el que te la classe persona - EXTENDS PERSONA

        private double nota;
        public Estudiant() {}

        public void posarNota(double nota) {
                this.nota = nota;
        }

        public String obtenirDades() {
        //Vull que em digui el mateix que persona + la nota
                return super.obtenirDades() + ", que te una nota de:  " + this.nota;
        }

        }
