package com.company;

public class Professor extends Persona{

    private double nouSou;
    public Professor() {}

    public void canviarSou(double nouSou) throws Exception {

        if(nouSou<=3000) this.nouSou = nouSou;
        else throw new Exception("EL SUELDO NO PUEDE SER SUPERIOR A 3000.");
    }

    public String obtenirDades() throws Exception {
        return super.obtenirDades() +
                " [Professor que te un sou de: " + this.nouSou + " euros]";
    }
}
