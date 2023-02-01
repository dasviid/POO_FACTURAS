package cuerpo;

public class Iphone extends Electronico implements IProducto {

    private String color;
    private String modelo;

    public Iphone(String fabricante, String color, String modelo) {
        super(fabricante);
        this.color = color;
        this.modelo = modelo;
    }

    @Override
    public int getPrecio() {
        return 0;
    }

    @Override
    public double getPrecioVenta() {
        return 0;
    }
}
