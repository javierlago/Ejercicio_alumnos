package Modulo;

import Alumnos.Alumno;
import Profesores.Profesor;

import java.util.ArrayList;


public class Modulo {
    public Modulo(String nombre, String siglas, int sesiones, Profesor profesor) {
        Nombre = nombre;
        Siglas = siglas;
        this.sesiones = sesiones;
        this.profesor = profesor;

    }

    public Modulo() {

    }

    String Nombre,Siglas;
    int sesiones;
    Profesor profesor;

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getSiglas() {
        return Siglas;
    }

    public void setSiglas(String siglas) {
        Siglas = siglas;
    }

    public int getSesiones() {
        return sesiones;
    }

    public void setSesiones(int sesiones) {
        this.sesiones = sesiones;
    }

    public ArrayList<Alumno> getListadoAlumnos() {
        return listadoAlumnos;
    }

    public void setListadoAlumnos(ArrayList<Alumno> listadoAlumnos) {
        this.listadoAlumnos = listadoAlumnos;
    }

    ArrayList<Alumno> listadoAlumnos;



}
