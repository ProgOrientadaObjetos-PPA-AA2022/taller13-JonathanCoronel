/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import java.util.ArrayList;
import p1.Matricula;

/**
 *
 * @author reroes
 */
public class TipoMatricula {

    private double promedioMatriculas;
    private ArrayList<Matricula> lisMatriculas;
    //private MatriculaCampamento campamento;
    //private MatriculaColegio colegio;
    // private MatriculaEscuela escuela;
    // private MatriculaJardin jardin;
    // private MatriculaMaternal maternal;
    // private MatriculaMaternal maternal2;

    public void establecerLisMatricula(ArrayList<Matricula> lis) {
        lisMatriculas = lis;
    }

    public ArrayList<Matricula> obtenerListaMAtricula() {
        return lisMatriculas;
    }

    public void establecerPromedioTarifas() {
        double suma = 0;
        for (int i = 0; i < lisMatriculas.size(); i++) {
            suma = suma + lisMatriculas.get(i).obtenerTarifa();
        }
        promedioMatriculas = suma / lisMatriculas.size();

    }

    public double obtenerPromedioTarifas() {
        return promedioMatriculas;
    }

    @Override
    public String toString() {
        String cadena = String.format("Reporte\n");
        for (int i = 0; i < lisMatriculas.size(); i++) {
           cadena = String.format("%s%s\n", cadena,
                    lisMatriculas.get(i));
        }
          cadena = String.format("%sPromedio Tarifas: %.2f\n", cadena,
                    promedioMatriculas);
        return cadena;
    }
}
