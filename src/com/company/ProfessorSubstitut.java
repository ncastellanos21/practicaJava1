package com.company;

import java.util.Date;

public class ProfessorSubstitut extends Professor{

    private Date dataInici;
    private Date dataFi;
    public ProfessorSubstitut() {}

    public void assignarSubstitucio(Date dataInici, Date dataFi) {this.dataInici = dataInici;
        this.dataFi = dataFi;}

    public String obtenirDades() throws Exception {
        return super.obtenirDades() + " Iniciara el: " + dataInici.getYear() + "/" + dataInici.getMonth() + "/" +
                dataInici.getDate() +
                " y finalizara el: " + dataFi.getYear() + "/" + dataFi.getMonth() + "/" + dataFi.getDate();
    }

}
