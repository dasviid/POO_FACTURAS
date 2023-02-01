package cuerpo;

abstract public class Electronico implements IElectronico {

    String fabricante;

    public Electronico(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String getFabricante() {
        return this.fabricante;
    }
}
