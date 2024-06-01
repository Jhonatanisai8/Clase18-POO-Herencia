package org.jhonatan.herencia;

/**
 *
 * @author Jhonatan
 */
public class Profesor extends Persona {//clase hija de persona

    private String asignatura;

    //constructor
    public Profesor() {
        System.out.println("Inicializando constructor");
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

}
