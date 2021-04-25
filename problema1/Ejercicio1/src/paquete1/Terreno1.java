/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author Usuario iTC
 */
public class Terreno1 {
    private double costo;
    private double ancho;
    private double area;
    private double largo;
    private double valormetrocuadrado;

    public void establecerancho(double Ancho) {
        ancho = Ancho;
    }

    public void establecerlargo(double Largo) {
        largo = Largo;
    }

    public void establecervalormetrocuadrado(double MetroCuadrado) {
        valormetrocuadrado = MetroCuadrado;
    }

    public void calculararea() {
        area = largo * ancho;
    }

    public void calcularcosto() {
        costo = area * valormetrocuadrado;
    }

    public double obtenercosto() {
        return costo;
    }

    public double obtenerancho() {
        return ancho;
    }

    public double obtenerlargo() {
        return largo;
    }

    public double obtenerarea() {
        return area;
    }

    public double obtenervalormetroscuadrados() {
        return valormetrocuadrado;
    }

    public double obtenercalcularcosto() {
        return costo;
    }
}
