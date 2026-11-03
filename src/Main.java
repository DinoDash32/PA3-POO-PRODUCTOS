public class Main {
    public static void main(String[] args) {

        GestorProductos gestor = new GestorProductos();

        // Cargar productos iniciales
        gestor.cargarDatosIniciales();

        System.out.println("=== PRODUCTOS INICIALES ===");
        gestor.listar();

        // PRUEBA 1: Agregar un producto nuevo
        System.out.println("\n=== AGREGAR PRODUCTO ===");

        Producto nuevo = new Producto(
            9, "Celular", "Tecnologia", 1200.0, 15
        );

        gestor.agregarProducto(nuevo);

        // PRUEBA 4: Intentar agregar un ID duplicado
        System.out.println("\n=== PROBAR ID DUPLICADO ===");

        Producto duplicado = new Producto(
            9, "Tablet", "Tecnologia", 900.0, 5
        );

        gestor.agregarProducto(duplicado);

        // PRUEBA 2: Buscar un producto existente
        System.out.println("\n=== BUSCAR PRODUCTO ID 9 ===");

        Producto encontrado = gestor.buscarPorId(9);

        if (encontrado != null) {
            System.out.println("Producto encontrado: " + encontrado);
        } else {
            System.out.println("Producto no encontrado.");
        }

        // PRUEBA 3: Buscar un ID inexistente
        System.out.println("\n=== BUSCAR PRODUCTO ID 99 ===");

        Producto noEncontrado = gestor.buscarPorId(99);

        if (noEncontrado != null) {
            System.out.println("Producto encontrado: " + noEncontrado);
        } else {
            System.out.println("Producto no encontrado.");
        }
    }
}