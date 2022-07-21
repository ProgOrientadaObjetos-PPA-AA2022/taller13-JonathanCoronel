/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

import java.util.ArrayList;
import p1.MatriculaCampamento;
import p1.MatriculaColegio;
import p1.MatriculaEscuela;
import p1.MatriculaJardin;
import p1.MatriculaMaternal;
import p1.Matricula;
import p2.TipoMatricula;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {

        MatriculaCampamento mcamp = new MatriculaCampamento();
        mcamp.establecerTarifa();

        MatriculaColegio mcolegio = new MatriculaColegio();
        mcolegio.establecerTarifa();

        MatriculaEscuela mescuela = new MatriculaEscuela();
        mescuela.establecerTarifa();
        MatriculaJardin mjardin = new MatriculaJardin();
        mjardin.establecerTarifa();
        MatriculaMaternal mmaternal = new MatriculaMaternal();
        mmaternal.establecerTarifa();
        MatriculaMaternal mmaternal2 = new MatriculaMaternal();
        mmaternal2.establecerTarifa();

        ArrayList<Matricula> matri = new ArrayList<>();
        matri.add(mcamp);
        matri.add(mcolegio);
        matri.add(mescuela);
        matri.add(mjardin);
        matri.add(mmaternal);
        matri.add(mmaternal2);
        
        TipoMatricula tipos = new TipoMatricula();
        tipos.establecerLisMatricula(matri);
        tipos.establecerPromedioTarifas();
        System.out.printf("%s\n", tipos);
    }
}
