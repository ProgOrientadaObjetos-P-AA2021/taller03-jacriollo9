/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.InstitucionEducativa;

/**
 *
 * @author Usuario iTC
 */
public class Ejecutor {
    public static void main(String[] args) {

        InstitucionEducativa educacion = new InstitucionEducativa();

        educacion.establecerNombre("Nuestra Señora del Rosario");
        educacion.establecerTipoInstitucion("Privada");
        educacion.establecerNumeroalumno(1200);
        educacion.estabablecerNumeroDocentes(150);
        educacion.establecerNumeroSedes(1);

        System.out.printf(" - Nombre de la Institucion: %s\n "
                + "- Tipo de Educacion: %s\n"
                + " - Numero Alumnos: %d\n"
                + " - Numero de Docentes: %d\n"
                + " - Numeros de sedes: %d\n",
                educacion.obtenerNombre(),
                educacion.obtenerTipoInstitucion(),
                educacion.obtenerNumeroalumno(),
                educacion.obtenerNumeroDocentes(),
                educacion.obtenerNumeroSedes());
    }
}