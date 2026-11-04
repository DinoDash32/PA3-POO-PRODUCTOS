public class PruebaIntegrante2 {

    public static void main(String[] args) {

        GestorProductos gestor = new GestorProductos();

        // Cargar productos iniciales
        gestor.cargarDatosIniciales();

        System.out.println("=== AGREGAR PRODUCTO ===");

        Producto nuevo = new Producto(
            9, "Celular", "Tecnologia", 1200.0, 15
        );

        gestor.agregarProducto(nuevo);

        System.out.println("\n=== INTENTAR AGREGAR ID REPETIDO ===");

        Producto repetido = new Producto(
            9, "Tablet", "Tecnologia", 900.0, 10
        );

        gestor.agregarProducto(repetido);

        System.out.println("\n=== BUSCAR PRODUCTO EXISTENTE ===");

        Producto encontrado = gestor.buscarPorId(3);

        if (encontrado != null) {
            System.out.println(encontrado);
        } else {
            System.out.println("No se encontró el producto.");
        }

        System.out.println("\n=== BUSCAR PRODUCTO INEXISTENTE ===");

        Producto noEncontrado = gestor.buscarPorId(99);

        if (noEncontrado != null) {
            System.out.println(noEncontrado);
        } else {
            System.out.println("No se encontró el producto.");
        }

        System.out.println("\n=== LISTA FINAL ===");

        gestor.listar();
    }
}