package co.edu.uniquindio.parcial_2.model;

import co.edu.uniquindio.parcial_2.model.enumeracion.TipoContrato;

import java.util.ArrayList;
import java.util.List;

public class Empleado extends Persona{
    private double salario;
    private int numeroHorasTrabajo;
    private TipoContrato tipoContrato;
    List<Tarea> listaTareasAsociadas = new ArrayList<>();
    FincaUq ownedByFincaUq;

    public Empleado() {
    }

    public Empleado(double salario, int numeroHorasTrabajo) {
        this.salario = salario;
        this.numeroHorasTrabajo = numeroHorasTrabajo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getNumeroHorasTrabajo() {
        return numeroHorasTrabajo;
    }

    public void setNumeroHorasTrabajo(int numeroHorasTrabajo) {
        this.numeroHorasTrabajo = numeroHorasTrabajo;
    }

    public List<Tarea> getListaTareasAsociadas() {
        return listaTareasAsociadas;
    }

    public void setListaTareasAsociadas(List<Tarea> listaTareasAsociadas) {
        this.listaTareasAsociadas = listaTareasAsociadas;
    }

    public TipoContrato getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(TipoContrato tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public FincaUq getOwnedByFincaUq() {
        return ownedByFincaUq;
    }

    public void setOwnedByFincaUq(FincaUq ownedByFincaUq) {
        this.ownedByFincaUq = ownedByFincaUq;
    }
}
