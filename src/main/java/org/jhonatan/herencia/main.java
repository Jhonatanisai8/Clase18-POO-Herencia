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

        System.out.println("Alumno: " + alumno.getNombre() + " " + alumno.getApellido());

        System.out.println("Profesor " + profesor.getAsignatura() + " :"
                + profesor.getNombre() + " " + profesor.getApellido());

    }
}
