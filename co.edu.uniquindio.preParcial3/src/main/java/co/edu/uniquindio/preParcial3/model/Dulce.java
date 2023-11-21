package co.edu.uniquindio.preParcial3.model;

public class Dulce extends Producto{

    private double contenidoAzucar;

    public Dulce(double contenidoAzucar) {
        this.contenidoAzucar = contenidoAzucar;
    }

    public double getContenidoAzucar() {
        return contenidoAzucar;
    }

    public void setContenidoAzucar(double contenidoAzucar) {
        this.contenidoAzucar = contenidoAzucar;
    }

    @Override
    public void calcularPrecio() {
        double impuesto = 0.10 * getValor();

        if (contenidoAzucar > 0.5){
            impuesto = impuesto * 2;

        }
    }
}
