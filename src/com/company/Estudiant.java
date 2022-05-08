package com.company;

import java.util.ArrayList;
import java.util.List;

public class Estudiant extends Persona{
    //Si aqui no fico res, ja té tot el que te la classe persona - EXTENDS PERSONA

        List<Double> notas = new ArrayList<>();
        private double nota;
        public Estudiant() {}

        public void posarNota(double nota) throws Exception {
                this.notas.add(nota);
                if (nota>=0 && nota<=10) {
                        this.nota = nota;
                } else {
                        throw new Exception("LA NOTA NO POT SER NEGATIVA NI SUPERIOR A 10.");
                }
        }

        public String obtenirDades() throws Exception {
                double min = 0;
                double max = 0;
                double suma = 0;
                double media = 0;
                String felicitacion = "";

                for(int i=0; i<notas.size();i++){
                        suma = suma + notas.get(i);
                        media = suma/notas.size();
                        if(media>8.5) felicitacion = "   - ERES UN/A CRACK! :D-";
                        else if(media>5 && media<=7) felicitacion = "   - BIEN! Has aprobado-";
                        else if(media>7) felicitacion = "   - Lo has hecho excelente! :)-";
                        else felicitacion = "   - Nos vemos en junio :( -";

                        if(min==0 && max==0){
                                min = notas.get(i);
                                max = notas.get(i);
                        }
                        if(max< notas.get(i)) max = notas.get(i);
                        if(min>notas.get(i)) min = notas.get(i);
                }

                /*for(double valor : notas){
                        suma = suma + valor;
                        media = suma/notas.size();

                        if(min==0 && max==0){
                                min=valor;
                                max=valor;
                        }
                        if(max < valor) max = valor;
                        if(min > valor) min = valor;

                }*/

        //Vull que em digui el mateix que persona + la nota
                return super.obtenirDades() + " [Alumne que te aquestes notes:  "
                        + this.notas + "\n" + "  MEDIA: " + String.format("%.2f", media) +"   MIN: " +
                        String.format("%.2f", min) + "   MAX: " + String.format("%.2f", max) +  "]"
                        + " Tienes una nota final de: " + + Math.round(media) + felicitacion;
        }

        }
