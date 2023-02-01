package cuerpo;

import java.util.Date;

public class Comic extends  Libro implements IProducto{
    private  String personaje;

    public Comic(int precio, Date fechaPublicacion, String autor, String titulo, String editorial, String personaje) {
        super(precio, fechaPublicacion, autor, titulo, editorial);
        this.personaje = personaje;
    }

    public String getPersonaje() {
        return personaje;
    }
}
