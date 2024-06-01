package org.jhonatan.Ejemplo;

import org.jhonatan.herencia.Alumno;
import org.jhonatan.herencia.Persona;
import org.jhonatan.herencia.Profesor;

/**
 *
 * @author Jhonatan
 */
public class main {

    public static void main(String[] args) {
        System.out.println("HERENCIA EN POO");
        Persona alumno = new Alumno();

        //marca error por que las clases estan en otra clase
        alumno.setNombre("Jhonatan Isai");
        alumno.setApellido("Ojeda Sanchez");

        //casteando el objeto de tipo persona
        ((Alumno) alumno).setInstitucion("Instituto Nacional");

        Profesor profesor = new Profesor();
        profesor.setNombre("Leandro Madrid");
        profesor.setApellido("Perez");
        profesor.setAsignatura("Fundamentos de Programación");

        Persona persona = new Persona();
        persona.setNombre("Pedro Luis");
        persona.setApellido("Flores Rios");
        persona.setEdad(12);
        persona.setEmail("pedroluis@gmail.com");

        System.out.println("Alumno: " + alumno.getNombre() + " " + alumno.getApellido()
                + "\nInstitucion: " + ((Alumno) alumno).getInstitucion());

        System.out.println("Profesor " + profesor.getAsignatura() + " :"
                + profesor.getNombre() + " " + profesor.getApellido());

        System.out.println("Persona: " + persona.getNombre() + " " + persona.getApellido()
                + "\nEdad: " + persona.getEdad()
                + "\nEmail: " + persona.getEmail());

    }
}
