package co.edu.uniquindio.practicaParcial3;


import co.edu.uniquindio.practicaParcial3.model.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();


        Vehiculo vehiculo = new Carro();
        vehiculo.encender();
        Carro carro = new Carro();
        carro.encender();
        carro.encender("Encendiendo empujado");
        carro.encender(5);
        Avion avion = new Avion();
        avion.encender();
        CarroParticular carroParticular = new CarroParticular();
        carroParticular.encenderElectricamente();
        carroParticular.encenderAGas();
        CarroPublico carroPublico = new CarroPublico();
        carroPublico.encenderAGas();

        listaVehiculos.add(vehiculo);
        listaVehiculos.add(carro);
        listaVehiculos.add(avion);

        int contador = 0;

        for (Vehiculo veh : listaVehiculos) {
            if (veh instanceof Carro){
                contador = contador + 1;

            }
        }
        System.out.println("La cantidad de carros son: " + contador);

    }
}