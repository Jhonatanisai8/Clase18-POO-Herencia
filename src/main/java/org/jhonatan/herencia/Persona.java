package org.jhonatan.herencia;

/**
 *
 * @author Jhonatan
 */
/*
 * El modificador de acceso final es para evitar que una clase tenga hijos
 */
public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private String email;

    // constructor
    public Persona() {

    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(String nombre, String apellido, int edad) {
        this(nombre, apellido);
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String saludar() {
        return "Hola que tal !";
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\nApellido: " + apellido
                + "\nEdad: " + edad
                + "\nEmail: " + email +
                "\nSaludo: " + this.saludar();
    }

}
