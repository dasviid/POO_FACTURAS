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

            System.out.print("Tipo de: " + producto.getClass().getName());
            System.out.print(" - ");
            System.out.print("Precio: " + producto.getPrecio());
            System.out.print(" - ");
            System.out.print("Precio final: " + producto.getPrecioVenta());

            // Para los Electronicos  ============
            if (producto instanceof IElectronico) {
                System.out.print(" - ");
                System.out.print("Fabricante: " + ((IElectronico) producto).getFabricante());

                // Para los IPhone ============
                if (producto instanceof Iphone) {
                    System.out.print(" - ");
                    System.out.print("Modelo: " + ((Iphone) producto).getModelo());
                    System.out.print(" - ");
                    System.out.print("Color: " + ((Iphone) producto).getColor());
                }

                // Para los LCD  ============
                if (producto instanceof TvLcd) {
                    System.out.print(" - ");
                    System.out.print("Pulgadas: " + ((TvLcd) producto).getPulgada());
                }
            }

            // Para los Libros  ============
            if (producto instanceof ILibro) {
                System.out.print(" - ");
                System.out.print("Titulo: " + ((ILibro) producto).getTitulo());
                System.out.print(" - ");
                System.out.print("Autor: " + ((ILibro) producto).getAutor());

                // Para los Comics  ============
                if (producto instanceof Comic) {
                    System.out.print(" - ");
                    System.out.print("Personaje: " + ((Comic) producto).getPersonaje());
                }

            }

            System.out.println();
        }
    }
}

