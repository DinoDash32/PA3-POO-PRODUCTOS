import java.util.ArrayList;

public class GestorProductos {

    // Lista donde se guardan los productos
    private ArrayList<Producto> productos = new ArrayList<>();

    // PARTE DEL INTEGRANTE 1
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

    // Listar productos
    public void listar() {

        if (productos.isEmpty()) {
            System.out.println("No hay productos registrados.");
        } else {
            for (Producto p : productos) {
                System.out.println(p);
            }
        }
    }

    // PARTE DEL INTEGRANTE 2
    // Agregar un producto verificando que no se repita el ID
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

    // Buscar un producto por su ID
    public Producto buscarPorId(int id) {

        for (Producto p : productos) {

            if (p.getId() == id) {
                return p;
            }
        }

        return null;
    }

    // PARTE DEL INTEGRANTE 3
    public boolean eliminarPorId(int id) {
        return false; // Pendiente del integrante 3
    }

    public void ordenarPorPrecio() {
        // Pendiente del integrante 3
    }

    public void ordenarPorNombre() {
        // Pendiente del integrante 3
    }
}