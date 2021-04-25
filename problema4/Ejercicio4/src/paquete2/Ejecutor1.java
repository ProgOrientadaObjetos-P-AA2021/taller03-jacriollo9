/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.EquipoCelular1;

/**
 *
 * @author Usuario iTC
 */
public class Ejecutor1 {
     
    public static void main(String[] args) {
        EquipoCelular1 celular = new EquipoCelular1();

        celular.establecersistemaoperativo("Android");
        celular.estabelcertamañodepantalla(14);
        celular.estabelcercosto(1000);
        celular.estabelcerInformacionimei(1084712635);
        celular.estabelcerDireccionmac("68:74:1a:ec:5c:d7");
        System.out.printf("Sistema operativo: %s\n"
                + "Tamaño de Pantalla: %.2f\n"
                + "Costo del Celular: %.2f\n"
                + "Informacion de Imei: %d\n"
                + "Direccion mac: %s\n",
                celular.obtenersistemaoperativo(), celular.obtenertamañodepantalla(),
                celular.obtenercosto(), celular.obtenerInformacionimei(),
                celular.obtenerDireccionmac());
    }
}
