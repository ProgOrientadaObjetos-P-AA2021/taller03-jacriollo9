/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.CantidadHoras1;

/**
 *
 * @author Usuario iTC
 */
public class Ejecutor1 {
    public static void main(String[] args) {
        CantidadHoras1 equivalenteHoras = new CantidadHoras1();

        int horas = 72;
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
