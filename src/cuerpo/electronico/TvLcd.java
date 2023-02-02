package cuerpo.electronico;


public class TvLcd extends Electronico {
    private int pulgada;

    public TvLcd(int precio, String fabricante, int pulgada) {
        super(precio, fabricante);
        this.pulgada = pulgada;
    }

    public int getPulgada() {
        return pulgada;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio() * 1.5;
    }

    @Override
    public String toString() {
        int posicion = this.getClass().getCanonicalName().lastIndexOf(".") + 1;
        String descripcion =  "Producto: "+getClass().getCanonicalName().substring(posicion)+'\n'+
                "Pulgada: "+pulgada + '\n' +
                super.toString();
        return  descripcion;
    }
}
