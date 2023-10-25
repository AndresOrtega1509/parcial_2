package co.edu.uniquindio.parcial_2.model;

import co.edu.uniquindio.parcial_2.model.enumeracion.Prioridad;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FincaUq {

    private String nombre;
    List<Tarea> listaTareas = new ArrayList<>();
    List<Empleado> listaEmpleados = new ArrayList<>();

    /*Constructor*/
    public FincaUq() {
    }

    public FincaUq(String nombre) {
        this.nombre = nombre;
    }

    /*Getters and Setters*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Tarea> getListaTareas() {
        return listaTareas;
    }

    public void setListaTareas(List<Tarea> listaTareas) {
        this.listaTareas = listaTareas;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    /**
     * Metodo para crear la tarea
     * @param numeroTarea
     * @param cedula
     * @param fechaInicio
     * @param fechaFin
     * @param descripcion
     */
    public void crearTarea(int numeroTarea, String cedula, Date fechaInicio, Date fechaFin, String descripcion, Prioridad prioridad) {
        Tarea tarea = new Tarea();
        tarea.setNumeroTarea(numeroTarea);
        tarea.setFechaInicio(fechaInicio);
        tarea.setFechaFin(fechaFin);
        tarea.calcularDuracion();
        tarea.setDescripcion(descripcion);
        tarea.setPrioridad(prioridad);

        Empleado empleado = obtenerEmpleado(cedula);

        if (empleado != null){
            tarea.setEmpleadoAsociado(empleado);
        }
        getListaTareas().add(tarea);
    

    }

    /**
     * Metodo para obtener el empleado
     * @param cedula
     * @return Empleado
     */

    private Empleado obtenerEmpleado(String cedula) {
        Empleado empleadoEncontrado = null;
        for (Empleado empleado : getListaEmpleados()) {
            if (empleado.getCedula().equals(cedula)) {
                empleadoEncontrado = empleado;
                break;
            }
        }
        return empleadoEncontrado;
    }

    /**
     * Metodo para calcular total horas empleado 1
     * @param cedula
     */

    public double calcularHorasTotalEmpleado1(String cedula) {
        double suma = 0.0;
        for (Tarea tarea : listaTareas ){
            if (tarea.getEmpleadoAsociado().getCedula().equalsIgnoreCase(cedula)){
                suma = suma + tarea.getDuracionTarea();

            }
        }
        return suma;
    }

    /**
     * Metodo para calcular total horas empleado 2
     * @param cedula
     */

    public double calcularHorasTotalEmpleado2(String cedula) {
        double suma = 0.0;
        for (Tarea tarea : listaTareas ){
            if (tarea.getEmpleadoAsociado().getCedula().equalsIgnoreCase(cedula)){
                suma = suma + tarea.getDuracionTarea();

            }
        }
        return suma;
    }

    /**
     * Metodo para calcular total horas empleado 3
     * @param cedula
     */

    public double calcularHorasTotalEmpleado3(String cedula) {
        double suma = 0.0;
        for (Tarea tarea : listaTareas ){
            if (tarea.getEmpleadoAsociado().getCedula().equalsIgnoreCase(cedula)){
                suma = suma + tarea.getDuracionTarea();

            }
        }
        return suma;
    }

    /**
     * Metodo para obtener el empleado con mayor horas de trabajo
     * @param empleado1
     * @param empleado2
     * @param empleado3
     * @return string
     */

    public String obtenerEmpleadoMayorHoras(double empleado1, double empleado2, double empleado3) {
        String empleadoMayorHora = "";

        if (empleado1 > empleado2 && empleado1 > empleado3){
            empleadoMayorHora = "Carlos";
        } else if (empleado2 > empleado1 && empleado2 > empleado3) {
            empleadoMayorHora = "Juan";
        }else
            empleadoMayorHora = "Maria";

        return empleadoMayorHora;
    }
}
