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
public class EquipoCelular1 {
      private String sistemaOperativo;
    private double tamañoPantalla;
    private double Costo;
    private String direccionMac;
    private int informacionIMEI;

    public void establecersistemaoperativo(String sistemaoperativo) {
        sistemaOperativo = sistemaoperativo;
    }

    public void estabelcertamañodepantalla(double pantalla) {
        tamañoPantalla = pantalla;
    }

    public void estabelcercosto(double costo) {
        Costo = costo;
    }

    public void estabelcerDireccionmac(String direccmac) {
        direccionMac = direccmac;
    }

    public void estabelcerInformacionimei(int imei) {
        informacionIMEI = imei;
    }
    
    public String obtenersistemaoperativo(){
        return sistemaOperativo;
    }
    
    public double obtenertamañodepantalla(){
        return tamañoPantalla;
    }
    
    public double obtenercosto(){
        return Costo;
    }
    
    public String obtenerDireccionmac(){
        return direccionMac;
    }
    
    public int obtenerInformacionimei(){
        return informacionIMEI;
    }

}
