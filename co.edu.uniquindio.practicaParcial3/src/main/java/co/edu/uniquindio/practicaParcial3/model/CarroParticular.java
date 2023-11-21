package co.edu.uniquindio.practicaParcial3.model;

import co.edu.uniquindio.practicaParcial3.services.ICarroElectrico;
import co.edu.uniquindio.practicaParcial3.services.ICarroGas;

public class CarroParticular extends Carro implements ICarroElectrico, ICarroGas {

    @Override
    public void encenderElectricamente() {
        System.out.println("Encendiendo electrico");
    }

    @Override
    public void encenderAGas() {
        System.out.println("Encendiendo a gas barato");
    }
}
