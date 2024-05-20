package org.jhonatan.herencia;

/**
 *
 * @author Jhonatan
 */
public class main {

    public static void main(String[] args) {
        System.out.println("HERENCIA EN POO");
        Alumno alumno = new Alumno();
        alumno.setNombre("Jhonatan Isai");
        alumno.setApellido("Ojeda Sanchez");

        Profesor profesor = new Profesor();
        profesor.setNombre("Leandro Madrid");
        profesor.setApellido("Perez");
        profesor.setAsignatura("Fundamentos de Programación");

        Persona persona = new Persona();
        persona.setNombre("Pedro Luis");
        persona.setApellido("Flores Rios");
        persona.setEdad(12);
        persona.setEmail("pedroluis@gmail.com");

        System.out.println("Alumno: " + alumno.getNombre() + " " + alumno.getApellido());

        System.out.println("Profesor " + profesor.getAsignatura() + " :"
                + profesor.getNombre() + " " + profesor.getApellido());

        System.out.println("Persona: " + persona.getNombre() + " " + persona.getApellido()
                + "\nEdad: " + persona.getEdad()
                + "\nEmail: " + persona.getEmail());

    }
}
