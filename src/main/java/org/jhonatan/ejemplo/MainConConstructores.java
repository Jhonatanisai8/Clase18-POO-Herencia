package org.jhonatan.ejemplo;

import org.jhonatan.herencia.Alumno;
import org.jhonatan.herencia.AlumnoInternacional;
import org.jhonatan.herencia.Persona;
import org.jhonatan.herencia.Profesor;

public class MainConConstructores {
    public static void main(String[] args) {
        ejemploConConstructores();
    }

    public static void ejemploConConstructores() {
        System.out.println("====CREACIÓN DE OBJETOS CON CONSTRUCTORES====");

        Persona juan = new Persona();
        juan.setNombre("Juan Alvarez");
        juan.setApellido("Juarez Elias");
        juan.setEdad(19);
        juan.setEmail("juan@gmail.com");

        Alumno alumnoFrank = new Alumno("Frank Armando", "Castillo Ojeda");
        alumnoFrank.setNotaCastellano(15.6);
        alumnoFrank.setNotaHistoria(11.4);
        alumnoFrank.setNotaMatematicas(16.7);
        alumnoFrank.setEmail("frankarmando@gmail.com");

        Alumno alumnoArmando = new Alumno("Armando Walter", "Ojeda Juarez", 24);
        alumnoArmando.setNotaCastellano(11.6);
        alumnoArmando.setNotaHistoria(17.4);
        alumnoArmando.setNotaMatematicas(13.7);
        alumnoArmando.setEmail("armandowalter@gmail.com");

        Alumno alumnoWalter = new Alumno("Walter Elias", "Florez Castillo", 23, "IE. Jesus de Nazaret");
        Alumno alumnoFlorentino = new Alumno("Florentino Juan", "Perez Juarez", 26, "IE. Jorgue Chavez", 12.4, 11.2,
                9.5);

        Profesor profesorWalter = new Profesor("Walter Samir", "Florez Florez");
        Profesor profesorSamir = new Profesor("Samir Florez", "Perez Peralta", "Matematica");
        Profesor profesorJuan = new Profesor("Juan Cristhian", "Castro Armijos", "Castellano");

        AlumnoInternacional pedro = new AlumnoInternacional("Pedro Cristhian", "Peralta Florez");
        pedro.setPais("Bolivia");
        AlumnoInternacional alberto = new AlumnoInternacional("Alberto Samir", "Garcia Lopez", "Ecuador");

        imprimir(alumnoFrank);
        imprimir(pedro);
        imprimir(profesorSamir);
        imprimir(alumnoFlorentino);
    }

    public static void imprimir(Persona persona) {
        System.out.println("=IMPRIMIENDO DATOS EN COMÚN DE PERSONA=");
        System.out.println("Nombre: " + persona.getNombre()
                + "\nApellido: " + persona.getApellido()
                + "\nEdad: " + persona.getEdad()
                + "\nEmail: " + persona.getEmail());
        if (persona instanceof Alumno) {
            System.out.println("=IMPRIMIENDO LOS DATOS DEL TIPO ALUMNO=");
            // lo casteamos al objeto de tipo alumno
            System.out.println("Institución: " + ((Alumno) persona).getInstitucion());
            System.out.println("Nota matemàticas: " + ((Alumno) persona).getNotaMatematicas());
            System.out.println("Nota Historia: " + ((Alumno) persona).getNotaHistoria());
            System.out.println("Nota Castellano: " + ((Alumno) persona).getNotaCastellano());

            if (persona instanceof AlumnoInternacional) {
                System.out.println("=IMPRIMIENDO DATOS DE TIPO ALUMNO INTERNACIONAL=");
                // lo casteamos a tipo AlumnoInternacional
                System.out.println("Nota idiomas: " + ((AlumnoInternacional) persona).getNotaIdiamas());
                System.out.println("Pais: " + ((AlumnoInternacional) persona).getPais());
            }
            System.out.println("============Sobreescritura Calcular Promedio===========================");
            System.out.println("Promedio: " + ((Alumno) persona).calcularPromedio());
            System.out.println("============Sobreescritura Calcular Promedio===========================");

        }

        if (persona instanceof Profesor) {
            System.out.println("=IMPRIMIENDO DATOS DE PROFESOR=");
            System.out.println(" Asiganatura: " + ((Profesor) persona).getAsignatura());
        }
        System.out.println("============Sobreescritura saludar===========================");
        System.out.println(persona.saludar());

        System.out.println("=======================================");

    }
}
