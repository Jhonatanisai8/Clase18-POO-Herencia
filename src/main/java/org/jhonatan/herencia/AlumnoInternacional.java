package org.jhonatan.herencia;

/**
 *
 * @author Jhonatan
 */
public class AlumnoInternacional extends Alumno {//hereda de alumno

    private String pais;
    private double notaIdiamas;

    public AlumnoInternacional() {
        System.out.println("Inicializando constructor");
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdiamas() {
        return notaIdiamas;
    }

    public void setNotaIdiamas(double notaIdiamas) {
        this.notaIdiamas = notaIdiamas;
    }

}
