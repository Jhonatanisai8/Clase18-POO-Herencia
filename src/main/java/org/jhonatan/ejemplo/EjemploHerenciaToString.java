package org.jhonatan.ejemplo;

import org.jhonatan.herencia.Alumno;
import org.jhonatan.herencia.AlumnoInternacional;
import org.jhonatan.herencia.Persona;
import org.jhonatan.herencia.Profesor;

public class EjemploHerenciaToString {
    public static void main(String[] args) {
        ejemploConConstructores();
    }

    public static void ejemploConConstructores() {
        System.out.println("====CREACIÓN DE OBJETOS CON CONSTRUCTORES====");
        objetosPersona();
        objetosAlumnos();
        objetosAlumnoInternacinal();
        objetosProfesor();
    }

    public static void objetosPersona() {
        System.out.println("==OBJETOS DE LA CLASE PERSONA==");

        // objeto de persona
        Persona daniel = new Persona("Daniel Elí", "Ojeda Sanchez");
        daniel.setEdad(11);
        daniel.setEmail("daniel@gmail.com");
        imprimir(daniel);

        Persona juan = new Persona("Juan Daniel", "", 23);
        imprimir(juan);

        Persona jose = new Persona("Jose David", "Sarango Juarez", 34);
        jose.setEmail("davidJose@gmail.com");
        imprimir(jose);

        Persona david = new Persona("David ", "Ojeda");
        david.setEdad(22);
        imprimir(david);
    }

    public static void objetosAlumnos() {
        System.out.println("==OBJETOS DE LA CLASE ALUMNO");
        Alumno daniel = new Alumno("Daniel", "Perez");
        daniel.setInstitucion("Univerdidad Cesar Vallejo");
        daniel.setNotaCastellano(12);
        daniel.setNotaHistoria(11);
        daniel.setNotaMatematicas(9);
        imprimir(daniel);

        Alumno pedro = new Alumno("Pedro", "Juarez", 11, "Universidad Tecnologica del Perú", 11, 11, 12);
        imprimir(pedro);

        Alumno walter = new Alumno("Walter", "Peralta", 12);
        imprimir(walter);
    }

    public static void objetosAlumnoInternacinal() {
        System.out.println("==OBJETOS DE LA CLASE ALUMNO INTERNACINAL==");
        AlumnoInternacional david = new AlumnoInternacional("David", "Sanchez");
        david.setPais("EE.UU");
        david.setInstitucion("Universidad de Harvard");
        imprimir(david);

        AlumnoInternacional jhonatan = new AlumnoInternacional("Jhonatan", "Ojeda Sanchez", "España");
        jhonatan.setInstitucion("Universidad de Stanford");
        jhonatan.setEdad(18);
        jhonatan.setEmail("ojeda@gmail.com");
        imprimir(jhonatan);
    }

    public static void objetosProfesor() {

        System.out.println("==OBJETOS DE LA CLASE PROFESOR==");
        Profesor madrid = new Profesor("Madrid", "Juares");
        madrid.setAsignatura("Programación 1");
        madrid.setEdad(45);
        madrid.setEmail("madrid@gmail.com");
        imprimir(madrid);
    }

    public static void imprimir(Persona persona) {
        System.out.println(persona.toString() + "\n");
    }

}
