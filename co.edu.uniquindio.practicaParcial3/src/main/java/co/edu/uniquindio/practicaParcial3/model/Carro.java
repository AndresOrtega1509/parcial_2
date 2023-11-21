package co.edu.uniquindio.practicaParcial3.model;

public class Carro extends Vehiculo{

    @Override
    public void encender() {
        System.out.println("Encendiendo el carro");
    }

    public void encender(String mensaje){
        System.out.println(mensaje);
    }

    public void encender(int motor){
        System.out.println("Encendiendo motor" + motor);

    }
}
