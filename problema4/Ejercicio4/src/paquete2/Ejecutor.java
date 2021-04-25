/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.EquipoCelular;

/**
 *
 * @author Usuario iTC
 */
public class Ejecutor {
    
    public static void main(String[] args) {
        EquipoCelular celular = new EquipoCelular();

        celular.establecersistemaoperativo("Android");
        celular.estabelcertamañodepantalla(12.5);
        celular.estabelcercosto(1200);
        celular.estabelcerInformacionimei(1095148762);
        celular.estabelcerDireccionmac("84:64:1a:ec:5b:c9");
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
