package org.jhonatan.herencia;

public class AlumnoDiplomatico extends Alumno {
    private String grado;

    public AlumnoDiplomatico(String nombre, String apellido, int edad, String institucion, double notaMate,
            double notaCastellano, double notaHistoria, String grado) {
        super(nombre, apellido, edad, institucion, notaMate, notaCastellano, notaHistoria);
        this.grado = grado;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

}
