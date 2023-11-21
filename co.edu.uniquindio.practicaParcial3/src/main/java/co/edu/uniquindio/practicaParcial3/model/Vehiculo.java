package co.edu.uniquindio.practicaParcial3.model;

public abstract class Vehiculo {

    private String modelo;
    private String marca;
    private int anio;

    public Vehiculo() {
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void encender(){
        System.out.println("Encendiendo el vehiculo");
    }
}
