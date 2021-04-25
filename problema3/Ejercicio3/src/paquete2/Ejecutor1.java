/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.InstitucionEducativa1;

/**
 *
 * @author Usuario iTC
 */
public class Ejecutor1 {
    public static void main(String[] args) {

        InstitucionEducativa1 educacion = new InstitucionEducativa1();

        educacion.establecerNombre("Doctor Juan Francisco Ontaneda");
        educacion.establecerTipoInstitucion("Publica");
        educacion.establecerNumeroalumno(700);
        educacion.estabablecerNumeroDocentes(50);
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
