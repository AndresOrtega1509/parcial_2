package co.edu.uniquindio.parcial_2;

import co.edu.uniquindio.parcial_2.model.Administrador;
import co.edu.uniquindio.parcial_2.model.FincaUq;
import co.edu.uniquindio.parcial_2.model.Jornalero;
import co.edu.uniquindio.parcial_2.model.enumeracion.Prioridad;
import co.edu.uniquindio.parcial_2.model.enumeracion.TipoContrato;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        FincaUq fincaUq = inicializarDatosPrueba();

        Date fechaInicio = new Date(23,9,23,19,9);
        Date fechaFin = new Date(23,9,24,15,9);
        Date fechaInicio2 = new Date(23, 5, 14,21,10);
        Date fechaFin2 = new Date(23, 5, 15, 22, 0);
        Date fechaInicio3 = new Date(23, 7, 15,10,10);
        Date fechaFin3 = new Date(23, 7, 16, 23, 0);

        fincaUq.crearTarea(1, "10920394", fechaInicio, fechaFin, "Administrar dinero", Prioridad.ALTA);
        fincaUq.crearTarea(1, "10920394", fechaInicio, fechaFin, "Supervisar dinero", Prioridad.MEDIA);
        fincaUq.crearTarea(3, "10169243", fechaInicio2, fechaFin2, "Sembrar plantas", Prioridad.MEDIA);
        fincaUq.crearTarea(2, "10169243", fechaInicio3, fechaFin3, "Recojer cafe", Prioridad.ALTA);
        fincaUq.crearTarea(2, "10169243", fechaInicio3, fechaFin3, "Recojer papa", Prioridad.BAJA);
        fincaUq.crearTarea(2, "10849302", fechaInicio3, fechaFin3, "Barrer terreno", Prioridad.BAJA);
        fincaUq.crearTarea(2, "10849302", fechaInicio3, fechaFin3, "Sembrar maiz", Prioridad.BAJA);
        fincaUq.crearTarea(2, "10849302", fechaInicio3, fechaFin3, "Supervisar finca", Prioridad.ALTA);

        double sumaHorasEmpleado1 = fincaUq.calcularHorasTotalEmpleado1("10920394");
        System.out.println("Las horaas totales trabajadas del administrador son: "+ sumaHorasEmpleado1);
        double sumaHorasEmpleado2 = fincaUq.calcularHorasTotalEmpleado2("10169243");
        System.out.println("Las horaas totales trabajadas del primer jornalero son: "+ sumaHorasEmpleado2);
        double sumaHorasEmpleado3 = fincaUq.calcularHorasTotalEmpleado3("10849302");
        System.out.println("Las horaas totales trabajadas del segundo jornalero son: "+ sumaHorasEmpleado3);
        String empleadoMayorHoras = fincaUq.obtenerEmpleadoMayorHoras(sumaHorasEmpleado1, sumaHorasEmpleado2,sumaHorasEmpleado3);
        System.out.println("El empleado con mayor numero de horas es: " + empleadoMayorHoras);

    }

    /**
     * Metodo para inicializar datos de prueba
     * @return fincaUq
     */
    private static FincaUq inicializarDatosPrueba() {
        FincaUq fincaUq = new FincaUq();
        fincaUq.setNombre("El obrero");
        Administrador administrador = new Administrador();
        administrador.setNombre("Carlos");
        administrador.setApellido("Ortega");
        administrador.setCedula("10920394");
        administrador.setEdad(20);
        administrador.setTipoContrato(TipoContrato.HORAS);

        Jornalero jornalero1 = new Jornalero();
        jornalero1.setNombre("Juan");
        jornalero1.setApellido("Ramirez");
        jornalero1.setCedula("10169243");
        jornalero1.setEdad(34);
        jornalero1.setTipoContrato(TipoContrato.MEDIO_TIEMPO);

        Jornalero jornalero2 = new Jornalero();
        jornalero2.setNombre("Maria");
        jornalero2.setApellido("Perez");
        jornalero2.setCedula("10849302");
        jornalero2.setEdad(25);
        jornalero2.setTipoContrato(TipoContrato.TIEMPO_COMPLETO);

        fincaUq.getListaEmpleados().add(administrador);
        fincaUq.getListaEmpleados().add(jornalero1);
        fincaUq.getListaEmpleados().add(jornalero2);


        return fincaUq;

    }
}