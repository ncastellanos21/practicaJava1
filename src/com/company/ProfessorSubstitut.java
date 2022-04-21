package com.company;

public class ProfessorSubstitut extends Professor{

    private String dataInici;
    private String dataFi;
    public ProfessorSubstitut() {}

    public void assignarSubstitucio(String dataInici, String dataFi) {this.dataInici = dataInici;
        this.dataFi = dataFi;}

    public String obtenirDades() {
        return super.obtenirDades() + " Iniciara el: " + this.dataInici + " y finalizara el: " + this.dataFi;
    }

}
