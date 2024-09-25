package Persona;

import java.time.LocalDate;

public class Persona {
    private String dni;
    private String apellido;
    private String nombre;
    private String fechaNacimiento;

    public Persona(){

    }
    public Persona(String dni,String apellido,String nombre,String fechaNacimiento){
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;

    }

    public String getDni(){
        return this.dni;
    }

    public String getApellido(){
        return this.apellido;
    }

    public String getNombre(){
     return this.nombre;
    }

    public String getFechaNacimiento(){
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + dni + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
