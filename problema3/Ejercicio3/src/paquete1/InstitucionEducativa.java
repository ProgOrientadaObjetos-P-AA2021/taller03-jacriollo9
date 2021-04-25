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
public class InstitucionEducativa {

    private String nombre;
    private String tipoInstitucion;
    private int numeroAlumno;
    private int numeroDocente;
    private int NumeroSede;

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerTipoInstitucion(String tipInstitucion) {
        tipoInstitucion = tipInstitucion;
    }

    public void establecerNumeroalumno(int numAlumno) {
        numeroAlumno = numAlumno;
    }

    public void estabablecerNumeroDocentes(int numDocente) {
        numeroDocente = numDocente;
    }

    public void establecerNumeroSedes(int NumSedes) {
        NumeroSede = NumSedes;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerTipoInstitucion() {
        return tipoInstitucion;
    }

    public int obtenerNumeroalumno() {
        return numeroAlumno;
    }

    public int obtenerNumeroDocentes() {
        return numeroDocente;
    }

    public int obtenerNumeroSedes() {
        return NumeroSede;
    }
}
