package com.company;

public class Persona {
    //Atributs (sempre privats)
    private String nom;
    private String dni;

    //funcions (poden ser publiques o privades)
    public Persona() {
        //constructora
        //System.out.println("Hola");
    }

    public void canviarNom(String nom) {
        this.nom = nom;
    }

    public void assignarDni(String dni) throws Exception {

        if(this.dni==null){
            this.dni = dni;
        } else {
            throw new Exception("NO PUEDES CAMBIAR EL DNI.");
        }

        if(dni!=null){
            this.dni = dni;
        } else {
            throw new Exception("EL DNI ES OBLIGATORI!");
        }


    }

    public String obtenirDades() throws Exception {

        if(this.dni==null || this.nom==null){
            throw new Exception("NO PUEDES ACCEDER A SUS DATOS PORQUE NO " +
                    "TIENE DNI O NO TIENE NOMBRE.");
        } else {
            return "- " + this.nom
                    + " con dni " + this.dni;
        }

    }

}
