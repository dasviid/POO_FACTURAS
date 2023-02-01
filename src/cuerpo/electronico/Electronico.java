package cuerpo.electronico;

import cuerpo.Producto;

abstract public class Electronico extends Producto implements IElectronico {

    String fabricante;

    public Electronico(int precio, String fabricante) {
        super(precio);
        this.fabricante = fabricante;
    }

    @Override
    public String getFabricante() {
        return this.fabricante;
    }


}
