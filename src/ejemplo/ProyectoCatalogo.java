package ejemplo;

import cuerpo.*;
import cuerpo.electronico.*;
import cuerpo.libros.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProyectoCatalogo {
    public static void main(String[] args) {

        List<Producto> productos = new ArrayList<>();
        productos.add(new TvLcd(100, "Sony", 40));
        productos.add(new Libro(10, new Date(2020 - 12 - 12), "Eric Gamma", "Elementos reusables POO", "alguna"));
        productos.add(new Iphone(1000, "Apple", "Blanco", "x pro max"));
        productos.add(new Comic(1, new Date(1990 - 2 - 15), "Marvel dc", "Los invencibles", "Qsyo", "El elastico"));

        for (IProducto producto : productos) {
            System.out.println(producto);
            System.out.println("=====NEXT=====");
        }
    }
}

