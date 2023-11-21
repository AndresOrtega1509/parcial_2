package co.edu.uniquindio.practicaParcial3.model;

import co.edu.uniquindio.practicaParcial3.services.ICarroGas;

public class CarroPublico extends Carro implements ICarroGas {
    @Override
    public void encenderAGas() {
        System.out.println("Encendiendo a gas premium");
    }
}
