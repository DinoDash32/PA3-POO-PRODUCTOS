import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorProductos gestor = new GestorProductos();
        
        // Cargamos los datos iniciales de prueba
        gestor.cargarDatosIniciales();
        
        int opcion = -1;

        do {
            System.out.println("--------------------------------------------");
            System.out.println("----TIENDA - GESTIÓN DE PRODUCTOS (POO)----");
            System.out.println("--------------------------------------------");
            System.out.println("1. Ver todos los productos");
            System.out.println("2. Agregar un producto");
            System.out.println("3. Buscar un producto por ID");
            System.out.println("4. Eliminar un producto por ID");
            System.out.println("5. Ordenar productos por precio");
            System.out.println("6. Ordenar productos por nombre");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            // Validación por si el usuario ingresa texto en lugar de un número
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer de entrada

                switch (opcion) {
                    case 1:
                        System.out.println("\n--- LISTA DE PRODUCTOS ---");
                        gestor.listar();
                        break;

                    case 2:
                        System.out.println("\n--- AGREGAR NUEVO PRODUCTO ---");
                        System.out.print("Ingrese ID (número entero): ");
                        int id = scanner.nextInt();
                        scanner.nextLine(); // Limpiar buffer

                        System.out.print("Ingrese Nombre: ");
                        String nombre = scanner.nextLine();

                        System.out.print("Ingrese Categoría: ");
                        String categoria = scanner.nextLine();

                        System.out.print("Ingrese Precio (ej. 45.50): ");
                        double precio = scanner.nextDouble();

                        System.out.print("Ingrese Stock (número entero): ");
                        int stock = scanner.nextInt();
                        scanner.nextLine(); // Limpiar buffer

                        System.out.println("----------------------------------------");
                        // Crear el objeto producto y enviarlo al gestor (valida ID repetido)
                        Producto nuevoProducto = new Producto(id, nombre, categoria, precio, stock);
                        gestor.agregarProducto(nuevoProducto);
                        System.out.println("----------------------------------------");
                        break;

                    case 3:
                        System.out.println("\n--- BUSCAR PRODUCTO POR ID ---");
                        System.out.print("Ingrese el ID del producto a buscar: ");
                        int idBuscar = scanner.nextInt();
                        scanner.nextLine();

                        Producto encontrado = gestor.buscarPorId(idBuscar);
                        if (encontrado != null) {
                            System.out.println("¡Producto encontrado!");
                            System.out.println(encontrado);
                        } else {
                            System.out.println("No se encontró el producto con el ID " + idBuscar);
                        }
                        break;

                    case 4:
                        System.out.println("\n--- ELIMINAR PRODUCTO POR ID ---");
                        System.out.print("Ingrese el ID del producto a eliminar: ");
                        int idEliminar = scanner.nextInt();
                        scanner.nextLine();

                        boolean eliminado = gestor.eliminarPorId(idEliminar);
                        if (eliminado) {
                            System.out.println("El producto fue eliminado correctamente.");
                        } else {
                            System.out.println("No se pudo eliminar: el ID no existe.");
                        }
                        break;

                    case 5:
                        System.out.println("\n--- PRODUCTOS ORDENADOS POR PRECIO ---");
                        gestor.ordenarPorPrecio();
                        gestor.listar();
                        break;

                    case 6:
                        System.out.println("\n--- PRODUCTOS ORDENADOS POR NOMBRE ---");
                        gestor.ordenarPorNombre();
                        gestor.listar();
                        break;

                    case 0:
                        System.out.println("\nSaliendo del programa. ¡Hasta luego!");
                        break;

                    default:
                        System.out.println("\nOpción no válida. Por favor, elija un número entre 0 y 6.");
                }
            } else {
                System.out.println("\nError: Debe ingresar un número válido.");
                scanner.nextLine(); // Limpiar la entrada incorrecta
            }

        } while (opcion != 0);

        scanner.close();
    }
}