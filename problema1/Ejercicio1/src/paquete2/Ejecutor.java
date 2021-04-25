/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.Terreno;

/**
 *
 * @author Usuario iTC
 */
public class Ejecutor {
    public static void main(String[] args) {
        Terreno terreno = new Terreno();

        double largo = 40.25;
        double ancho = 12.10;
        double valormetrocuadrado = 40;

        terreno.establecerlargo(largo);
        terreno.establecerancho(ancho);
        terreno.establecervalormetrocuadrado(valormetrocuadrado);
        terreno.calculararea();
        terreno.calcularcosto();
        System.out.printf("Largo del terreno: %.2f\n "
                + "Ancho del terreno: %.2f\nValor Metros cuadrados: %.2f\n"
                + "Area del terreno: %.2f\n"
                + "Costo del terreno: %.2f\n", terreno.obtenerlargo(),
                terreno.obtenerancho(), terreno.obtenervalormetroscuadrados(),
                terreno.obtenerarea(),
                terreno.obtenercalcularcosto());
    }
}
