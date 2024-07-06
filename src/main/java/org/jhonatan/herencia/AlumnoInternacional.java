package org.jhonatan.herencia;

/**
 *
 * @author Jhonatan
 */
public class AlumnoInternacional extends Alumno {// hereda de alumno

    private String pais;
    private double notaIdiamas;

    // constructor
    public AlumnoInternacional() {

    }

    public AlumnoInternacional(String nombre, String apellido) {
        super(nombre, apellido);// constrcutor del padre en este caso alumno
    }

    public AlumnoInternacional(String nombre, String apellido, String pais) {
        super(nombre, apellido);// constrcutor del padre en este caso alumno
        this.pais = pais;
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

    // sobrescritura del metodo
    @Override
    public String saludar() {
        return super.saludar() + " soy extranjero del pais " + getPais();
    }

    // sobre escritura del metodo del padre (alumno)
    @Override
    public double calcularPromedio() {
        System.out.println("Calcular Promedio: " + AlumnoInternacional.class.getCanonicalName());
        return ((super.calcularPromedio() * 3) + notaIdiamas) / 4;
    }
}
