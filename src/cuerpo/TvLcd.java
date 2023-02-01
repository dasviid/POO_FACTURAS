package cuerpo;

public class TvLcd extends Electronico implements IProducto {
    private int pulgada;

    public TvLcd(String fabricante, int pulgada) {
        super(fabricante);
        this.pulgada = pulgada;
    }

    public int getPulgada() {
        return pulgada;
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
