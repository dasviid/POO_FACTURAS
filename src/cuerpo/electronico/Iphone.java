package cuerpo.electronico;

import cuerpo.IProducto;
import cuerpo.electronico.Electronico;

public class Iphone extends Electronico {

    private String color;
    private String modelo;

    public Iphone(int precio, String fabricante, String color, String modelo) {
        super(precio, fabricante);
        this.color = color;
        this.modelo = modelo;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio() * 1.5;
    }

    public String getColor() {
        return color;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        int posicion = this.getClass().getCanonicalName().lastIndexOf(".") + 1;
        String descripcion =  "Producto: "+getClass().getCanonicalName().substring(posicion)+'\n'+
                 "Modelo: "+modelo + '\n' +
                super.toString()
                + "Color: " + color;

        return descripcion;
    }
}
