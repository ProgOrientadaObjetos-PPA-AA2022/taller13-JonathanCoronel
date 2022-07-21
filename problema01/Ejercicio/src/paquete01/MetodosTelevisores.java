/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.ArrayList;

/**
 *
 * @author SALAI
 */
public class MetodosTelevisores {

    private ArrayList<Televisor> listaTelevisores;
    private double totalPrecioTvs;
    private double televisorMasCaro;
    private String listaMarcasVendidas;

    public void establecerListaTelevisores(ArrayList<Televisor> lista) {
        listaTelevisores = lista;
    }

    public ArrayList<Televisor> obtenerListaTelevisores() {
        return listaTelevisores;
    }

    public void establecerTotalPrecioTvs() {
        for (int i = 0; i < listaTelevisores.size(); i++) {
            totalPrecioTvs = totalPrecioTvs + listaTelevisores.get(i).obtenerPrecio();
        }
    }

    public double obtenerTotalPrecioTvs() {
        return totalPrecioTvs;
    }

    public void establecerListaMarcasVendidas() {
        for (int i = 0; i < listaTelevisores.size(); i++) {
            listaMarcasVendidas = String.format("%s%s\n", listaMarcasVendidas, listaTelevisores.get(i).obtenerMarca());
        }
    }

    public String obtenerListaMarcasVendidas() {
        return listaMarcasVendidas;
    }

    public void establecertelevisorMasCaro() {
        double s = 0;
        // pass
        for (int i = 0; i < listaTelevisores.size(); i++) {
            if (listaTelevisores.get(i).obtenerPrecio() > s) {
                s = listaTelevisores.get(i).obtenerPrecio();
            }
        }
        televisorMasCaro = s;
    }

    public double obtenerTelevisorMasCaro() {
        return televisorMasCaro;
    }
}
