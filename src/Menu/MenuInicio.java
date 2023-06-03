package Menu;

import Alumnos.Alumnos_gestiosn;
import Interfaces.Bufferreader;

import java.io.IOException;

public class MenuInicio implements Bufferreader {


    public void menu() throws IOException {
        System.out.println("""
                Bienvenido a gestion de cilcos\s
                ¿Que operacion desea realizar \s
                1->Dar de alta un alumno
                2->Dar de alta a un profesor
                3->Visualizar listado de profesores
                4->Visualizar listado de alumnos
                5->Visualizar listado de Modulos
                6->Visulizar listado de alumnos en un modulo
                                    """);
        int resopuesta = Integer.parseInt(br.readLine());


        switch (resopuesta){

            case 1 -> {
                Alumnos_gestiosn.userCreateAlumno();

            }
            case 2
        }


    }


}
