package Alumnos;

import Interfaces.Bufferreader;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.BaseStream;
import Modulo.*;

public class Alumnos_gestiosn implements Bufferreader {


public static void userCreateAlumno() throws IOException {
    Alumno alumno = new Alumno();
    System.out.println("Introducir el nombre del alumno");
    alumno.setNombre(br.readLine());
    System.out.println("Introducire el primer apellido");
    alumno.setApellido1(br.readLine());
    System.out.println("Introducir el segundo apellido");
    alumno.setApellido2(br.readLine());
    System.out.println("Introducir el DNI");
    alumno.setDni(br.readLine());
    System.out.println("Introducir fecha de nacimiento(dd/MM/yyyy)");
    DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
    alumno.setFechaDeNacimiento(LocalDate.parse(br.readLine(),formatter));
}







}




