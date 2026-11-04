# PA3-POO-PRODUCTOS
Gestión de productos con ArrayList y Collections en Java

## Descripción del trabajo

Este proyecto es un programa en Java que gestiona productos en memoria usando colecciones. Elegimos productos porque tienen datos claros (id, nombre, categoría, precio y stock) y es un caso fácil de entender y de probar. El programa permite listar, agregar, buscar, eliminar y ordenar productos desde un menú en la consola.

## Menú interactivo y ejecución del sistema

Implementación de la interfaz de consola mediante un bucle `while` y una estructura `switch` que permite navegar fluidamente por las opciones del 0 al 6. Incluye validación de entradas con `Scanner` para evitar errores y llamadas correctas a todos los métodos desarrollados por el equipo.

Fabriccio Marticorena Colan (Integrante 4): Menú interactivo, validación de flujo de navegación y recopilación de evidencias del sistema.

## Cómo se guardan los datos

Los productos se guardan en un ArrayList<Producto> dentro de la clase GestorProductos. Cada producto es un objeto de la clase Producto, con su id, nombre, categoría, precio y stock.

Al iniciar, el método cargarDatosIniciales agrega 8 productos de ejemplo con add, y el método listar recorre la lista con un for para mostrarlos.

Usamos un ArrayList en lugar de un arreglo común porque crece solo cuando se agregan productos, y permite eliminar y ordenar con métodos ya hechos (remove y Collections.sort) sin manejar posiciones a mano.

- Donny Scrach Gaspar Araujo (Integrante 1): repositorio, clase Producto, lista inicial y listado de productos.

## Registro y búsqueda de productos

Método agregarProducto.

Este método recibe un objeto de tipo Producto y verifica que no exista otro producto con el mismo ID.
Para realizar esta comprobación utilizamos un ciclo for y una condición if.
Si el ID ya existe, el programa muestra un mensaje y no permite agregarlo.
Si el ID no existe, utilizamos el método add() de ArrayList para registrar el nuevo producto.

Método buscarPorId.

Este método recibe un identificador y recorre la lista de productos utilizando un ciclo for.
Compara el ID solicitado con el ID de cada producto. Si encuentra una coincidencia, devuelve el producto.
Si no encuentra ningún resultado, devuelve null.

- Flor de Venus Torres Condori (Integrante 2): agregarProducto y buscarPorId.

## Eliminar y ordenar productos

Para eliminar, el método `eliminarPorId` busca en la lista el producto con el id que se pide y, si lo encuentra, lo quita con `remove`. Devuelve `true` si pudo eliminarlo y `false` si el id no existe, así el menú le avisa al usuario qué pasó.

Para ordenar usamos `Collections.sort` con un `Comparator`, que es la regla para comparar dos productos. `ordenarPorPrecio` los deja de menor a mayor precio y `ordenarPorNombre` los deja en orden alfabético, sin importar si las letras son mayúsculas o minúsculas.

- Kathleen Carola Durand Quispe (Integrante 3): eliminar productos por id y ordenar la lista por precio y por nombre usando Collections.





## Evidencias
Las capturas de pantalla del funcionamiento y del código se guardarán en la carpeta `evidencias`.

## Integrantes
- Integrante 1: Donny Scrach Gaspar Araujo
- Integrante 2: Flor de Venus Torres Condori
- Integrante 3: Kathleen Carola Durand Quispe
- Integrante 4: Fabriccio Marticorena Colan
  
## Repositorio


## Video de exposición
