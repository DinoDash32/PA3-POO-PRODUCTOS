import java.util.Collections;
import java.util.Comparator;

import java.util.ArrayList;

public class GestorProductos {

    private ArrayList<Producto> productos = new ArrayList<>();

    public void cargarDatosIniciales() {
        productos.add(new Producto(1, "Laptop", "Tecnologia", 2500.0, 10));
        productos.add(new Producto(2, "Mouse", "Accesorios", 35.0, 50));
        productos.add(new Producto(3, "Teclado", "Accesorios", 80.0, 30));
        productos.add(new Producto(4, "Monitor", "Tecnologia", 650.0, 15));
        productos.add(new Producto(5, "Audifonos", "Accesorios", 120.0, 25));
        productos.add(new Producto(6, "Impresora", "Oficina", 480.0, 8));
        productos.add(new Producto(7, "Mochila", "Oficina", 95.0, 40));
        productos.add(new Producto(8, "Webcam", "Tecnologia", 150.0, 20));
    }

    public void listar() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos registrados.");
        } else {
            for (Producto p : productos) {
                System.out.println(p);
            }
        }
    }

    public void agregarProducto(Producto p) {
       
        for (Producto producto : productos) {

            if (producto.getId() == p.getId()) {
                System.out.println("El ID ya existe.");
                return;
            }
        }
      
        productos.add(p);

        System.out.println("Producto agregado correctamente.");
    }

   
    public Producto buscarPorId(int id) {
       
        for (Producto p : productos) {
       
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public boolean eliminarPorId(int id) {
        Producto encontrado = null;
        for (Producto p : productos) {
            if (p.getId() == id) {
                encontrado = p;
            }
        }
        if (encontrado != null) {
            productos.remove(encontrado);
            return true;
        }
        return false;
    }

    public void ordenarPorPrecio() {
        Collections.sort(productos, new Comparator<Producto>() {
            @Override
            public int compare(Producto a, Producto b) {
                return Double.compare(a.getPrecio(), b.getPrecio());
            }
        });
    }

    public void ordenarPorNombre() {
        Collections.sort(productos, new Comparator<Producto>() {
            @Override
            public int compare(Producto a, Producto b) {
                return a.getNombre().compareToIgnoreCase(b.getNombre());
            }
        });
    }
}
