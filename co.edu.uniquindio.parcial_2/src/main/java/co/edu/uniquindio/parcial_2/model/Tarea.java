package co.edu.uniquindio.parcial_2.model;

import co.edu.uniquindio.parcial_2.model.enumeracion.Prioridad;

import java.util.Date;

public class Tarea {

    private int numeroTarea;
    private Date fechaInicio;
    private Date fechaFin;
    private double duracionTarea;
    private String descripcion;
    private Empleado empleadoAsociado;
    private Prioridad prioridad;
    FincaUq ownedByFincaUq;

    /*Constructor*/

    public Tarea() {
    }

    public Tarea(int numeroTarea, Date fechaInicio, Date fechaFin, double duracionTarea, String descripcion) {
        this.numeroTarea = numeroTarea;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.duracionTarea = duracionTarea;
        this.descripcion = descripcion;
    }



    /*Getters and Setters*/

    public int getNumeroTarea() {
        return numeroTarea;
    }

    public void setNumeroTarea(int numeroTarea) {
        this.numeroTarea = numeroTarea;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getDuracionTarea() {
        return duracionTarea;
    }

    public void setDuracionTarea(double duracionTarea) {
        this.duracionTarea = duracionTarea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public FincaUq getOwnedByFincaUq() {
        return ownedByFincaUq;
    }

    public void setOwnedByFincaUq(FincaUq ownedByFincaUq) {
        this.ownedByFincaUq = ownedByFincaUq;
    }

    public Empleado getEmpleadoAsociado() {
        return empleadoAsociado;
    }

    public void setEmpleadoAsociado(Empleado empleadoAsociado) {
        this.empleadoAsociado = empleadoAsociado;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }

    /**
     * Metodo para calcular la duracion de la tarea
     * @return long
     */
    public long calcularDuracion() {

        long duracionMili = fechaFin.getTime() - fechaInicio.getTime();

        this.duracionTarea = duracionMili;

        long horas = convertirMiliAHoras(duracionMili);

        setDuracionTarea(horas);

        return duracionMili;
    }

    /**
     * Metodo para convertir milisegundos a horas
     * @param duracionMili
     * @return long
     */

    private long convertirMiliAHoras(long duracionMili) {

        long horas = 0;

        horas = duracionMili / 3600000;

        return horas;
    }


    @Override
    public String toString() {
        return "Tarea{" +
                "numeroTarea=" + numeroTarea +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", duracionTarea=" + duracionTarea +
                ", descripcion='" + descripcion + '\'' +
                ", empleadoAsociado=" + empleadoAsociado +
                '}';
    }

}
