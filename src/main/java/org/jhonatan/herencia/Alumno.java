package org.jhonatan.herencia;

/**
 *
 * @author Jhonatan
 */
public class Alumno extends Persona {//clase hija de la clase persona

    private String institucion;
    private double notaMatematicas;
    private double notaCastellano;
    private double notaHistoria;

    //constructor
    public Alumno() {

    }

    public Alumno(String nombre, String apellido) {
        super(nombre, apellido);//constructor del padre
    }

    public Alumno(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);//constructor del padre
    }

    public Alumno(String nombre, String apellido, int edad, String institucion) {
        super(nombre, apellido, edad);
        this.institucion = institucion;
    }

    public Alumno(String nombre, String apellido, int edad,
            String institucion, double notaMate,
            double notaCastellano, double notaHistoria) {
        this(nombre, apellido, edad, institucion);
        this.notaMatematicas = notaMate;
        this.notaCastellano = notaCastellano;
        this.notaHistoria = notaHistoria;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMatematicas() {
        return notaMatematicas;
    }

    public void setNotaMatematicas(double notaMatematicas) {
        this.notaMatematicas = notaMatematicas;
    }

    public double getNotaCastellano() {
        return notaCastellano;
    }

    public void setNotaCastellano(double notaCastellano) {
        this.notaCastellano = notaCastellano;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }

}
