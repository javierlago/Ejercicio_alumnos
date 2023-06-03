package Alumnos;

import java.time.LocalDate;

public class Alumno {
    public Alumno(String nombre, String apellido1, String apellido2, String dni, LocalDate fechaDeNacimiento) {
        Nombre = nombre;
        Apellido1 = apellido1;
        Apellido2 = apellido2;
        this.dni = dni;
        FechaDeNacimiento = fechaDeNacimiento;
    }

    String Nombre,Apellido1,Apellido2,dni;

    LocalDate FechaDeNacimiento;

    public Alumno() {

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido1() {
        return Apellido1;
    }

    public void setApellido1(String apellido1) {
        Apellido1 = apellido1;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public void setApellido2(String apellido2) {
        Apellido2 = apellido2;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFechaDeNacimiento() {
        return FechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        FechaDeNacimiento = fechaDeNacimiento;
    }
}
