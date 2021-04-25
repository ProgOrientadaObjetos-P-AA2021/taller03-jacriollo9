/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.Terreno1;



/**
 *
 * @author Usuario iTC
 */
public class Ejecutor1 {
    public static void main(String[] args) {
        Terreno1 terreno = new Terreno1();

        double largo = 50.30;
        double ancho = 116.20;
        double valormetrocuadrado = 30;

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
