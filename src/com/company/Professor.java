package com.company;

public class Professor extends Persona{

    private double nouSou;
    public Professor() {}

    public void canviarSou(double nouSou) {
        this.nouSou = nouSou;
    }

    public String obtenirDades() {
        return super.obtenirDades() + ", que te un sou de: " + this.nouSou + " euros.";
    }
}
