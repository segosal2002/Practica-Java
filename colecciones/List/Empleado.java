package colecciones.List;

import java.time.LocalDate;

public class Empleado implements Comparable <Empleado> {
    private String nombre;
    private String apellido;
    private Integer numEmpleado;
    private LocalDate fechaContratacion;

    public Empleado(String nombre, String apellido, Integer numEmpleado,int anio, int mes, int dia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numEmpleado = numEmpleado;
        this.fechaContratacion = LocalDate.of(anio,mes,dia);
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaContratacion() {
        return this.fechaContratacion;
    }

    public void setFechaContratacion(LocalDate fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public  Integer getNumEmpleado() {
        return this.numEmpleado;
    }

    public void setNumEmpleado(Integer numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public int compareTo(Empleado o){
        int comparaFechas = this.fechaContratacion.compareTo(o.fechaContratacion);
        if (comparaFechas != 0){
            return comparaFechas;
        }else{
            return this.numEmpleado.compareTo(o.numEmpleado);
        }
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", numEmpleado=" + numEmpleado +
                ", fechaContratacion=" + fechaContratacion +
                '}';
    }
}
