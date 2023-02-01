package cuerpo;

import java.util.ArrayList;
import java.util.List;

abstract public class Producto implements IProducto {

    private int precio;
    private List<Producto> productos;

    public Producto(int precio) {
        this.precio = precio;
        this.productos = new ArrayList<>();
    }

    public Producto addProducto(Producto producto) {
        this.productos.add(producto);
        return this;
    }

    @Override
    public int getPrecio() {
        return this.precio;
    }
}