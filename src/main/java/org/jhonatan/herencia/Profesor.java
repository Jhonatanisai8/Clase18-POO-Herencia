package org.jhonatan.herencia;

/**
 *
 * @author Jhonatan
 */
public class Profesor extends Persona {//clase hija de persona

    private String asignatura;

    //constructor
    public Profesor() {
    }

    public Profesor(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Profesor(String nombre, String apellido, String asignatura) {
        this(nombre, apellido);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

}
