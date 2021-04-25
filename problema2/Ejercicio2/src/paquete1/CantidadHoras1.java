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
public class CantidadHoras1 {
       
    private int horas;
    private int minutos;
    private int segundos;
    private double dias;

    public void establecerHoras(int hora) {
        horas = hora;
    }

    public void calcularMinutos() {
        minutos = horas * 60;
    }

    public void calcularSegundos() {
        segundos = horas * 3600;
    }

    public void calcularDias() {
        dias = horas / 24;
    }

    public int obtenerHoras() {
        return horas;
    }

    public int obtenerMinutos() {
        return minutos;
    }

    public int obtenerSegundos() {
        return segundos;
    }
    
    public double obtenerDias(){
        return dias;
    }

}
