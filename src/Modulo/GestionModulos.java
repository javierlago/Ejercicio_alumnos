package Modulo;

import Alumnos.Alumno;

public class GestionModulos {

    public void anadirAlumnos(Modulo modulo,Alumno alumno){
        if(modulo.getListadoAlumnos().size()<30){
            modulo.getListadoAlumnos().add(alumno);
        }else System.err.println("Modulo completo no se puede añadir mas alumnos");


    }


}
