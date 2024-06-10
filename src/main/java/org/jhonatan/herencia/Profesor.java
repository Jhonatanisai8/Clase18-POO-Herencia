package org.jhonatan.herencia;

/**
 *
 * @author Jhonatan
 */
public class Profesor extends Persona {// clase hija de persona

    private String asignatura;

    // constructor
    public Profesor() {
    }

    public Profesor(String nombre, String apellido) {
        super(nombre, apellido);// constrcutor del padre (persona)
    }

    public Profesor(String nombre, String apellido, String asignatura) {
        this(nombre, apellido); // constructor del padre (persona)
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

}
