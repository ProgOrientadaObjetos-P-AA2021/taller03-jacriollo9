/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.CantidadHoras;

/**
 *
 * @author Usuario iTC
 */
public class Ejecutor {
    public static void main(String[] args) {
        CantidadHoras equivalenteHoras = new CantidadHoras();

        int horas = 48;
        equivalenteHoras.establecerHoras(horas);
        equivalenteHoras.calcularMinutos();
        equivalenteHoras.calcularSegundos();
        equivalenteHoras.calcularDias();
        System.out.printf("Horas establecidas: %d\n"
                + "Minutos: %d\n " + "Segundos: %d\n " + "Dias: %.2f\n ",
                equivalenteHoras.obtenerHoras(),equivalenteHoras.obtenerMinutos(),
                equivalenteHoras.obtenerSegundos(),equivalenteHoras.obtenerDias());

    }
}
