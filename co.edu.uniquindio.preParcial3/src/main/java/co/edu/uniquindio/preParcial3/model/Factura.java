package co.edu.uniquindio.preParcial3.model;

import java.util.ArrayList;
import java.util.List;

public class Factura {

    private Cliente cliente;

    List<Producto> listaProductos = new ArrayList<>();

    CafeteriaUq ownedByCafeteriaUq;

    public Factura() {
    }

    public Factura(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public CafeteriaUq getOwnedByCafeteriaUq() {
        return ownedByCafeteriaUq;
    }

    public void setOwnedByCafeteriaUq(CafeteriaUq ownedByCafeteriaUq) {
        this.ownedByCafeteriaUq = ownedByCafeteriaUq;
    }
}
